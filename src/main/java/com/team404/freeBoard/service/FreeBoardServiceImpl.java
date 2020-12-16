package com.team404.freeBoard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team404.command.FreeBoardVO;
import com.team404.freeBoard.mapper.FreeBoardMapper;

@Service("freeBoardService")	// 이 패키지가 읽히는지 확인(컴포넌트스캔)
public class FreeBoardServiceImpl implements FreeBoardService {

	@Autowired
	private FreeBoardMapper freeBoardMapper;
	
	
	@Override
	public void regist(FreeBoardVO vo) {
		
		freeBoardMapper.regist(vo);
		
	}

}
