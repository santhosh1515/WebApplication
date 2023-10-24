package com.webApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApplicationController {
	
@GetMapping(path="/get")
public String get() {
	return "hellow";
}
}
