package com.test.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.test.entity.Person;

/**
 * Predicate class for entity Person, contains different set of predicate
 * condition to filter out the persons on based of given condition.
 * 
 * @author khandura
 *
 */

public class PersonPredicate {

	public static Predicate<Person> isValidPerson() {
		return p -> p.getName() != null && p.getProfile() != null
				&& p.getAge() != null;

	}

	public static Predicate<Person> isPersonOfGivenProfile(String profile) {
		return p -> p.getProfile().equalsIgnoreCase(profile);
	}
	
	public static Predicate<Person> isPersonOfGivenAgeGroup(Integer age) {
		return p -> p.getAge() > age;
	}
	
	public static Predicate<Person> isPersonOfGivenName(String username) {
		return p -> p.getName().equals(username);
	}

	public static List<Person> filterPersons(List<Person> persons,Predicate<Person> predicate) {

		return persons
				.stream()
				.filter(predicate)
				.collect(Collectors.<Person>toList());

	}

}
