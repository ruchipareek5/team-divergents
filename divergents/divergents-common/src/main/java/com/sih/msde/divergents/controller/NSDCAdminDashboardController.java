package com.sih.msde.divergents.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sih.msde.divergents.common.Privilege;

@RestController
public class NSDCAdminDashboardController {

	@Privilege(value={"NSDC"})
	@RequestMapping("/chartone")
	public void getDataForChartOne(){
		
	}
}
