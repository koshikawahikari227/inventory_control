package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
@RequestMapping()
public class OutputController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@GetMapping("/output")
	public String index() {

		return "output";
	}

	@PostMapping("/")
	public String handleFormSubmit(@RequestParam("codeValue") int codeValue,Model model) {

	    String sql = "select * from inventory_status where stock_code = ?";
	    EntityRowMapper entityRowMapper = new EntityRowMapper();
	    int stockQuantity = jdbcTemplate.queryForObject(sql, entityRowMapper, codeValue).getStockQuantity();
		model.addAttribute("stockQuantity", stockQuantity); 
	    return "output";
	}
}