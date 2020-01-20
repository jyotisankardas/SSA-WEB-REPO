package com.nit.service;

import java.util.List;

import com.nit.entity.PersonEntity;
import com.nit.model.PersonModel;

public interface SSARegistrationService {
	
	
	
	public List<String> getAllStates();
	
	public PersonEntity savePersonDetails(PersonModel pmodel);
	
	public String getStateName(String ssnum);


}
