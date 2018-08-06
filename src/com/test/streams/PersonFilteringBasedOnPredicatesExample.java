package com.test.streams;

import static com.test.predicate.PersonPredicate.*;
import static com.test.util.PersonUtil.createListOfPersons;

import java.util.List;

import com.test.entity.Person;



public class PersonFilteringBasedOnPredicatesExample {

	public static void main(String[] args) {

		String profile = "Java";
		String username = "Akhi";
		int age = 31;
		List<Person> persons = createListOfPersons();

		findPersonsOfProfile(persons, profile);
		
		findPerosnOfProfileOFAgeGroup(persons, profile, age);
		
		findPersonOfName(persons,username);
		

	}

	private static void findPersonOfName(List<Person> persons, String username) {

		filterPersons(persons,
				isValidPerson().and(isPersonOfGivenName(username)))
						.forEach(System.out::println);;

	}

	private static void findPerosnOfProfileOFAgeGroup(List<Person> persons, String profile, Integer age) {

		filterPersons(persons,
				(isPersonOfGivenProfile(profile)
						.and(isPersonOfGivenAgeGroup(age))))
								.forEach(System.out::println);;

	}

	private static void findPersonsOfProfile(final List<Person> persons, String profile) {

		filterPersons(persons, isPersonOfGivenProfile(profile))
				.forEach(System.out::println);;

	}

}
