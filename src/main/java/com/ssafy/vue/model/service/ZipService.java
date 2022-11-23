package com.ssafy.vue.model.service;

import java.util.List;

import com.ssafy.util.PageNavigation;
import com.ssafy.vue.model.BoardDto;
import com.ssafy.vue.model.BoardParameterDto;
import com.ssafy.vue.model.ZipBlockDto;
import com.ssafy.vue.model.ZipDto;

public interface ZipService {
	public boolean addZip(ZipDto zipDto) throws Exception;

	public boolean addZipBlock(ZipBlockDto zipBlockDto) throws Exception;
}