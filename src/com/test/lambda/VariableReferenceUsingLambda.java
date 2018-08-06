package com.test.lambda;

import java.util.function.Consumer;
import java.util.function.Function;

import com.test.entity.Person;

public class VariableReferenceUsingLambda {

	static String staticVariable = "i'm static variable";

	public static void main(String[] args) {

		referringLocalVariable();

		referringInstanceVariable();

		referringStaticVariable();

	}

	private static void referringStaticVariable() {

		Consumer<Person> consumer = (person) -> {
			System.out.println(person);
			System.out.println(staticVariable);
		};

		consumer.accept(new Person("Akhi", "Java", 30));

	}

	private static void referringInstanceVariable() {

		Consumer<Person> consumer = (person) -> {
			System.out.println(person);
			System.out.println(person.getName().toUpperCase());
		};

		consumer.accept(new Person("Akhi", "Java", 30));

	}

	private static void referringLocalVariable() {

		String str = "test string";

		Function<String, String> func = (string) -> str + string.toUpperCase();

		System.out.println(func.apply(" Hello"));

		// str = str+" somthing new"; //variables referred by lambda should be
		// effectively final.

	}

}
