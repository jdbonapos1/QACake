package com.qa.cake.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.cake.domain.Cake;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc 

public class CakeControllerIntegrationTest2 {

	@Autowired 
	private MockMvc mvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Test
	void testCreate()throws Exception {
		Cake testCake = new Cake(null, "Red Velvet", "These are the ingredients", "https://cafedelites.com/wp-content/uploads/2018/05/Red-Velvet-Cake-IMAGE-43.jpg");
		String testCakeAsJSON = this.mapper.writeValueAsString(testCake);
	RequestBuilder req = post("/create").contentType(MediaType.APPLICATION_JSON).content(testCakeAsJSON);
	
	Cake testCreatedCake = new Cake( "Red Velvet", "These are the ingredients", "https://cafedelites.com/wp-content/uploads/2018/05/Red-Velvet-Cake-IMAGE-43.jpg");
	String testCreatedCakeAsJSON = this.mapper.writeValueAsString(testCreatedCake);
	
	ResultMatcher checkStatus = status().isCreated();
	ResultMatcher checkBody = content().json(testCreatedCakeAsJSON);
	
	this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	
	}
	
}