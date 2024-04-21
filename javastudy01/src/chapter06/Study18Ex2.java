package chapter06;

public class Study18Ex2 {

	long a, b; //iv의 진짜 이름 this.a, this.b
	
	public Study18Ex2(int a, int b) { //생성자
		this.a = a; 
		this.b = b;
		
		//this.a, this.b => iv. this생략불가 
		//a, b => lv
		//lv와 iv 구분을 위해 this 사용
	}
	
	long add() { //인스턴스 메서드
		return a + b; //== return this.a + this.b;
	}
	
	static long add(long a, long b) { //클래스 메서드(static 메서드) => iv 사용불가, this 사용불가
		return a + b;
	}
	
}
