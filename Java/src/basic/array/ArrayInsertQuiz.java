package basic.array;

import java.util.Scanner;

public class ArrayInsertQuiz {

	public static void main(String[] args) {

		
		/*
        1. String 배열을 생성하세요. (foods)
        크기는 넉넉하게 50개로 지정하겠습니다.

        2. 사용자에게 음식 이름을 입력받아서 배열에
         삽입해 주세요.
         사용자가 음식 입력창에 '배불러' 라고 작성하면
         입력을 종료해 주세요.

        3. 입력이 종료되면 사용자가 입력한 음식을
        가로로 출력해 주세요. (null은 출력하지 마세요.)

        */
		
		String[] foods = new String[50];
		Scanner sc =new Scanner(System.in);
		
		System.out.print("음식 이름을 입력하세요: ");
		System.out.println("그만 작성: ");
		
		for(int i =0; i<foods.length;i++) {
			System.out.println("> ");
			String name = sc.next();
			
			if(name.equals("배불러")) {
				System.out.println("종료: ");
				break;
			}
			foods[i] = name;
		}
		System.out.println("---------------------");
		System.out.println("내가 먹고 싶은 음식들: ");
		
		for(String f : foods  ) {
			if(f == null) break;
			System.out.println(f + " ");
		}
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
