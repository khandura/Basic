package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.test.entity.Person;
import com.test.functionalinterface.PersonCreator;

public class SteamFunctionsOnUserObjects {

	public static void main(String[] args) {

		List<Person> persons = createListOfPerson();

		filterPersonBasedOnProfile(persons);
		filterPersonBasedOnProfileAndAge(persons);

	}

	private static void filterPersonBasedOnProfileAndAge(List<Person> persons) {

	}

	private static void filterPersonBasedOnProfile(List<Person> persons) {

		persons.stream()
				.filter(SteamFunctionsOnUserObjects::personProfileFilter)
				.collect(Collectors.toList())
				.forEach(System.out::println);

	}

	private static List<Person> createListOfPerson() {

		PersonCreator pc = Person::new;

		return Arrays.asList(pc.createPerson("Akhilesh", "Java", 30),
				pc.createPerson("Sudip", "Java", 33),
				pc.createPerson("Ujjwal", "Scala", 32),
				pc.createPerson("Abc", "Paython", 28));
	}

	private static boolean personProfileFilter(Person p) {

		return p.getProfile().equals("Java");

	}

	private static boolean perosnAgeFilter(Person p) {

		return p.getAge() > 30;

	}

}
