package chapter07;

//Study04Ex1.java 간단하게 리팩토링

class PointS4E2{
	int x;
	int y;
	
	public PointS4E2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Object 클래스의 toString()을 오버라이딩
	public String toString() {
		return "x : " + x + ", y = " + y;
	}
}

public class Study04Ex2 {
	
	public static void main(String[] args) {

//		PointS4E2 pointS4E2 = new PointS4E2();
		PointS4E2 pointS4E2 = new PointS4E2(5,6);
//		pointS4E2.x = 3;
//		pointS4E2.y = 4;
//		System.out.println("pointS4E2.toString() = "+pointS4E2.toString());
		System.out.println("pointS4E2 = "+pointS4E2);
		
	}

}
