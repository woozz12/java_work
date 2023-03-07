package oop.obj_arr;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

//		Person kim = new Person("김길동", 32,"남자");
//		Person lee = new Person("이길동", 25,"여자");
//		Person park = new Person("박길동", 50,"남자");
//		
//		kim.persomInfo();
//		lee.persomInfo();
//		park.persomInfo();
		
		
//		int arr = new int[5];
//		Person[] people = new Person[3];
//		people[0] = new Person("김수철", 32, "남자");
		
		
		
//		int[] arr = {1,2,3,4,5};
		
		Person[] people = {
				new Person("김길동", 32,"남자"),
				new Person("이길동", 25,"여자"),
				new Person("박길동", 50,"남자")
		};
		
//		System.out.println(Arrays.toString(people));
		
//		people[0].persomInfo();
//		people[1].persomInfo();
//		people[2].persomInfo();
		
//		for( int i=0; i<people.length; i++ ) {
//			people[i].persomInfo();
//		}
		
		for(Person p : people) {
			p.persomInfo();
		}
		
		
		
		
		
	}

}




















