package com.test.functionalinterface;

import com.test.entity.Person;


@FunctionalInterface
public interface PersonCreator {
	
	Person createPerson(String name, String profile, int age);

}
