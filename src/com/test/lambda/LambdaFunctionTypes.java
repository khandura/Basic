package com.test.lambda;

interface ZeroParameterFuntionalInterface {
	
	void greet();
}


interface SingleParamereFunctionalInterface {
	
	void greetWithName(String name);
}

interface SingleParamereWithReturnTypeFunctionalInterface {
	
	String greetWithName(String name);
}



public class LambdaFunctionTypes {

	public static void main(String[] args) {
		
		greetingFromZeroParameterFuntionalInterface();
		greetingFromSingleParamereFunctionalInterface();
		greetingFromSingleParamereWithReturnTypeFunctionalInterface();		

	}

	private static void greetingFromSingleParamereWithReturnTypeFunctionalInterface() {
		String username = "ABC";
		
		SingleParamereWithReturnTypeFunctionalInterface singleWithReturn = (String name)-> {
				return "Hello "+name;
		};
		
		System.out.println(singleWithReturn.greetWithName(username));
		
	}

	private static void greetingFromSingleParamereFunctionalInterface() {
		String name = "DummyUser";
		
		SingleParamereFunctionalInterface single = (user)->{System.out.println("Hello "+user);};
		
		single.greetWithName(name);
		
	}

	private static void greetingFromZeroParameterFuntionalInterface() {

		ZeroParameterFuntionalInterface zero = () -> {
			try {
				System.out.println("Hello World from "
						+ Class.forName("com.test.lambda.ZeroParameterFuntionalInterface").getSimpleName());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		};

		zero.greet();
	}

}
