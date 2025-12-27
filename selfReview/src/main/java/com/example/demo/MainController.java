package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/infohigh")
	@ResponseBody
	public String hello() {
		return "정보고 파이팅! ";
	}
}
