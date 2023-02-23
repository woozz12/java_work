package basic.loop;

import java.util.Random;

public class ForQuiz3 {

	public static void main(String[] args) {

		//2~19 난수 19행까지
		
		int rn = (int) ((Math.random()*18)+2);
		
		System.out.println("***구구단" + rn + "단 ***");
		System.out.println("--------------");
		for(int hang=1; hang<=19; hang++) {
			System.out.printf("%d x %d =%d\n" ,rn, hang,rn *hang);
			
		}
		
		
		
		
		
		
		
		
	}

}
