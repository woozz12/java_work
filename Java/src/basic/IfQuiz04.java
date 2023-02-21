package basic;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {

		/*
		 * 
		 * - 정수 3개를 입력 받습니다.
		 * -가장 큰 값 가장 작은 값, 중간값을 구해서 출력해 보세요.
		 * max, mid, min이라는 변수를 미리 선언하셔서
		 * 판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
		 * 마지막에 한번에 출력하시면 되겠습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1의 값을 입력하세요: ");
		int num = sc.nextInt();
		System.out.println("정수2의 값을 입력하세요: ");
		int num2 = sc.nextInt();
		System.out.println("정수3의 값을 입력하세요: ");
		int num3 = sc.nextInt();
	
		int  max,mid,min;
		
		if (num > num2 && num > num3) {
			max = num;
			if(num2 > num3) {
				
				mid = num2;
				min = num3;
			} else {
				mid = num3;
				min = num2;
			}
					
		} else if (num2 > num && num2 > num3) {
			max = num2;
			if (num > num3) {
				mid = num;
				min = num3;
			} else {
				mid = num3;
				min = num;	
			}	
		} else {
			max = num3;
			if(num > num2) {
				mid = num;
				min = num2;
			} else {
				mid = num2;
				min = num;
				
			}
		}
		
		System.out.println("max"+ max);
		System.out.println("mid"+ mid);
		System.out.println("min"+ min);
		
		sc.close();
		
	}

}
