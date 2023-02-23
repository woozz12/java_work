package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {

		/*
		 * 입력받은 수의 약수의 총합을 구하세요.
		 * 입력받은 값 : 12 -> 1 2 3 4 6 12 -> 28
		 */
		
//		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("값을 입력하세요: ");
//		int y = sc.nextInt();
//		
//		
//		int i = 1;
//		int total = 0;
//		
//		while(y % i == 0) {
//			System.out.printf("y / i = %d\n", y / i == total );
//			total += i;
//			i++;
//		}
		
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("값을 입력하세요: ");
		int y = sc.nextInt();
		
		int i = 1;
		int total = 0;
		
		while(i <= y) {
			if(y % i == 0) {
				total += i;
			}
			i++;
		}
		System.out.println(y + "약수의 총합" + total);
		
		
		
		
		
		
	}

}
