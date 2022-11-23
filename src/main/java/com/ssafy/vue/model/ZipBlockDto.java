package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ZipBlockDto : 소개글 block 정보", description = "소개글의 상세 정보를 나타낸다.")
public class ZipBlockDto {
	@ApiModelProperty(value = "block 번호")
	private String zbid;
	@ApiModelProperty(value = "block 타입")
	private String type;
	@ApiModelProperty(value = "글내용")
	private String content;
	@ApiModelProperty(value = "Zip위치")
	private String zid;
	@ApiModelProperty(value = "주소")
	private String address;
	@ApiModelProperty(value = "장소 이름")
	private String place;
	@ApiModelProperty(value = "순서")
	private int order;
	
	public String getZbid() {
		return zbid;
	}
	public void setZbid(String zbid) {
		this.zbid = zbid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getZid() {
		return zid;
	}
	public void setZid(String zid) {
		this.zid = zid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "ZipBlockDto [zbid=" + zbid + ", type=" + type + ", content=" + content + ", zid=" + zid + ", address="
				+ address + ", place=" + place + ", order=" + order + "]";
	}
	


}