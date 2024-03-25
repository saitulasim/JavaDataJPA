package com.sathya.orm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDetails {
	

	private String FirstName;
	private String LastName;
	private String Email;
	private int Age;

}
