package com.example.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {
	/*
	 * fragment test
	 */
	@GetMapping("/fragment")
	public String template() {
		return "fragment/fragmentMain";
	}
}
