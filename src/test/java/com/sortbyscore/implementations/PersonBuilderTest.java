package com.sortbyscore.implementations;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonBuilderTest {

	@Test
	public void testBuildWithValidData() {
		PersonBuilder personBuilder = new PersonBuilder();
		assertEquals(personBuilder.build("BUNDY, TERESSA, 88").toString(), "BUNDY, TERESSA, 88");
	}
	
	@Test
	public void testBuildWithInvalidData() {
		PersonBuilder personBuilder = new PersonBuilder();
		assertEquals(personBuilder.build("abc"), null);
	}
}
