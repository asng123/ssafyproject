package com.ssafy.vue.model.service;

import java.util.List;

import com.ssafy.vue.model.BoardParameterDto;
import com.ssafy.vue.model.QuestionDto;

public interface QuestionService {
	public boolean writeQuestion(QuestionDto questionDto) throws Exception;
	public boolean writeAnswer(QuestionDto questionDto) throws Exception;
	public boolean deleteQuestion(int qid) throws Exception;
	public boolean updateQnA(QuestionDto questionDto) throws Exception;
	public List<QuestionDto> listQuestion(BoardParameterDto boardParameterDto) throws Exception;
	public QuestionDto questionDetail(int qid) throws Exception;
}
