package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * This class will demonstrate basic stream functionality
 * 
 * @author khandura
 *
 */

public class BasicStreamExample {

	public static void main(String[] args) {

		createUserDefinedStream();
	//	doBasicStreamTesting();
	//	arrayStream();

	}

	private static void createUserDefinedStream() {

		List<Integer> list = Arrays.asList( 1, 2, 3, 4, 5 );
		list.forEach(System.out::println);
		
		printEvenNumbers(list, (i) -> i%2 == 0);
		

	}

	private static void printEvenNumbers(List<Integer> list, Predicate<Integer> predicate) {

		System.out.println("Even number list");
		
		System.out.println( list.stream()
							.filter(predicate)
							.collect(Collectors.<Integer>toList()) 
						  );
		
	
		/*	for (Integer integer : arr) {
			if (predicate.test(integer)) {
				System.out.println(integer);
			}
		}	
		*/

	}

	private static void arrayStream() {
		String[] arr = { "Akhi", "Ram", "John", "David" };

		System.out.println("Array size : " + Arrays.stream(arr).count());

	}

	private static void doBasicStreamTesting() {

		List<String> list = Arrays.asList("Akhi", "Ram", "John", "David");

		// stream().count() -> returns the number of elements present inside the collection
		long size = list.stream().count();
		System.out.println("size of list : " + size);

		// stream().forEach -> iterate over each element of collection and perform the provided action.
		list.stream().forEach(System.out::println);

		// list.stream().anyMatch( (string)->string.startsWith("A")) ;

		/*
		 * list.stream().forEach( (string)-> { if(string.startsWith("A") ){
		 * System.out.println(string); } } );
		 */
		list.stream().filter((string) -> string.startsWith("A"));
		
		

	}



}
