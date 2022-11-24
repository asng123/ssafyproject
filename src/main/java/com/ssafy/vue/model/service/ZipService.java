package com.ssafy.vue.model.service;

import java.util.List;
import java.util.Map;

import com.ssafy.vue.model.ZipBlockDto;
import com.ssafy.vue.model.ZipDto;
import com.ssafy.vue.model.ZipListDto;

public interface ZipService {
	public boolean addZip(ZipDto zipDto) throws Exception;
	List<ZipListDto> zipList(Map<String, Object> ParamMap) throws Exception;
	List<ZipListDto> zipDetail(String zid) throws Exception;
	List<ZipListDto> sideList(Map<String, Object> ParamMap) throws Exception;
	List<ZipListDto> allList() throws Exception;
	
	public boolean addZipBlock(ZipBlockDto zipBlockDto) throws Exception;
	public void hitPlus(String zid) throws Exception;
}