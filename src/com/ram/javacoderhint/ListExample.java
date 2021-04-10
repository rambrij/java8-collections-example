package com.ram.javacoderhint;

import java.util.Comparator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		List<Person> peopleList = PersonDataHelper.populateList();

		peopleList.replaceAll(person -> new Person(person.getName().toUpperCase(), person.getAge(), person.getSalary()));
		peopleList.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
		// peopleList.forEach(person -> System.out.println(person));
		peopleList.forEach(System.out::println);		

	}

}
