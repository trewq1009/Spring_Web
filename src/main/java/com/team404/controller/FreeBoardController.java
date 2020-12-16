package com.team404.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team404.command.FreeBoardVO;
import com.team404.freeBoard.service.FreeBoardService;

@Controller
@RequestMapping("/freeBoard")
public class FreeBoardController {
	
	@Autowired
	@Qualifier("freeBoardService")
	private FreeBoardService freeBoardService;
	
	
	//글 목록
	@RequestMapping("/freeList")
	public String freeList() {
		
		return "freeBoard/freeList";
	}
	
	//글 등록
	@RequestMapping("/freeRegist")
	public String freeRegist() {
		return "freeBoard/freeRegist";
	}
	
	
	//글 등록
	@RequestMapping(value="/registForm", method=RequestMethod.POST)
	public String registForm(FreeBoardVO vo) {
		
		
		freeBoardService.regist(vo);	// insert실행
		
		
		return "redirect:/freeBoard/freeList";
	}
	
	
}
