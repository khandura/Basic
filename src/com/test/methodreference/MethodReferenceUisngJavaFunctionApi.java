package com.test.methodreference;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceUisngJavaFunctionApi {

	public static void main(String[] args) {

		lambdaVsMethodReference();

		changeStringToUpperCase();

	}

	private static void changeStringToUpperCase() {

		String string = readInputFromConsole();

		// lambda expression approach
		Function<String, String> changeToUpperCase = str -> str.toUpperCase();
		String convertedString = changeToUpperCase.apply(string);
		System.out.println("Uppercase String : " + convertedString);

		// method reference approach
		Consumer<String> consumer = System.out::print;
		changeToUpperCase = String::toUpperCase;
		convertedString = changeToUpperCase.apply(string);
		System.out.print("Uppercase String : ");
		consumer.accept(convertedString);

	}

	private static void lambdaVsMethodReference() {

		String stringValue = readInputFromConsole();

		// lambda approach
		Function<String, Integer> valueConverter = string -> Integer.valueOf(string);
		int convertedvalue = valueConverter.apply(stringValue);
		System.out.println("Converted Value lambda expression : " + convertedvalue);

		// Method reference approch
		stringValue = readInputFromConsole();
		valueConverter = Integer::valueOf;
		convertedvalue = valueConverter.apply(stringValue);
		System.out.println("Converted Value Method reference : " + convertedvalue);

	}

	private static String readInputFromConsole() {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a value that you want to conevrt in Ineteger from String");
			return scanner.next();
		}
	}

}
