package com.ssafy.vue.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.model.ZipBlockDto;
import com.ssafy.vue.model.ZipDto;
import com.ssafy.vue.model.ZipListDto;

@Mapper
public interface ZipMapper {
	public int addZip(ZipDto zipDto) throws Exception;
	List<ZipListDto> zipList(Map<String, Object> ParamMap) throws Exception;
	List<ZipListDto> zipDetail(String zid) throws Exception;
	List<ZipListDto> sideList(Map<String, Object> ParamMap) throws Exception;
	List<ZipListDto> allList() throws Exception;

	public int addZipBlock(ZipBlockDto zipBlockDto) throws Exception;
	public void hitPlus(String zid) throws Exception;

}