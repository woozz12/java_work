package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {

		
//		int i =1;
//		int total = 0;
//		while(i <= 10) {
//			total += i;
//			i++;
//		}
		
//		int total = 0;
//		
//		for(int i =1; i<= 10; i++) {
//			total += i;
//		}
		
		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를 
		//가로 출력(for)
		
//		
//		
//		for(int i=1; i <=200; i++) {
//			if(i % 6 == 0 && i % 12 != 0) {
//				System.out.println(i + " ");
//			}
//		}
//		
//		System.out.println("-----------");
//		
		//1~60000까지의 정수 중 177의 배수의 개수를 구해보세요
//		
//		int to = 0;
//		
//		
//		for(int n=1; n<=60000; n++) {
//			if(n % 177 == 0) {
//				to++;
//			}
//		}
//		System.out.println("배수 개수" + to);
//		
		//입력받은 정수까지의 팩토리얼 값을 구하세요.
		//팩토리얼) 5! -> 5 x 4 x 3 x 2 x 1
		
		
		
		Scanner sc = new Scanner(System.in);
//        System.out.println("숫자를 입력 하세요");
//        System.out.print(">>> ");
//        int n = Integer.parseInt(sc.nextLine());
//        long result = 1l;
//        
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        
//        System.out.println( n +"! = " + result);
//		}
//		
		
		 System.out.println("숫자를 입력 하세요");
		 int num = sc.nextInt();
		 
		 int fac = 1;
		 for(int i=1; i<=num; i++) {
			 fac *= i;
		 }
		 
		 System.out.printf("%d!: %d\n",num, fac);
	
	
		 sc.close();
	
			
		
		
		
		
		
		
	}
	}


