package com.ram.javacoderhint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonDataHelper {

	public static List<Person> populateList() {
		Person p1 = new Person("Alice", 23, 1000);
		Person p2 = new Person("Barian", 56, 5000);
		Person p3 = new Person("Chelsa", 46, 4500);
		Person p4 = new Person("Jon", 28, 3000);
		Person p5 = new Person("Erica", 37, 6000);
		Person p6 = new Person("Fransisco", 30, 1500);
		Person p7 = new Person("David", 25, 7500);

		List<Person> peopleList = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7));
		return peopleList;

	}

}
