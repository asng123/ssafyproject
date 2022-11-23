package com.ssafy.vue.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.model.ImgDto;

@Mapper
public interface ImgMapper {
	
	public List<ImgDto> imgList() throws SQLException;
	
}