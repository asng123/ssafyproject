package com.ssafy.vue.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.model.BoardDto;
import com.ssafy.vue.model.BoardParameterDto;
import com.ssafy.vue.model.ZipBlockDto;
import com.ssafy.vue.model.ZipDto;

@Mapper
public interface ZipMapper {
	public int addZip(ZipDto zipDto) throws Exception;

	public int addZipBlock(ZipBlockDto zipBlockDto) throws Exception;
}