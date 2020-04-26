package com.mss.learn.news;


import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {
	
	@Autowired
	RestTemplate restTemplate;
	
	public News getTopStories() {
		Results[] results = new Results[1];
		  
		News news=new News();
		String apiKey="PNYrpn9OMLlcz6gDyE2dcrdrcnuXmVac";
		String url="https://api.nytimes.com/svc/topstories/v2/science.json?api-key="+apiKey;
		
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);

	    HttpEntity<String> entity = new HttpEntity<String>(headers);
	    
		ResponseEntity<Map> ent= restTemplate.exchange(url, HttpMethod.GET, entity, Map.class);

		JSONObject jsonObject = new JSONObject(ent.getBody());
        JSONArray jsonArray = jsonObject.getJSONArray("results");
        
        news.setTitle(jsonArray.getJSONObject(0).get("title").toString());
        news.setSection(jsonArray.getJSONObject(0).get("section").toString());
        
		return news;
	}
}
