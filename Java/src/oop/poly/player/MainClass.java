package oop.poly.player;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("전사 1");
		Warrior w2 = new Warrior("전사 1");
		Mage m1 = new Mage ("법사 1");
		Hunter h1 = new Hunter ("사냥꾼 1");
		
		
		w1.rush(w2);
		w1.rush(m1);
		w1.rush(h1);
		
	}

}
