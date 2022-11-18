package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ZipBlockDto : 소개글 block 정보", description = "소개글의 상세 정보를 나타낸다.")
public class ZipBlockDto {
	@ApiModelProperty(value = "block 번호")
	private int zbid;
	@ApiModelProperty(value = "block 타입")
	private int type;
	@ApiModelProperty(value = "글내용")
	private String content;
	@ApiModelProperty(value = "Zip위치")
	private int zid;
	
	public int getZbid() {
		return zbid;
	}
	
	public void setZbid(int zbid) {
		this.zbid = zbid;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getZid() {
		return zid;
	}
	
	public void setZid(int zid) {
		this.zid = zid;
	}

	@Override
	public String toString() {
		return "ZipBlockDto [zbid=" + zbid + ", type=" + type + ", content=" + content + ", zid=" + zid + "]";
	}

}