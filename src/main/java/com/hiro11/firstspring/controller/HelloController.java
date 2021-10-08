package com.hiro11.firstspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")//กำหนด Path ที่จะเข้าหา Class นี้
	public String sayHello() {
		return "สวัสดี";
	}
}
