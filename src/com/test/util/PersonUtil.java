package com.test.util;

import java.util.Arrays;
import java.util.List;

import com.test.entity.Person;
import com.test.functionalinterface.PersonCreator;

public class PersonUtil {

	public static List<Person> createListOfPersons() {
		PersonCreator pc = Person::new;

		return Arrays.asList(pc.createPerson("Akhi", "Java", 30),
				pc.createPerson("Sudip", "Java", 33),
				pc.createPerson("Ujjwal", "Scala", 32),
				pc.createPerson("Abc", "Paython", 28));
	}

}
