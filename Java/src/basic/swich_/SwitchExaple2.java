package basic.swich_;

import java.util.Scanner;

public class SwitchExaple2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요");
		int point = sc.nextInt();

		switch(point / 10) {

		case 10:
			if(point > 100) {
				System.out.println("잘못된 점수입니다.");
				break;
			} 

		case 9:
			System.out.println("당신의 학점은 A 입니다.");
			break;
		case 8:
			System.out.println("당신의 학점은 B 입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C 입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 D 입니다.");
			break;

		default:
			if(point > 100 || point <0) {
				System.out.println("점수를 잘못 입력하셨습니다.");
				// |, ||: 양쪽 항의 논리값이 한 쪽만 true여도 true가 도출된다.
			} else {
				
				System.out.println("당신의 학점은 F 입니다.");
			}
		} 




		sc.close();





	}

}
