package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {

		
		String[] food = {"삼겹살","족발","피자","햄버거"};
		System.out.println(Arrays.toString(food));
		
		food[0] = "치킨";
		food[2] = "탕수육";
		System.out.println(Arrays.toString(food));
		
		//배열의 인덱스 탐색
		System.out.println("------------------");
		
		Scanner sc =new Scanner(System.in);
		System.out.print("탐색할 음식을 입력: ");
		String name = sc.next();
		
		
		
		int count = 0;
		for(int i = 0; i<food.length; i++) {
			if(name.equals(food[i])) {
				System.out.println("탐색 완료: ");
				System.out.println("인덱스: "+ i + "번");
				count++;
				break;	
			}  
		}
		
		if(count == 0)	
		System.out.println("없는 음식: ");
		
//		int i;
//		i=0;
//		if(i == foods.length) {
//			System.out.println("없는 음식입니다.");
//	}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
