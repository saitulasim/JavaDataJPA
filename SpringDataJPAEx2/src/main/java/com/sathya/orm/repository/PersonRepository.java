package com.sathya.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathya.orm.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
