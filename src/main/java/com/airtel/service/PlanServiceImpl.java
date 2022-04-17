package com.airtel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airtel.domain.Plan;
import com.airtel.repository.PlanRepository;

@Service("planService")
public class PlanServiceImpl implements PlanService{
	
	@Autowired
	private PlanRepository planRepository;
	
	//FETCHING All PLANS
	public List<Plan> fetchPlans() {
		return planRepository.findAll();
	}
	
	//FETCHING A PLAN
	public Plan fetchPlan(Integer planId) {
		return planRepository.findByPlanId(planId);
	}
}
