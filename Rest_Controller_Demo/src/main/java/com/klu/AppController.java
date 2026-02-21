package com.klu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("demo1")
	
	public int fun1() {
		return 11;
	}
	@GetMapping("demo2")
	public String fun2() {
		return "Surya";
	}
	
	@GetMapping("/demo3/{a}/{b}")
	public int fun3(@PathVariable("a") int a, @PathVariable("b") int b ) {
		return a+b;
		
		
	}

}
