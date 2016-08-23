package com.sortbyscore.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	private Person firstPerson = new Person("BUNDY", "TERESSA", 88);
	
	@Test
	public void testCompareToWithLowerScore() {
		Person secondPerson = new Person("SMITH", "ALLAN", 70);
		assertTrue(firstPerson.compareTo(secondPerson)>0);
	}

	@Test
	public void testCompareToWithHigherScore() {
		Person secondPerson = new Person("SMITH", "ALLAN", 90);
		assertTrue(firstPerson.compareTo(secondPerson)<0);
	}
	
	@Test
	public void testCompareToWithSameScoreSameFirstName() {
		Person secondPerson = new Person("SMITH", "TERESSA", 88);
		assertTrue(firstPerson.compareTo(secondPerson)<0);
	}
	
	@Test
	public void testCompareToWithSameScoreSameLastName() {
		Person secondPerson = new Person("BUNDY", "ALLAN", 88);
		assertTrue(firstPerson.compareTo(secondPerson)>0);
	}
}
