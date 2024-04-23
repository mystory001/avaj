package chapter07;

class CarS13E1{
	String color;
	String type;
	
	void start() {
		System.out.println("시동을 거는 기능");
	}
	
	void stop() {
		System.out.println("시동을 멈추는 기능");
	}
}

class FireEngineS13E1 extends CarS13E1{
	void water() {
		System.out.println("물을 뿌리는 기능");
	}
}

public class Study13Ex1 {

	public static void main(String[] args) {
		
		CarS13E1 car = new CarS13E1();
		FireEngineS13E1 fe = new FireEngineS13E1();
		System.out.println(fe instanceof CarS13E1);
		System.out.println(fe instanceof FireEngineS13E1);

	}

}
