package com.ssafy.vue.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.model.ImgDto;
import com.ssafy.vue.model.mapper.ImgMapper;

@Service
public class ImgServiceImpl implements ImgService {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<ImgDto> imgList() throws Exception {
		return sqlSession.getMapper(ImgMapper.class).imgList();
	}

}