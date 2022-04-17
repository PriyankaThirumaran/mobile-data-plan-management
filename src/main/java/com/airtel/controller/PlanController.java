package com.airtel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airtel.domain.Plan;
import com.airtel.service.PlanServiceImpl;

@RestController
@RequestMapping("/plan")
public class PlanController {
	
	@Autowired
	private PlanServiceImpl planService;
	
	//FETCHING ALL PLANS
	@GetMapping(produces = "application/json")
	public List<Plan> fetchPlans() {
		List<Plan> plans = planService.fetchPlans();
		return plans;
	}
}

