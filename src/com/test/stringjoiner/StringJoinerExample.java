package com.test.stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {

		List<String> stringlist = Arrays.asList("java", "paython", "scala");

		StringJoiner joiner = new StringJoiner(",");

		stringlist.forEach((name) -> {
			joiner.add(name);
		});

		System.out.println("StringJoiner length : " + joiner.length());

		System.out.println(joiner);
		
		List<String> anotherlist = Arrays.asList("India", "Uk", "Usa");
		
		StringJoiner anotherJoiner = new StringJoiner(",","[", "]");
		
		anotherlist.forEach((name) -> {
			anotherJoiner.add(name);
		});
		
		System.out.println("Another joiner ");
		System.out.println(anotherJoiner);
		
		anotherJoiner.merge(joiner);
		
		System.out.println("Merger");
		System.out.println(anotherJoiner);
		
	}

}
