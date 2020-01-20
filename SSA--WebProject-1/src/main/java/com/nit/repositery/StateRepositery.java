package com.nit.repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nit.entity.StateEntity;

@Repository
public interface StateRepositery extends JpaRepository<StateEntity, Integer> {
	
	@Query(value = "select stateName from StateEntity")
	public List<String> fetchAllStates();
	
	@Query(value = "select stateCode from StateEntity where stateName=:stateName")
	public String getStateCode(String stateName);
	
	
	

}
