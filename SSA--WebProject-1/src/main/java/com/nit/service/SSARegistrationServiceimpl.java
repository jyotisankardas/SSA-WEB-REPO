package com.nit.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.PersonEntity;
import com.nit.model.PersonModel;
import com.nit.repositery.PersonRepositery;
import com.nit.repositery.StateRepositery;

@Service
public class SSARegistrationServiceimpl implements SSARegistrationService {

	@Autowired
	private StateRepositery srepo;

	@Autowired
	private PersonRepositery prepo;

	@Override
	public List<String> getAllStates() {
		return srepo.fetchAllStates();
	}

	public PersonEntity savePersonDetails(PersonModel pmodel) {
		PersonEntity entity = new PersonEntity();
		if (pmodel != null) {
			BeanUtils.copyProperties(pmodel, entity);
			entity.setSsNumber(generateRandomInt(1234567892));
			entity.setStateCode(srepo.getStateCode(pmodel.getStateName()));
		}
			return prepo.save(entity);
		
			
		}
	public static String generateRandomInt(int upperRange){
	    Random random = new Random();
	     Integer nextInt = random.nextInt(upperRange);
	     String ssno=String.valueOf(nextInt);
	     StringBuffer buffer=new StringBuffer(ssno);
	    buffer.insert(3, "-");
	     buffer.insert(6, "-");
	     return buffer.toString();
	     
	}
	
	public String getStateName(String ssnum) {
		return prepo.getStateCode(ssnum);
	}

	}


