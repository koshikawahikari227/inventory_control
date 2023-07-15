package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class MenuController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@GetMapping("/menu")
	public String index(Model model) {

		return "menu";
	}
}