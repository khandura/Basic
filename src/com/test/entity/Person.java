package com.test.entity;

public class Person {
	
	private String name;
	private String profile;
	private Integer age;
	
	
	public Person() { }
	
	
	/**
	 * 
	 * @param name
	 * @param profile
	 * @param age
	 */
	public Person(String name, String profile, Integer age) {
		super();
		this.name = name;
		this.profile = profile;
		this.age = age;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", profile=");
		builder.append(profile);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
	

}
