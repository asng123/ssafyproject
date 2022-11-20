package com.ssafy.vue.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.vue.model.BoardParameterDto;
import com.ssafy.vue.model.QuestionDto;
import com.ssafy.vue.model.mapper.QuestionMapper;

@Service
public class QuestionServiceImpl implements QuestionService{
	@Autowired
	private SqlSession sqlSession;

	@Override
	public boolean writeQuestion(QuestionDto questionDto) throws Exception {
		if(questionDto.getSubject() == null || questionDto.getContent() == null) {
			throw new Exception();
		}
		return sqlSession.getMapper(QuestionMapper.class).writeQuestion(questionDto) == 1;
	}

	@Override
	public boolean writeAnswer(QuestionDto questionDto) throws Exception {
		if(questionDto.getAnswer() == null) {
			throw new Exception();
		}
		return sqlSession.getMapper(QuestionMapper.class).writeAnswer(questionDto) == 1;
	}

	@Override
	public boolean deleteQuestion(int qid) throws Exception {
		return sqlSession.getMapper(QuestionMapper.class).deleteQuestion(qid) == 1;
	}

	@Override
	public boolean updateQnA(QuestionDto questionDto) throws Exception {
		return sqlSession.getMapper(QuestionMapper.class).updateQnA(questionDto) == 1;
	}

	@Override
	public List<QuestionDto> listQuestion(BoardParameterDto boardParameterDto) throws Exception {
		int start = boardParameterDto.getPg() == 0 ? 0 : (boardParameterDto.getPg() - 1) * boardParameterDto.getSpp();
		boardParameterDto.setStart(start);
		return sqlSession.getMapper(QuestionMapper.class).listQuestion(boardParameterDto);
	}

	@Override
	public QuestionDto questionDetail(int qid) throws Exception {
		System.out.println("detail 전");
		QuestionDto q = sqlSession.getMapper(QuestionMapper.class).questionDetail(qid);
		System.out.println("detail 됨");
		return q;
	}
}
