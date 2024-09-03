package exercise.chapter06;

public class Ex06 {
	
	//두 점의 거리를 계산하는 getDistance()를 완성
	//피타고라스 정리 (x-x1)^2+(y-y1)^2의 루트값
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt(Math.abs(x-x1)*Math.abs(x-x1)+Math.abs(y-y1)*Math.abs(y-y1));
	}
	
	public static void main(String[] args) {
		
		System.out.println(getDistance(1, 1, 2, 2));

	}

}
