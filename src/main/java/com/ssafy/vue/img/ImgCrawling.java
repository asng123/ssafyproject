package com.ssafy.vue.img;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "*" }, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.POST} , maxAge = 6000)
@RestController
@RequestMapping("/image")
public class ImgCrawling {

	@ApiOperation(value = "게시판 글작성", notes = "새로운 게시글 정보를 입력한다. 그리고 DB입력 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@GetMapping
	public ResponseEntity<List<String>> crawling() throws Exception {
		System.out.println("dwqdq");
		StringBuilder url = new StringBuilder("https://search.naver.com/search.naver?where=image&sm=tab_jum&query=%EC%95%84%ED%8C%8C%ED%8A%B8+%EC%A1%B0%EA%B0%90%EB%8F%84");
		Document doc = Jsoup.connect(url.toString()).get();
		System.out.println(doc.select("img"));
		List<String> photos= doc.select("div.thumb img").eachAttr("src");
		System.out.println(photos.size());
		return new ResponseEntity<List<String>>(photos, HttpStatus.OK);
	}
	
}