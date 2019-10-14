package com.lcq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.sym.Name;

@RestController
public class FeignController {

	@Autowired
	FeignTest feignTest;
	
	@GetMapping("/hello")
	public String Test(@RequestParam String name) {
		return feignTest.say(name)+"feign";
	} 
}
