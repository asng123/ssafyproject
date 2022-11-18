package com.ssafy.vue.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.model.MemberDto;
import com.ssafy.vue.model.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public MemberDto login(MemberDto memberDto) throws Exception {
		if (memberDto.getUid() == null || memberDto.getPassword() == null)
			return null;
		return memberMapper.login(memberDto);
	}

	@Override
	public MemberDto userInfo(String uid) throws Exception {
		return memberMapper.userInfo(uid);
	}

	@Override
	public void saveRefreshToken(String uid, String refreshToken) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("uid", uid);
		map.put("token", refreshToken);
		memberMapper.saveRefreshToken(map);
	}

	@Override
	public Object getRefreshToken(String uid) throws Exception {
		return memberMapper.getRefreshToken(uid);
	}

	@Override
	public void deleRefreshToken(String uid) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("uid", uid);
		map.put("token", null);
		memberMapper.deleteRefreshToken(map);
	}

	@Override
	public void joinMember(MemberDto memberDto) throws Exception {
		memberMapper.joinMember(memberDto);
	}

	@Override
	public List<MemberDto> listMember() throws Exception {
		System.out.println("서비스도착!");
		List<MemberDto> list = memberMapper.listMember();
		System.out.println(list.size()+"21321");
		return list;
	}

	@Override
	public MemberDto getMember(String uid) throws Exception {
		return memberMapper.getMember(uid);
	}

	@Override
	public void updateMember(MemberDto memberDto) throws Exception {
		memberMapper.updateMember(memberDto);
	}

	@Override
	public void deleteMember(String uid) throws Exception {
		memberMapper.deleteMember(uid);
	}

}
