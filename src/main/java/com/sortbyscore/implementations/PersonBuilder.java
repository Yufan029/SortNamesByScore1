package com.sortbyscore.implementations;

import com.sortbyscore.interfaces.DataBuilder;
import com.sortbyscore.models.Person;

public class PersonBuilder implements DataBuilder{

	public Person build(String data) {
		if (validate(data)) {
			String [] item = data.split(",");
			return new Person(item[0].trim(), item[1].trim(), Integer.parseInt(item[2].trim()));
		} else {
			return null;
		}
	}

	public boolean validate(String data) {
		String [] item = data.split(",");
		return item.length == 3;
	}
}
