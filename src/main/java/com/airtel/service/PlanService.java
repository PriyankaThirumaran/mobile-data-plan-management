package com.airtel.service;

import java.util.List;

import com.airtel.domain.Plan;

public interface PlanService {
	
	//FETCHING ALL PLANS
	public List<Plan> fetchPlans();
	
	//FETCHING A PLAN
	public Plan fetchPlan(Integer planId);
}
