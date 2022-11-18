package com.ssafy.vue.model.service;

import com.ssafy.vue.model.MemberDto;

public interface MemberService {

	public MemberDto login(MemberDto memberDto) throws Exception;
	public MemberDto userInfo(String uid) throws Exception;
	public void saveRefreshToken(String uid, String refreshToken) throws Exception;
	public Object getRefreshToken(String uid) throws Exception;
	public void deleRefreshToken(String uid) throws Exception;
	
}
