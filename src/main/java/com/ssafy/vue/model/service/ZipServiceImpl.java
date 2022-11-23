package com.ssafy.vue.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.model.ZipBlockDto;
import com.ssafy.vue.model.ZipDto;
import com.ssafy.vue.model.mapper.ZipMapper;

@Service
public class ZipServiceImpl implements ZipService {
	
	@Autowired
	private SqlSession sqlSession;

//	@Override
//	public boolean writeArticle(BoardDto boardDto) throws Exception {
//		if(boardDto.getSubject() == null || boardDto.getContent() == null) {
//			throw new Exception();
//		}
//		return sqlSession.getMapper(BoardMapper.class).writeArticle(boardDto) == 1;
//	}

	@Override
	public boolean addZip(ZipDto zipDto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(zipDto);
		return sqlSession.getMapper(ZipMapper.class).addZip(zipDto) == 1;
	}

	@Override
	public boolean addZipBlock(ZipBlockDto zipBlockDto) throws Exception {
		return sqlSession.getMapper(ZipMapper.class).addZipBlock(zipBlockDto) == 1;
		
	}
}