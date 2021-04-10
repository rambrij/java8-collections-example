package com.ram.javacoderhint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemoApplication {

	public static void main(String[] args) {

		Person p1 = new Person("Alice", 23,1000);
		Person p2 = new Person("Barian", 56, 5000);
		Person p3 = new Person("Chelsa", 46, 4500);
		Person p4 = new Person("Jon", 28, 3000);
		Person p5 = new Person("Erica", 37,6000);
		Person p6 = new Person("Fransisco", 18,150);
		Person p7 = new Person("David", 28, 7500);

		City newYork = new City("New York");
		City shanghai = new City("Shanghai");
		City paris = new City("Paris");

		Map<City, List<Person>> map = new HashMap<>();
		map.putIfAbsent(paris, new ArrayList<>());
		map.get(paris).add(p1);
		System.out.println("People from Paris  :" + map.getOrDefault(paris, Collections.EMPTY_LIST));

		Map<City, List<Person>> map1 = new HashMap<>();
		map1.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p1);
		map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p2);
		map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p3);
		
		Map<City, List<Person>> map2 = new HashMap<>();
		map2.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p4);
		map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p5);
		map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p6);		

		System.out.println("Map 1  :");
		map1.forEach((city, people) -> System.out.println(city + " : " + people));
		
		System.out.println("Map 2 :");
		map2.forEach((city, people) -> System.out.println(city + " : " + people));

		map2.forEach((city, people) -> {
			map1.merge(city, people, (peopleFromMap1, peopleFromMap2) -> {
				peopleFromMap1.addAll(peopleFromMap2);
				return peopleFromMap1;
			});
		});

		System.out.println("Merged Map 2 into Map1 :");
		map1.forEach((city, people) -> System.out.println(city + " : " + people));

	}

}
