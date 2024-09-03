package exercise.chapter06;

//getDistance()를 MyPoint클래스의 인스턴스 메서드로 정의
class MyPoint1{
	int x;
	int y;
	
	public MyPoint1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		return Math.sqrt(Math.abs(x-x1)*Math.abs(x-x1)+Math.abs(y-y1)*Math.abs(y-y1));
	}
	
}


public class Ex07 {

	public static void main(String[] args) {
		
		MyPoint1 p = new MyPoint1(1, 1);
		
		System.out.println(p.getDistance(2,2));

	}

}
