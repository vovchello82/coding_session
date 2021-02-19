package com.synaos.codingsession.cocktailbar;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Here is our great cocktailbar app";
	}

}