package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	/**
	 * @return result
	 */
	@RequestMapping("/helloWorld")
	@ResponseBody
	public String hello() {
		String result = "Hello World!!" ;
		return result;

	}
	
	/**
	 * @param name
	 * @return result
	 */
	@RequestMapping("/helloName")
	@ResponseBody
	public String helloName(@RequestParam(value = "name", defaultValue = "Yogesh!!")String name) {
		String result = "Hello "+name;
		return result;

	}
}
