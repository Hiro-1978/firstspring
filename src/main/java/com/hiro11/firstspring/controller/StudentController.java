package com.hiro11.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hiro11.firstspring.model.Joker;

@Controller //Controller แบบ ธรรมดา
@RequestMapping("/v1") // ต้องเรียกแบบ http://localhost:8080/v1/student แทน
public class StudentController {
	
	@GetMapping("/student")
		public String listStudent(Model model) {
		Joker joker = new Joker();
		joker.setName("ฝน");
		joker.setWeight(46.5f);
		model.addAttribute("joker", joker); //การส่งค่าในรูปแบบของ Object
		
		model.addAttribute("sname", "เค้ก ฝน");
		return "list";
	}
	
	@PostMapping("/student")
	public String add(@RequestParam("name") String name, @RequestParam("age") Integer age) {
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		return "success";				
	}
}
