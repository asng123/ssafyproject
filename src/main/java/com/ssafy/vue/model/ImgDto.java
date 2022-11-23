package com.ssafy.vue.model;

import io.swagger.annotations.ApiModelProperty;

public class ImgDto {
	@ApiModelProperty(value = "url")
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
