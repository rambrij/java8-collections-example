package com.ram.javacoderhint;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListStreamExample {

	public static void main(String[] args) {

		List<Person> peopleList = PersonDataHelper.populateList();

		System.out.println("All element of List :");
		List<Person> list = peopleList.stream().collect(Collectors.toList());
		list.forEach(System.out::println);

		System.out.println("List after apply Skip and Limit  :");
		List<Person> skipedList = peopleList.stream().skip(2).limit(4).filter(per -> per.getAge() > 29)
				.collect(Collectors.toList());

		skipedList.forEach(System.out::println);

		System.out.println("Order by Max Salary  : ");
		List<Person> orderByMaxSal = peopleList.stream()
				.sorted(Comparator.comparing(Person::getSalary).thenComparing(Person::getAge))
				.collect(Collectors.toList());

		orderByMaxSal.forEach(System.out::println);
	}
}
