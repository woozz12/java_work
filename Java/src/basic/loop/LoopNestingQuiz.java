package basic.loop;

public class LoopNestingQuiz {

	public static void main(String[] args) {

		  /*1. 구구단을 다음과 같이 가로로 출력해 보세요.

	         2단: 2x1=2 2x2=4 2x3=6 .....
	         3단: 3x1=3 3x2=6 3x3=9 .....
	         4단: 4x1=4 4x2=8 4x3=12 .....

	         2. 구구단을 다음과 같이 세로로 출력해 보세요.
	         각 단의 간격은 탭 하나로 고정하겠습니다.
	         2단         3단
	         2x1=2      3x1=3
	         2x2=4      3x2=6
	         2x3=6      3x3=9
	         .
	         .
	         .
	         */
		
//		for(int dan=2; dan<=9; dan++) {
//			System.out.printf(" (" + dan +" 단)\t ");
//			for(int hang = 1;hang<=9; hang++);
		
//				System.out.printf("%d x %d= %d\t"
//		       , dan , hang, dan*hang);	
//			}
//		System.out.println();
//	}
//		System.out.println("\n----------------");
		
//		Q2
		
		
			for(int h = 0; h<=9; h++) {
				for(int d = 2; d<=9; d++) {
					if(h == 0) {
					System.out.println(h + "단\t");
				}else {
					System.out.printf("%d x %d= %d\t"
					       , d ,h , d*h);
					
				}
		
		System.out.println();
			
		}
		
		
		
		
			}
			
		}
		
		
		

	}


