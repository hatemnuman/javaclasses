package com.class25;

public class Mainn {
	
public static void main(String[] args) {
	
	Person obj=new Person();
	Employee obj2=new Employee();
	obj2.name="Joe";
	obj2.age=35;
	obj2.salary=35000;
	obj2.employee();
	
	Student obj3=new Student();
	obj3.name="Adm";
	obj3.age=15;
	obj3.grade=10;
	obj3.studnet();
	
	Retiree obj4=new Retiree();
	obj4.name="Frank";
	obj4.age=15;
	obj4.seniorActivity="tour";
	obj4.retiree();
	
	
	
	
	
}
}


//1. Create four classes (Person, Employee, Student, Retiree)
//
//* Have properties
//For Person: name(String)
//For Person: lastName(String)
//For Person: age(int)
//For Employee: salary(int)
//For Student: grade(int)
//For Retiree: seniorActivity(String)
//
//At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output
//
//Use your inheritance skills to make Person as your parent class and 
//
//From your Main class create objects of the Employee, Student and Retiree classes and Call the print method.
//
//
//Output: 
// 
//Joe Smith 35 35000
//Adam Smith 15 10
//Frank Smith 15 tour
