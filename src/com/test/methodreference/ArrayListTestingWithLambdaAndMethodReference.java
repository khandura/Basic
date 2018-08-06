package com.test.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class ArrayListTestingWithLambdaAndMethodReference {

	public static void main(String[] args) {
		
		checkIfListContainsElement();
		
	}

	private static void checkIfListContainsElement() {
		
		List<Integer> numbers = Arrays.asList(3,2,5,8,9);
		
		BiPredicate<List<Integer>, Integer> checkElementInList = List::contains;
		
		System.out.println("List elements : " );
		numbers.forEach( System.out::println);
		System.out.println("is 6 present in the list : "+ checkElementInList.test(numbers, 6));
		System.out.println("is 5 present in the list : "+ checkElementInList.test(numbers, 5));		
		
		
	}

}
