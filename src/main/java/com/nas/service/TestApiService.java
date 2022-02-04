package com.nas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import apiTest.test.GetApi;
import apiTest.test.GetApi.SvcName;
import apiTest.vo.AreaBasedListResponse;
import apiTest.vo.RequestCommon;
import apiTest.vo.ResponseCommon;
import apiTest.vo.SearchFestivalResponse;

public class TestApiService {
	@Autowired
	GetApi api;
	
	public static void main(String[] args) {
		SvcName svcName = SvcName.ABL; 
		
		RequestCommon requestParam = (RequestCommon) svcName.requestObj();
		ResponseCommon responseParam = (ResponseCommon) svcName.responseObj();
		
		requestParam.setNumOfRows("2");
		requestParam.setPageNo("1");
		
		
		
		System.out.println(GetApi.playApi(requestParam, responseParam, svcName) );
		
		List<AreaBasedListResponse> responseParam2 = new ArrayList<AreaBasedListResponse>();
		responseParam2 = GetApi.playApi(requestParam, responseParam, svcName);
		
		for (AreaBasedListResponse aa : responseParam2) {
		System.out.println("contents Id "+aa.getContentid() );
		}
		

	}

}
