package com.nit.model;

import java.sql.Date;

import lombok.Data;

@Data
public class PersonModel {


		private String firstName;

		private String lastName;

		private Date dob;

		private char gender;

		private String stateName;
}
