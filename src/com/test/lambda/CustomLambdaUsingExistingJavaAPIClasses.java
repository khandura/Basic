package com.test.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

import com.test.entity.Person;

public class CustomLambdaUsingExistingJavaAPIClasses {

	public static void main(String[] args) {

		//consumerWithAccept();
		consumerWithAndThen();

	}

	private static void consumerWithAndThen() {

		List<Person> persons = Arrays.asList(new Person("Akhilesh", "Java", 30), new Person("Arbit", "Java", 32));

		Consumer<Person> basicConsumer = (person) -> {
			person.setProfile(person.getProfile().toUpperCase());
		};

		Consumer<Person> consumerWithAndThen = basicConsumer.andThen((person) -> {
			System.out.println(person);
		});
		
		persons.forEach(consumerWithAndThen);

	}

	
	private static void consumerWithAccept() {

		Person p1 = new Person("Akhilesh", "Java", 30);
		Person p2 = new Person("Arbit", "Java", 32);

		BiFunction<Person, Person, Boolean> compareProfiles = (person1, person2) -> {
			return person1.getProfile().compareToIgnoreCase(person2.getProfile()) == 0 ? true : false;
		};

		boolean isProfileSame = compareProfiles.apply(p1, p2);

		System.out.println("Person1 : " + p1);
		System.out.println("Person2 : " + p2);

		System.out.println("are profiles same : " + isProfileSame);

		BinaryOperator<Person> binFunc = (person1, person2) -> {
			return person1.getAge() > person2.getAge() ? person1 : person2;
		};

		Person p3 = binFunc.apply(p1, p2);
		
		System.out.println("*** : "+p3);

	}

}
