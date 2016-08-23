package com.sortbyscore.implementations;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.sortbyscore.interfaces.DataLoader;
import com.sortbyscore.interfaces.DataBuilder;
import com.sortbyscore.models.Person;

public class TextLoaderTest {

	DataLoader dataLoader;
	DataBuilder personBuilder;
	
	@Before
	public void setUp() {
		personBuilder = EasyMock.createMock(DataBuilder.class);
		dataLoader = new TextLoader(personBuilder);
	}
	
	@Test
	public void testLoadFromFile() {
		EasyMock.expect(personBuilder.build("BUNDY, TERESSA, 88")).andReturn(new Person("BUNDY", "TERESSA", 88));
	    EasyMock.replay(personBuilder);
	     
		String filePath = getClass().getClassLoader().getResource("testFile.txt").getPath();
		List<Person> list = dataLoader.load(filePath);
		assertEquals(list.size(), 1);
		assertEquals(list.get(0).toString(), "BUNDY, TERESSA, 88");
	     
	    EasyMock.verify(personBuilder);
	}

	@Test
	public void testLoadFileNotExist() {
		String filePath = "false.txt";
		List<Person> list = dataLoader.load(filePath);
		assertEquals(list.size(), 0);
	}

}
