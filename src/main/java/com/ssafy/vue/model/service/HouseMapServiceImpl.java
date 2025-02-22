package com.ssafy.vue.model.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.vue.model.AptInfoDto;
import com.ssafy.vue.model.HouseInfoDto;
import com.ssafy.vue.model.SidoGugunCodeDto;
import com.ssafy.vue.model.mapper.HouseMapMapper;

@Service
public class HouseMapServiceImpl implements HouseMapService {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<SidoGugunCodeDto> getSido() throws Exception {
		return sqlSession.getMapper(HouseMapMapper.class).getSido();
	}

	@Override
	public List<SidoGugunCodeDto> getGugunInSido(String sido) throws Exception {
		return sqlSession.getMapper(HouseMapMapper.class).getGugunInSido(sido);
	}

	@Override
	public List<HouseInfoDto> getDongInGugun(String gugun) throws Exception {
		return sqlSession.getMapper(HouseMapMapper.class).getDongInGugun(gugun);
	}

	@Override
	public List<HouseInfoDto> getAptInDong(String dong) throws Exception {
		return sqlSession.getMapper(HouseMapMapper.class).getAptInDong(dong);
	}
//
//	@Override
//	public List<HouseInfoDto> getAptInDongNDongName(Map<String, Object> paramMap) throws Exception {
//		return sqlSession.getMapper(HouseMapMapper.class).getAptInDongNDongName(paramMap);
//	}

	@Override
	public List<AptInfoDto> getAptInfos(Map<String, Object> paramMap) throws Exception {
		return sqlSession.getMapper(HouseMapMapper.class).getAptInfos(paramMap);
	}

	@Override
	public List<AptInfoDto> getAptInfo(Map<String, Object> paramMap) throws Exception{
		return sqlSession.getMapper(HouseMapMapper.class).getAptInfo(paramMap);
	}
}
