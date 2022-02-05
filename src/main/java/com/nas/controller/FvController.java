package com.nas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nas.service.FvService;

@RequestMapping(value = "SFV/")
@Controller
public class FvController {
	@Autowired
	FvService fs;	
	
	@GetMapping(value = "/sfv/")
	public String searchFestivalList(Model model, @RequestParam String page, @RequestParam String location ) {
		model.addAllAttributes(fs.getAll(page, location));
		return "nasfv01";
	}
}
