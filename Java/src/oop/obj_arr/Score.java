package oop.obj_arr;


public class Score {


	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을
     담을 수 있는 객체를 디자인하세요.

    - 학생의 모든 정보를 한 눈에 확인할 수 있게
     scoreInfo() 메서드를 선언해 주세요.
     메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.

    - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
	 */


	private String name;
	private int i;
	private int j;
	private int k;
	private double avg;
	
	public Score() {}
	
	
	public Score(String name, int i, int j, int k, double avg) {
		super();
		this.name = name;
		this.i = i;
		this.j = j;
		this.k = k;
		this.avg = avg;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}


	public int getK() {
		return k;
	}


	public void setK(int k) {
		this.k = k;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}


	public void scoreInfo() {
		System.out.printf("평균: %d + %d + %d/3=%.1f\n"
				,this.i,this.j,this.k,this.avg);
	}
	






	//	51*[]7 =42












}
