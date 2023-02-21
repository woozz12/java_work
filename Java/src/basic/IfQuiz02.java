package basic;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		
		
		/*
		 * 정수를 2개 입력 받아서, 두 정수 중 어느 수가 큰 지 
		 * 혹은 같은지를 판별하시면 됩니다.
		 * ex)
		 * 입력받은 수: 4,7 -> 7이 큰 수 입니다.
		 * 입력받은 수: 10 ,3 -> 10이 큰 수 입니다.
		 * 입력받은 수: 5, 5 -> 같은 수 입니다.   
		 */
		
		Scanner sc = new Scanner(System.in); 

		
		
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		System.out.print("정수를 입력해주세요: ");
		int n2um = sc.nextInt();
		
		if (num == n2um ) {
			System.out.println("같은 수 입니다.");
		} else if(num > n2um) {
			System.out.println(num + "가 큰 수 입니다.");
		} else {
			System.out.println(n2um + "가 큰 수 입니다.");
		}
			
		
		sc.close();
		
		
		
		
		
		
	}

}
