package com.course.practicaljava.api.server;

import java.time.LocalTime;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DefaultRestApi {

	@RequestMapping(value = "/welcome")
	public String welcome() {
		System.out.print(StringUtils.join("Hello", " this is", " Spring boot123"));
		return "Welcome to Spring Boot";
	}
	
	@GetMapping(value = "/time")
	public String time() {
		return LocalTime.now().toString();
	}
}
