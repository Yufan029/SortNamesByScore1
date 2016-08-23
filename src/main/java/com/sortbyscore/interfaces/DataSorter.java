package com.sortbyscore.interfaces;

import java.util.List;

import com.sortbyscore.models.Person;

public interface DataSorter {
	void sort(List<Person> personList);
}
