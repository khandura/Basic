package com.test.methodreference;

import java.util.ArrayList;
import java.util.List;

public class MethodRefenceWithArbitTypeMethod {

	public static void main(String[] args) {
	
		
		List<String> orgs = new ArrayList<>();
		
		orgs.add("Google");
		orgs.add("Microsoft");
		orgs.add("Google");
		orgs.add("Motorola");

		System.out.println("List before sorting");
		
		orgs.forEach( (names) -> System.out.println(names) );
		
		orgs.sort( (String::compareToIgnoreCase) );
		
		System.out.println("List after sorting");
		
		orgs.forEach( (names) -> System.out.println(names) );
		
	}

}
