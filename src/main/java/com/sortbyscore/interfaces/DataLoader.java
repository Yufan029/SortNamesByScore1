package com.sortbyscore.interfaces;

import java.util.List;

import com.sortbyscore.models.Person;

public interface DataLoader {
	List<Person> load(String dataSource);
}
