package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ZipDto : 소개글정보", description = "소개글의 요약 정보를 나타낸다.")
public class ZipListDto {
	@ApiModelProperty(value = "소개글번호")
	private String zid;
	@ApiModelProperty(value = "작성자")
	private String uid;
	@ApiModelProperty(value = "소개제목내용")
	private String content;
	@ApiModelProperty(value = "소개요약내용")
	private String summary;
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
	@ApiModelProperty(value = "아파트이름")
	private String aptname;
	@ApiModelProperty(value = "지역코드")
	private String regcode;
	@ApiModelProperty(value = "block 타입")
	private String type;
	@ApiModelProperty(value = "글내용")
	private String blockcontent;
	@ApiModelProperty(value = "주소")
	private String blockaddress;
	@ApiModelProperty(value = "블락위도")
	private String blocklat;
	@ApiModelProperty(value = "블락경도")
	private String blocklng;
	@ApiModelProperty(value = "장소 이름")
	private String place;
	@ApiModelProperty(value = "순서")
	private int order;
	@ApiModelProperty(value = "블락요약")
	private String blocksummary;
	
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getBlocklat() {
		return blocklat;
	}
	public void setBlocklat(String blocklat) {
		this.blocklat = blocklat;
	}
	public String getBlocklng() {
		return blocklng;
	}
	public void setBlocklng(String blocklng) {
		this.blocklng = blocklng;
	}
	public String getBlocksummary() {
		return blocksummary;
	}
	public void setBlocksummary(String blocksummary) {
		this.blocksummary = blocksummary;
	}
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
	public String getAptname() {
		return aptname;
	}
	public void setAptname(String aptname) {
		this.aptname = aptname;
	}
	public String getRegcode() {
		return regcode;
	}
	public void setRegcode(String regcode) {
		this.regcode = regcode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBlockcontent() {
		return blockcontent;
	}
	public void setBlockcontent(String blockcontent) {
		this.blockcontent = blockcontent;
	}
	public String getBlockaddress() {
		return blockaddress;
	}
	public void setBlockaddress(String blockaddress) {
		this.blockaddress = blockaddress;
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
		return "ZipListDto [zid=" + zid + ", uid=" + uid + ", content=" + content + ", hit=" + hit + ", regtime="
				+ regtime + ", edittime=" + edittime + ", address=" + address + ", lat=" + lat + ", lng=" + lng
				+ ", price=" + price + ", aptname=" + aptname + ", regcode=" + regcode + ", type=" + type
				+ ", blockcontent=" + blockcontent + ", blockaddress=" + blockaddress + ", place=" + place + ", order="
				+ order + "]";
	}
	
	

}