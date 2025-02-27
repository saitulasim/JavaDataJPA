package com.sathya.orm.mapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sathya.orm.entity.Person;
import com.sathya.orm.model.PersonDetails;

@Component
public class PersonMapper {
public Person modelToEntityConversion(PersonDetails personDetails) {
	Person person = new Person();
person.setFirstName(personDetails.getFirstName());
person.setLastName(personDetails.getLastName());
person.setEmail(personDetails.getEmail());
person.setAge(personDetails.getAge());
person.setCreateAt(LocalDateTime.now());
person.setCreateBy(System.getProperty("user.name"));
	return person;
}
	public List<Person> modelToListConversion(List<PersonDetails> proDetails) {
		List<Person> persons = new ArrayList<Person>();
		for(PersonDetails details : proDetails)
		{
			Person person = new Person();
			person.setFirstName(details.getFirstName());
			person.setLastName(details.getLastName());
			person.setEmail(details.getEmail());
			person.setAge(details.getAge());
			person.setCreateAt(LocalDateTime.now());
			person.setCreateBy(System.getProperty("user.name"));
			persons.add(person);
				
		}
		return persons;
		
}
}
