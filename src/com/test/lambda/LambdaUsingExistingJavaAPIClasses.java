package com.test.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.DoubleConsumer;

public class LambdaUsingExistingJavaAPIClasses {

	public static void main(String[] args) {

		DoubleConsumer dcon = (val) -> System.out.println("Double : " + val);
		dcon.accept(10.5);

		BiConsumer<String, String> bicon = (string1, string2) -> {
			System.out.println("Final String : " + string1 + string2);
		};

		bicon.accept("hello ", "world");

		BiFunction<String, String, Boolean> bifunc = (str1, str2) -> {
			return str1.compareToIgnoreCase(str2) ==0 ? true : false;
		};
		
		boolean b = bifunc.apply("hello", "HELLO");
		System.out.println("Equality : "+ b);

	}

}
