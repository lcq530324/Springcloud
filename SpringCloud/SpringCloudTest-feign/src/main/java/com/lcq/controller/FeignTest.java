package com.lcq.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider")
public interface FeignTest {

	@RequestMapping(value = "/name",method = RequestMethod.GET)
	String say(@RequestParam(value = "name") String name);
}
