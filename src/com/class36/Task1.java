package com.class36;

import java.util.*;

//Create a Person class with following private fields: name, lastName, age, salary. 
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.


class Person{
	
	private String name;
	private String lastName;
	private int age;
	private int salary;
	
	public Person(String name, String LastName, int age, int salray) {
		
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salray;
		
	}
	
	public void display() {
		
		System.out.println(name+" "+ lastName+ " "+ age+" "+ salary);
	}
}

public class Task1 {

	public static void main(String[] args) {
		
		Map<Integer, Person> map= new TreeMap<>();
		map.put(1, new Person("Moe", "Hawa", 35, 100000));
		map.put(2, new Person("Hatem", "Numan", 30, 100000));
		map.put(3, new Person("John", "Numan", 37, 100000));
		map.put(4, new Person("Samur", "Numan", 35, 100000));
		map.put(5, new Person("Nouh", "Numan", 40, 100000));
		
		Set<Integer> set=map.keySet();
		
		for (Integer list:set) {
			System.out.print("the key is "+list+" ");
			map.get(list).display();
		}
		
		
	}

}
