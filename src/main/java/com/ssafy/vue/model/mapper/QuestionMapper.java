package com.ssafy.vue.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.vue.model.BoardParameterDto;
import com.ssafy.vue.model.QuestionDto;

@Mapper
public interface QuestionMapper {
	
	public int writeQuestion(QuestionDto questionDto) throws SQLException;
	public int writeAnswer(QuestionDto questionDto) throws Exception;
	public int deleteQuestion(int qid) throws SQLException;
	public int updateQnA(QuestionDto questionDto) throws SQLException;
	public List<QuestionDto> listQuestion(BoardParameterDto boardParameterDto) throws Exception;
	public QuestionDto questionDetail(int qid) throws Exception;
}
