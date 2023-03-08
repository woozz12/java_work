package oop.poly.player;

public class Player {

	String name;
	int level;
	int atk;
	int hp;

	
	Player(){
		
		System.out.println("Player의 기본 생정자 호출!");
	
		level =1;
		atk = 3;
		hp = 50;
		
		
	}

	Player(String name){
		this(); 
		System.out.println("Player의 2번 생성자 호출!");
	
		this.name = name; 
		
	}
	
	Player(String name, int hp){
		this(name); 
		System.out.println("Player의 3번 생성자 호출!");
	
		this.hp =hp;
	}
	
	void attack(Player p) {
		
//		System.out.println("p: " + p);
//		System.out.println("this: "+ this);
		
		if(this == p) {
			System.out.println("스스로는 때릴 수 없습니다");
			return;
		}
		
		//출력 메세지: x가 y를 공격합니다.
		System.out.printf("%s가 %s를 공격했습니다.\n"
				,this.name,p.name);
		
		//상대방의 체력을 10 낮추고 나의 체력을 5 회복하고 싶다.
		
		p.hp -= 10;
		this.hp += 5;
		System.out.printf("나의 체력: %d, 상대방 체력: %d \n"
				,this.hp ,p.hp);
		
	}
	
		
	
		
	
	

	void characterInfo() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디: " + name);
		System.out.println("# 레벨: " + level);
		System.out.println("# 공력력: " + atk);
		System.out.println("# 체력: " + hp);
		
		
	}


}
