package com.mahesh.sample.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {
	@RequestMapping("/greet/{name}")
	String greet(@PathVariable String name) {
		return "good morning "+name;
	}
}
