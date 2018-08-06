package com.test.methodreference;

import java.util.function.BiFunction;

class ClassABC {
	
	public static int sum(int a, int b) {
		return a+b;
	}
}

public class MethodReferenceWithStaticMethod {

	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> bf = ClassABC::sum;
		
		int sum = bf.apply(10, 15);
		
		System.out.println("Sum : "+ sum);

	}

}
