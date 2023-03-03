package oop.constructor;

public class Bread {

	int price;
	String name;
	String ingredient;
	
	Bread() {}
	
	Bread(String bName,	int bPrice,String bIngredient){
		name =bName;
		price = bPrice;
		ingredient = bIngredient;
	}
		
		
		void breadSpec () {
			
			System.out.println("*******");
			System.out.println("빵 이름: " + name);
			System.out.println("빵 가격: "+ price);
			System.out.println("주 재료: "+ ingredient);
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

