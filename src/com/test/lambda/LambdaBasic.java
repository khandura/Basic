package com.test.lambda;

interface FunctionalInterface {
	
	void sum(int a, int b);
	
	default void sayHello(){
		System.out.println("hello");
	}


}

public class LambdaBasic {

	public static void main(String[] args) {
		int a = 6;
		int b = 8;
		FunctionalInterface fi = (x,y)-> {
				System.out.println("Sum : "+ (x+y));
		};
		
		fi.sum(a, b);
		
	}

}
