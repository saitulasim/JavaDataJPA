package com.sathya.orm.mapper;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sathya.orm.entity.Person;
import com.sathya.orm.model.PersonDetails;
import com.sathya.orm.repository.PersonRepository;

@Component
	public class PersonClient implements CommandLineRunner {
	@Autowired
	PersonRepository personRepository;
	@Autowired
	PersonMapper mapper;

		@Override
		public void run(String... args) throws Exception {
			//model class data : having the values
			PersonDetails personDetails = new PersonDetails();
			personDetails.setFirstName("Tinku");
			personDetails.setLastName("Tinku");
			personDetails.setEmail("tinku@gmail.com");
			personDetails.setAge(16);
			//conversion of model class data to entity
			Person person = mapper.modelToEntityConversion(personDetails);
			personRepository.save(person);
			PersonDetails p1 = new PersonDetails();
			p1.setFirstName("ms");
			p1.setLastName("dhoni");
			p1.setEmail("dhoni@gmail.cpm");
			p1.setAge(44);
			PersonDetails p2 = new PersonDetails();
			p2.setFirstName("virat");
			p2.setLastName("kohili");
			p2.setEmail("virat@gmail.com");
			p2.setAge(34);
			List<PersonDetails> proDetails = List.of(p1,p2);
			//conversion process
			List<Person> person1 = mapper.modelToListConversion(proDetails);
			personRepository.saveAll(person1);
			Optional<Person> optional = personRepository.findById(111);
			
			List<Person> persons =personRepository.findAll();
			for(Person per : persons) 
			{
				System.out.println(persons);
			}
			
			long Count =personRepository.count();
			boolean status =personRepository.existsById(111);
			System.out.println(status);
			// personRepository.deleteById(11);
			// personRepository.deleteAll();

			
		}

}

