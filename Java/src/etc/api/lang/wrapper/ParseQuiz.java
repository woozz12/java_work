package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		String ssr;
		char c; //주민번호 앞자리 받아줄
		
		while(true) {
			System.out.println("주민등록번호를 입력하세요:");
			ssr =sc.next();
			
			if(ssr.indexOf("-")== -1) {
				System.out.println("하이픈을 포함시켜주세요.");
				continue;// 다시 입력
			}
			c = ssr.charAt(7);
			if(!(c == '1' || c== '2'|| c =='3'|| c=='4')) {  
				System.out.println("주민등록번호 뒷자리 첫번째는 1,2,3,4 중 하나를 받아야한다");
				continue;
			}
			try {
				
			String test = ssr.substring(0,6);
			String test2 = ssr.substring(7);
			Integer.parseInt(test);
			Integer.parseInt(test2);
			break;
		}catch(NumberFormatException e) {
			System.out.println("정수로 정확히 입력하세요.");
		}
					
	}
		
		//921013-1234567
		//parseInt
		int year = Integer.parseInt(ssr.substring(0,2));
		int month = Integer.parseInt(ssr.substring(2,4));
		int day = Integer.parseInt(ssr.substring(4,6));
		
		String gender; int birth;
		
		if( c == '1' || c=='3') {
			gender ="남자";
		}else {
			gender = "여자";
		}
		
		if(c == '1'|| c == '2') {
			birth = 1900 + year;
		}else {
			birth = 2000 + year;
		}
		
		int age = 2023 - birth;
		
		System.out.printf("%d년 %d월 %d일 %d세 %s\n",
				birth,month,day,age,gender);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



//		try {
//
//			while(true) {
//				System.out.println("주민등록번호를 입력하세요: ");
//				int num = sc.nextInt();
//				System.out.println("-를 포함시켜 주세요:");
//				String ssr = sc.next();
//				if(ssr.length()!= 13) {
//					System.out.println("주민등록번호는 13자리입니다.");
//				}else {
//					switch(ssr.charAt(8)) {
//					
//					
//					
//					
//					}
//					
//				}
//			}
//
//
//
//		} catch(Exception e) {
//			
//		}
	}


}



