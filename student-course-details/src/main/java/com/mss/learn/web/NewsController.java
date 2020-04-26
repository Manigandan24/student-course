package com.mss.learn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mss.learn.news.News;
import com.mss.learn.news.NewsService;

@RestController
@RequestMapping(path="/api")
public class NewsController {

	@Autowired
	NewsService newsService;
	
	@GetMapping(value = "ping")
	public String getStatus() throws Exception {
		return "up and running";
	}

	@GetMapping(value = "news/topstories")
	public News getNews() throws Exception {
		System.out.println("------print------");
		return newsService.getTopStories();
	}

}
