package com.test.methodreference;

import com.test.entity.Person;

interface PersonPrinter {

	void printPerson(Person p);
}

interface PersonCreator {

	Person createPerson(String name, String profile, int age);
}

public class ConstructorReferenceExample1 {

	public static void main(String[] args) {

		PersonCreator creator = Person::new;

		Person p = creator.createPerson("Akhi", "Java", 30);

		System.out.println(p);

		PersonPrinter printer = (person) -> {
			System.out.println(person);

		};

		for (int i = 0; i < 5; i++) {
			printer.printPerson(p);
		}

	}

}
