package basic.if_;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {

		/*
		 * 국어, 영어, 수학 점수를 각각 입력받아서
		 * 평균을 구해 보세요. (평균은 소수점 첫째 자리까지 출력)
		 * 평균이 90점이 넘는다면, 다시 한 번 조건을 검사해서
		 * 95 ~ 100 -> a+
		 * 94 ~ 90 -> a0
		 * 80점대는 B, 70점대는 c, 60점대는 D, 나머지는
		 * 모두 F 처리하시면 됩니다. (100점이 만점)
		 * 
		 *  ex)
		 *  평균 점수 : 95.5
		 *  당신의 학점은 A+ 입니다.
		 */



		//		System.out.print("국어 입력하세요: ");
		//		int sub = sc.nextInt();
		//		System.out.print("영어 입력하세요: ");
		//		int sub2 = sc.nextInt();
		//		System.out.print("수학 입력하세요: ");
		//		int sub3 = sc.nextInt();
		//		
		//		
		//		int tot = (sub + sub2 + sub3);
		//		double avg = (double)((double)tot/3);
		//		System.out.printf("평균: " + avg);
		//		
		//		String grade;
		//		
		//		if (avg >= 95) {
		//			grade = "A+";
		//		}else if (avg >= 94 && avg >=90) {
		//			grade = "A0";
		//		}else if (avg >= 80 ) {
		//			grade = "B";
		//		}else if (avg >= 70) {
		//			grade = "c";
		//		}else if (avg >= 60) {
		//			grade = "D";
		//		}else{
		//			grade = "F";
		//		}
		//		
		//		System.out.println("\n학점: " + grade);



		Scanner sc = new Scanner(System.in);

		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();

		double avg = (kor + eng + math) / 3.0;
		System.out.printf("평균: %.1f점\n", avg);
		System.out.println("--------------------");

		if(avg >= 90) {
			if(avg > 100) {
				System.out.println("잘못된 점수입니다.");
			} else if(avg >= 95) {
				System.out.println("당신의 학점은 A+ 입니다.");
			} else {
				System.out.println("당신의 학점은 A0 입니다.");
			}
		} else if(avg >= 80) {
			System.out.println("당신의 학점은 B 입니다.");

		} else if(avg >= 70) {
			System.out.println("당신의 학점은 C 입니다.");

		} else if(avg >= 60) {
			System.out.println("당신의 학점은 D 입니다.");

		} else {
			if(avg < 0) {
				System.out.println("잘못된 점수입니다.");
			} else {
				System.out.println("당신의 학점은 F입니다.");
			}

		}

		sc.close();












	}

}
