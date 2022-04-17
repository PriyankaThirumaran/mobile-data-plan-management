package com.airtel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airtel.domain.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {
	
	//FETCHING ALL PLANS (findAll() method)
	
	//FETCHING A PLAN (findByPlanId(Integer planId) method)
	public Plan findByPlanId(Integer planId);

}
