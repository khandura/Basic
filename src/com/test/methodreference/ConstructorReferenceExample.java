package com.test.methodreference;

import java.util.function.Function;

class Employee {

	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}

public class ConstructorReferenceExample {

	public static void main(String[] args) {

		Function<String, Employee> function = Employee::new;
		Employee e = function.apply("John Doe");
		System.out.println(e);

	}

}
