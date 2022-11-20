package com.ssafy.vue.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.vue.model.BoardParameterDto;
import com.ssafy.vue.model.QuestionDto;
import com.ssafy.vue.model.service.QuestionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@CrossOrigin(origins = { "*" }, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.POST} , maxAge = 6000)
@RestController
@RequestMapping("/question")
@Api("1:1문의 컨트롤러  API V1")
public class QuestionController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	private QuestionService questionService;
	
	@ApiOperation(value = "문의 작성", notes = "새로운 문의글 입력한다. 그리고 DB입력 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PostMapping
	public ResponseEntity<String> writeQuestion(@RequestBody @ApiParam(value = "문의 정보.", required = true) QuestionDto questionDto) throws Exception {
		logger.info("writeQuestion - 호출");
		if (questionService.writeQuestion(questionDto)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@ApiOperation(value = "답변 작성", notes = "답변을 입력한다. 그리고 DB입력 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PutMapping("/answer")
	public ResponseEntity<String> writeAnswer(@RequestBody @ApiParam(value = "문의 정보.", required = true) QuestionDto questionDto) throws Exception {
		logger.info("writeAnswer- 호출");
		if (questionService.writeAnswer(questionDto)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@ApiOperation(value = "답변, 질문 수정", notes = "답변, 질문을 수정한다. 그리고 DB입력 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PutMapping("/updateqna")
	public ResponseEntity<String> updateQnA(@RequestBody @ApiParam(value = "문의 정보.", required = true) QuestionDto questionDto) throws Exception {
		logger.info("updateQnA - 호출");
		if (questionService.updateQnA(questionDto)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@ApiOperation(value = "문의 삭제", notes = "문의번호에 해당하는 문의 정보를 삭제한다. 그리고 DB삭제 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@DeleteMapping("/{qid}")
	public ResponseEntity<String> deleteQuestion(@PathVariable("qid") @ApiParam(value = "살제할 글의 글번호.", required = true) int qid) throws Exception {
		logger.info("deleteQuestion - 호출");
		if (questionService.deleteQuestion(qid)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@ApiOperation(value = "문의 글보기", notes = "문의번호에 해당하는 문의글의 정보를 반환한다.", response = QuestionDto.class)
	@GetMapping("/{qid}")
	public ResponseEntity<QuestionDto> questionDetail(@PathVariable("qid") @ApiParam(value = "얻어올 글의 글번호.", required = true) int qid) throws Exception {
		logger.info("questionDetail - 호출 : " + qid);
		return new ResponseEntity<QuestionDto>(questionService.questionDetail(qid), HttpStatus.OK);
	}
	
	@ApiOperation(value = "문의 글목록", notes = "모든 문의글의 정보를 반환한다.", response = List.class)
	@GetMapping
	public ResponseEntity<List<QuestionDto>> listQuestion(@ApiParam(value = "문의글을 얻기위한 부가정보.", required = true) BoardParameterDto boardParameterDto) throws Exception {
		logger.info("listQuestion - 호출");
		return new ResponseEntity<List<QuestionDto>>(questionService.listQuestion(boardParameterDto), HttpStatus.OK);
	}
}
