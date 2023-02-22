package basic.begin;

import java.util.Scanner;

public class CalToFahr {

	public static void main(String[] args) {

		
		/*
		 * 사용자에게 섭씨온도를 입력 받아서
		 * 화씨온도로 변환하여 출력하는 로직을 작성하세요.
		 * 변환공식은 저도 몰라요. 여러분들이 찾아서 적용해 주셔야 합니다.
		 * ㄹ 한자 7 -> (℃), ㄹ 한자 다음장  4-> (°F)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("℃ :");
		double cal = sc.nextDouble();
	    
//		double fahr = (double)cal *9/5(1.8) +32;
		
//		System.out.printf("입력 온도: %.1f\n ", cal);
//		System.out.printf("변환 온도: %.1f\n ", fahr);
		
	    System.out.printf("화씨온도: %.1f\n ", (cal*1.8)+ 32);
	    
	 
		sc.close();
		
//		(0°C × 9/5(1.8)) + 32 = 32°F
		
		
		
		
		
		
		
	}

}
