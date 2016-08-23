package com.sortbyscore.interfaces;

import com.sortbyscore.models.Person;

public interface DataBuilder {
	Person build(String data);
	boolean validate(String data);
}
