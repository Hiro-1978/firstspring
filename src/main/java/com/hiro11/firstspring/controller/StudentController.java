package com.hiro11.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hiro11.firstspring.model.Joker;

@Controller //Controller แบบ ธรรมดา
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
}
