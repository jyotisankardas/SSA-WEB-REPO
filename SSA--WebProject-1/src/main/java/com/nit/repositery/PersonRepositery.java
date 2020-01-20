package com.nit.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nit.entity.PersonEntity;

@Repository
public interface PersonRepositery extends JpaRepository<PersonEntity, Integer> {
	
	@Query(value = "select stateCode from PersonEntity where ssNumber =:ssNumber")
	public String getStateCode(String ssNumber);

}
