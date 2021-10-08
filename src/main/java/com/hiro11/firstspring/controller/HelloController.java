package com.hiro11.firstspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiro11.firstspring.model.*;



@RestController
public class HelloController {
	@Autowired //ติดต่อกับ Repo
	JokerRepo repo;
	
	@GetMapping("/hello")//กำหนด Path ที่จะเข้าหา Class นี้
	public String sayHello() {
		
		List<Joker> jokerList = repo.findAll();
		for(Joker j: jokerList){
			System.out.println(j.getName());
		}
		return "สวัสดี";
	}
}
