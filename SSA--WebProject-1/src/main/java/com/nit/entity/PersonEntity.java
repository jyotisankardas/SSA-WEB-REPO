package com.nit.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PERSON_DETAILS_SSN")
public class PersonEntity {
	
	    @Id
		@Column(name = "PID", length = 9)
		@GeneratedValue
		private int pid;

		@Column(name = "FIRST_NAME", length = 20)
		private String firstName;

		@Column(name = "LAST_NAME", length = 20)
		private String lastName;

		@Column(name = "DATE_OF_BIRTH")
		private Date dob;

		@Column(name = "GENDER", length = 7)
		private char gender;

		@Column(name = "STATE_CODE", length = 20)
		private String stateCode;
		
		@Column(name="SS_NUMB",length=15)
		private String ssNumber;

	}



