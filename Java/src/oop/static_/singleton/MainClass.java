package oop.static_.singleton;

public class MainClass {

	public static void main(String[] args) {

//		Singleton s1 = new Singleton();
//		s1.method1();
//		s1.method2();
	
//		Singleton s1 = Singleton.s;
		
//		s1.method1();
//		s1.method2();
		Singleton s1 = Singleton.getInSingleton();	
		Singleton s2 = Singleton.getInSingleton();	
		Singleton s3 = Singleton.getInSingleton();	
		Singleton s4 = Singleton.getInSingleton();	
		Singleton s5 = Singleton.getInSingleton();	
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		
		
		
	}

}

















