package com.sortbyscore.application;

import java.util.Collections;
import java.util.List;

import com.sortbyscore.implementations.PersonBuilder;
import com.sortbyscore.implementations.TextLoader;
import com.sortbyscore.interfaces.DataLoader;
import com.sortbyscore.models.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		if (args.length == 0) {
			System.out.println("please input the directory of the file");
		} else if (args.length >= 1){
			System.out.println("we will use the first argument as the directory");
			System.out.println(args[0]);
		}
		
		String fileDir = args[0];
		
		DataLoader dataLoader = new TextLoader(new PersonBuilder());
		List<Person> personList = dataLoader.load(fileDir);
		
		Collections.sort(personList);
		Collections.reverse(personList);
		
		for (Person person : personList) {
			System.out.println(person.toString());
		}
		
    }
}
