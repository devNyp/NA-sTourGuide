package com.nas.tourGuide.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import apiTest.test.GetApi;
import apiTest.test.GetApi.SvcName;
import apiTest.vo.RequestCommon;
import apiTest.vo.ResponseCommon;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		SvcName svcName= SvcName.ABL;
		RequestCommon requestParam = (RequestCommon) svcName.requestObj();
		ResponseCommon responseParam = (ResponseCommon) svcName.responseObj();
		
		requestParam.setNumOfRows("2");
		requestParam.setPageNo("1");
		
		model.addAttribute("list", GetApi.playApi(requestParam, responseParam, svcName));
		
		return "home";
	}
	
}
