package com.sortbyscore.implementations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.sortbyscore.interfaces.DataLoader;
import com.sortbyscore.interfaces.DataBuilder;
import com.sortbyscore.models.Person;

public class TextLoader implements DataLoader {

	private DataBuilder personBuilder;
	
	public TextLoader(DataBuilder personBuilder) {
		this.personBuilder = personBuilder;
	}
	
	public List<Person> load(String dataSource) {
		List<Person> personList = new ArrayList<Person>();
		FileReader fileReader = null;
		BufferedReader bufReader = null;
		
		try {
			fileReader = new FileReader(dataSource);
	        bufReader = new BufferedReader(fileReader); 
	        
	        String content;
	        while ((content = bufReader.readLine()) != null) {  
	            if (0 != content.length()) {  
	            	//String [] item = content.split(",");
	            	//personList.add(new Person(item[0].trim(), item[1].trim(), Integer.parseInt(item[2].trim())));
	            	personList.add(personBuilder.build(content));
	            	
	            }
	        }
		} catch (Exception e) {
			
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
				if (bufReader != null) {
					bufReader.close();
				}
			} catch (IOException e) {
				
			}
		}
		return personList;
	}
	
}
