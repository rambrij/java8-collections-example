package com.ram.javacoderhint;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FuntionaExample {

	public static void main(String[] args) {

		List<Person> peopleList = PersonDataHelper.populateList();

		System.out.println("All element of List :");

	//	List<Person> newPeopleList = SKIP_AND_LIMIT1.apply(peopleList);		
		List<Person> newPeopleList = SKIP_AND_LIMIT2.apply(peopleList);
						
//		newPeopleList.forEach(p-> System.out.println(p));
		newPeopleList.forEach(System.out::println);

	}
	
	static Function<List<Person>, List<Person>> SKIP_AND_LIMIT1 = (pList) -> {
		return pList.stream().skip(2).limit(4).filter(per -> per.getAge() > 29).collect(Collectors.toList());
	};	 
	
	static Function<List<Person>, List<Person>> SKIP_AND_LIMIT2 = pList -> pList.stream().skip(2).limit(4)
			.filter(per -> per.getAge() > 29).collect(Collectors.toList());
}
