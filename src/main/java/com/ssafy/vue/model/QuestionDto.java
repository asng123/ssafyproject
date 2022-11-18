package com.ssafy.vue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "QuestionDto : 1:1 문의 정보", description = "1:1문의글의 상세 정보를 나타낸다.")
public class QuestionDto {
	@ApiModelProperty(value = "문의번호")
	private int qid;
	@ApiModelProperty(value = "문의제목")
	private String subject;
	@ApiModelProperty(value = "문의내용")
	private String content;
	@ApiModelProperty(value = "답변내용")
	private String answer;
	@ApiModelProperty(value = "작성일")
	private String regtime;
	@ApiModelProperty(value = "작성자")
	private String uid;
	
	public int getQid() {
		return qid;
	}
	
	public void setQid(int qid) {
		this.qid = qid;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String getRegtime() {
		return regtime;
	}
	
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	@Override
	public String toString() {
		return "QuestionDto [qid=" + qid + ", subject=" + subject + ", content=" + content + ", answer=" + answer
				+ ", regtime=" + regtime + ", uid=" + uid + "]";
	}
	
	

}