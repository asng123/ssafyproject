package com.ssafy.vue.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.vue.model.ZipBlockDto;
import com.ssafy.vue.model.ZipDto;
import com.ssafy.vue.model.service.ZipService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/zip")
@CrossOrigin(origins = { "*" }, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.POST} , maxAge = 6000)
@Api("Map 컨트롤러  API V1")
public class ZipController {

	private final Logger logger = LoggerFactory.getLogger(ZipController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	private ZipService zipService;
	
	@ApiOperation(value = "내집 글", notes ="내집 글 저장", response = List.class)
	@PostMapping("/write")
	public ResponseEntity<?> addZip(@RequestBody ZipDto zipDto) throws Exception {
		logger.info("zip - 저장 {}",zipDto);
		Map<String, Object> resultMap = new HashMap<>();
		try {
			System.out.println(zipDto);
			zipService.addZip(zipDto);
			resultMap.put("message", SUCCESS);
			return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("zip -에러 {}",e);
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@ApiOperation(value = "내집 글", notes ="내집 글 저장", response = List.class)
	@PostMapping("/blockwrite")
	public ResponseEntity<?> addZipBlock(@RequestBody ZipBlockDto zipBlockDto) throws Exception {
		logger.info("zip block - 저장 {}",zipBlockDto);
		Map<String, Object> resultMap = new HashMap<>();
		try {
			zipService.addZipBlock(zipBlockDto);
			resultMap.put("message", SUCCESS);
			return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("zip block -에러 {}",e);
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
