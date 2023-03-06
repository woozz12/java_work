package oop.encape.good;

public class MainClass {

	public static void main(String[] args) {

		
		MyBirth my = new MyBirth();
		
//		my.year = 2000; x
		my.setYear(2000);
		my.setMonth(3);
		my.setDay(23);
		
		
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n"
				,my.getyear("abc1234"),my.getMonth(),my.getDay());
		
		
		
		
	}

}
