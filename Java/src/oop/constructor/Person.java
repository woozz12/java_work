package oop.constructor;

public class Person {

	int age;
	int height;
	String name;
	
	Person(){}
	
	Person(int pAge, int pHeight,String pNAme){
		age = pAge;
		height = pHeight;
		name = pNAme;
	}
	
	
	void info() {
		System.out.println("****정보****");
		System.out.println(name + "입니다");
		System.out.println(age + "입니다");
		System.out.println(height + "입니다");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
