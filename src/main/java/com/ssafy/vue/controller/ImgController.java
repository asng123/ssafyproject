package com.ssafy.vue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.vue.model.ImgDto;
import com.ssafy.vue.model.service.ImgService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "*" }, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.POST} , maxAge = 6000)
@RestController
@RequestMapping("/image")
public class ImgController {
	
	@Autowired
	private ImgService imgService;
	
	@ApiOperation(value = "img list", notes = " DB입력 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@GetMapping
	public ResponseEntity<List<ImgDto>> imgList() throws Exception {
		return new ResponseEntity<List<ImgDto>>(imgService.imgList(), HttpStatus.OK);
	}
	
}