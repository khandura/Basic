package com.test.lambda;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTravesalUsingLambda {

	public static void main(String[] args) {
		
		List<String> orgs = new ArrayList();
		
		orgs.add("Google");
		orgs.add("Microsoft");
		orgs.add("Motorola");
		
		orgs.forEach( (name)->{ System.out.println(name); } );
		
	}

}
