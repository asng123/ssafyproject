package com.ssafy.vue.model.service;

import java.util.List;
import java.util.Map;

import com.ssafy.vue.model.MemberDto;

public interface MemberService {

	public MemberDto login(MemberDto memberDto) throws Exception;
	public MemberDto userInfo(String uid) throws Exception;
	public void saveRefreshToken(String uid, String refreshToken) throws Exception;
	public Object getRefreshToken(String uid) throws Exception;
	public void deleRefreshToken(String uid) throws Exception;
	void joinMember(MemberDto memberDto) throws Exception;
	
	/* Admin */
	List<MemberDto> listMember() throws Exception;
	MemberDto getMember(String uid) throws Exception;
	void updateMember(MemberDto memberDto) throws Exception;
	void deleteMember(String uid) throws Exception;
	
}
