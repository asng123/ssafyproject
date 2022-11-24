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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.vue.model.ImageDto;
import com.ssafy.vue.model.ZipBlockDto;
import com.ssafy.vue.model.ZipDto;
import com.ssafy.vue.model.ZipListDto;
import com.ssafy.vue.model.service.ZipService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

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
	
	@ApiOperation(value = "내집소개목록", notes = "내집소개 <big>전체 목록</big>을 반환해 줍니다.")
	@ApiResponses({ @ApiResponse(code = 200, message = "소개목록 OK!!"), @ApiResponse(code = 404, message = "페이지없어!!"),
			@ApiResponse(code = 500, message = "서버에러!!") })
	@GetMapping(value = "/list")
	public ResponseEntity<?> zipList(@RequestParam("dong") String regcode, @RequestParam("aptname") String aptname ) {
		logger.debug("zipList call");
		Map<String, Object> resultMap = new HashMap<>();
		Map<String, Object> ParamMap = new HashMap<>();
		ParamMap.put("regcode",  regcode);
		ParamMap.put("aptname",  aptname);
		try {
			logger.debug("zipList before run");
			List<ZipListDto> zips = zipService.zipList(ParamMap);
			resultMap.put("zips",  zips);
			resultMap.put("message", SUCCESS);
			if (zips != null && !zips.isEmpty()) {
				logger.debug("zips return");
				return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
			} else {
				logger.debug("zips null");
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			logger.debug("zips catch {}",e);
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@ApiOperation(value = "내집소개디테일", notes = "내집소개 <big>디테일</big>을 반환해 줍니다.")
	@ApiResponses({ @ApiResponse(code = 200, message = "소개목록 OK!!"), @ApiResponse(code = 404, message = "페이지없어!!"),
			@ApiResponse(code = 500, message = "서버에러!!") })
	@GetMapping("/detail")
	public ResponseEntity<?> zipDetail(@RequestParam("zid") String zid) {
		System.out.println("zip detail start");
		System.out.println(zid);
		logger.debug("zipDetail call {}",zid);
		Map<String, Object> resultMap = new HashMap<>();
//		Map<String, Object> ParamMap = new HashMap<>();
//		ParamMap.put("regcode",  regcode);
//		ParamMap.put("aptname",  aptname);
//		ParamMap.put("zid",  zid);
		
		try {
			zipService.hitPlus(zid);
			logger.debug("zipDetail before run");
			List<ZipListDto> zips = zipService.zipDetail(zid);
			resultMap.put("zips",  zips);
			resultMap.put("message", SUCCESS);
			if (zips != null && !zips.isEmpty()) {
				logger.debug("zipDetail return");
				return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
			} else {
				logger.debug("zipDetail null");
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			logger.debug("zipDetail catch");
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@ApiOperation(value = "내집소개목록", notes = "내집소개 <big>전체 목록</big>을 반환해 줍니다.")
	@ApiResponses({ @ApiResponse(code = 200, message = "소개목록 OK!!"), @ApiResponse(code = 404, message = "페이지없어!!"),
			@ApiResponse(code = 500, message = "서버에러!!") })
	@GetMapping(value = "/sidelist")
	public ResponseEntity<?> sideList(@RequestParam("dong") String regcode, @RequestParam("aptname") String aptname) {
		logger.debug("zipList call");
		Map<String, Object> resultMap = new HashMap<>();
		Map<String, Object> ParamMap = new HashMap<>();
		ParamMap.put("regcode",  regcode);
		ParamMap.put("aptname",  aptname);
		try {
			logger.debug("zipList before run");
			List<ZipListDto> zips = zipService.sideList(ParamMap);
			resultMap.put("zips",  zips);
			resultMap.put("message", SUCCESS);
			if (zips != null && !zips.isEmpty()) {
				logger.debug("zips return");
				return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
			} else {
				logger.debug("zips null");
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			logger.debug("zips catch {}",e);
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@ApiOperation(value = "내집소개모든목록", notes = "내집소개 <big>전체 목록</big>을 반환해 줍니다.")
	@ApiResponses({ @ApiResponse(code = 200, message = "소개목록 OK!!"), @ApiResponse(code = 404, message = "페이지없어!!"),
			@ApiResponse(code = 500, message = "서버에러!!") })
	@GetMapping(value = "/alllist")
	public ResponseEntity<?> allList() {
		logger.debug("allList call");
		Map<String, Object> resultMap = new HashMap<>();
		try {
			logger.debug("allList before run");
			List<ZipListDto> zips = zipService.allList();
			resultMap.put("zips",  zips);
			resultMap.put("message", SUCCESS);
			if (zips != null && !zips.isEmpty()) {
				logger.debug("zips return");
				return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
			} else {
				logger.debug("zips null");
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			logger.debug("zips catch {}",e);
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@ApiOperation(value = "이미지 가져오기 ", notes = "idx에 맞는 이미지 url을 반환시켜줍니다.")
	@ApiResponses({ @ApiResponse(code = 200, message = "이미지 OK!!"), @ApiResponse(code = 404, message = "페이지없어!!"),
			@ApiResponse(code = 500, message = "서버에러!!") })
	@GetMapping(value = "/imageurl")
	public ResponseEntity<?> getImageUrl(@RequestParam("idx") int idx) {
		logger.debug("imageurl call {}",idx);
		Map<String, Object> resultMap = new HashMap<>();
		try {
			logger.debug("imageurl before run");
			ImageDto image = zipService.getImageUrl(idx);
			resultMap.put("imageurl",  image);
			resultMap.put("message", SUCCESS);
			if (image != null ) {
				logger.debug("imageurl return");
				return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
			} else {
				logger.debug("imageurl null");
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			logger.debug("imageurl catch {}",e);
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
