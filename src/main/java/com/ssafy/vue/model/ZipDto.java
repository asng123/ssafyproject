package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ZipDto : 소개글정보", description = "소개글의 요약 정보를 나타낸다.")
public class ZipDto {
	@ApiModelProperty(value = "소개글번호")
	private String zid;
	@ApiModelProperty(value = "작성자")
	private String uid;
	@ApiModelProperty(value = "소개요약내용")
	private String content;
	@ApiModelProperty(value = "조회수")
	private int hit;
	@ApiModelProperty(value = "작성일")
	private String regtime;
	@ApiModelProperty(value = "수정일")
	private String edittime;
	@ApiModelProperty(value = "주소")
	private String address;
	@ApiModelProperty(value = "위도")
	private String lat;
	@ApiModelProperty(value = "경도")
	private String lng;
	@ApiModelProperty(value = "가격")
	private int price;
	@ApiModelProperty(value = "장소 이")
	private String place;
	public String getZid() {
		return zid;
	}
	public void setZid(String zid) {
		this.zid = zid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	public String getEdittime() {
		return edittime;
	}
	public void setEdittime(String edittime) {
		this.edittime = edittime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "ZipDto [zid=" + zid + ", uid=" + uid + ", content=" + content + ", hit=" + hit + ", regtime=" + regtime
				+ ", edittime=" + edittime + ", address=" + address + ", lat=" + lat + ", lng=" + lng + ", price="
				+ price + ", place=" + place + "]";
	}
	
	

}