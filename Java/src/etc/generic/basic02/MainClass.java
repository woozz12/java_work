package etc.generic.basic02;

public class MainClass {

	public static void main(String[] args) {
		
		Basic<Integer, String> b = new Basic<>(1, "정상수");
		String name = b.get(1);
		b.put(1, "ㅇㅈㅎ");
		System.out.println(name);
		System.out.println(b);
		
		
	}

}
