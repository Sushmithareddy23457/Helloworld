package com.mindtree.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloworldController {
	@GetMapping(value="/")
	public String index() {
		return "Hello World";
	}
}
