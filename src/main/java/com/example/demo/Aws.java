package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aws {
@ResponseBody
@RequestMapping("/app")	
public String app() {
		return "Welcome to spring boot application using jenkins" ;	
}
}
