package com.sortbyscore.models;

public class Person implements Comparable<Person> {

	String firstName;
	String lastName;
	int score;
	
	public Person(String lastName, String firstName, int score) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
	}

	public int compareTo(Person p) {
		if (this.score-p.score != 0) {
			return this.score-p.score;
		} else if (this.lastName.equals(p.lastName)){
			return this.firstName.compareTo(p.firstName);
		}
		return this.lastName.compareTo(p.lastName);
	}
	
	@Override
	public String toString() {
		return this.lastName + ", " + this.firstName + ", " + this.score;
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
