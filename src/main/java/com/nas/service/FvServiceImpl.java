package com.nas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import apiTest.test.GetApi;
import apiTest.test.GetApi.SvcName;
import apiTest.vo.RequestCommon;
import apiTest.vo.ResponseCommon;

@Service
public class FvServiceImpl implements FvService{

	@Override
	public <T> List<T> getAll(String page, String location) {
		SvcName svcName = SvcName.SFV; 
		
		RequestCommon requestParam = (RequestCommon) svcName.requestObj();
		ResponseCommon responseParam = (ResponseCommon) svcName.responseObj();
		
		requestParam.setNumOfRows("8");
		requestParam.setPageNo(page);	
		
		
		return GetApi.playApi(requestParam, responseParam, svcName);
	}

}
