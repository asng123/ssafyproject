package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ZipBlockDto : 소개글 block 정보", description = "소개글의 상세 정보를 나타낸다.")
public class ImageDto {
	@ApiModelProperty(value = "번호 ")
	private int idx;
	@ApiModelProperty(value = "url")
	private String url;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "ImageDto [idx=" + idx + ", url=" + url + "]";
	}
	


}