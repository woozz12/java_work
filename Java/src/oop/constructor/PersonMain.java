package oop.constructor;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		/*
		 scanner를 이용해서 사용자에게 
		 이름 나이 키를 입력받아서
		 해당 정보를 저장하는 객체를 디자인 해보세요.
		 객체 내에는 해당 사람의 정보를 모두 출력 해 주는
		 info() 메서드가 존재합니다.
		 
		 */
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름: ");
		String pName = sc.next();
		System.out.print("나이: ");
		int pAge = sc.nextInt();
		System.out.print("키: ");
		int pHeight = sc.nextInt();
		
		
		
		Person p =new Person(pAge,pHeight,pName); // 순서
		p.info();// 주소
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
