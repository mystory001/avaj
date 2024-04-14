package chapter04;

public class Study3 {

	public static void main(String[] args) {

		//임의의 수
		//Math.random()
		//0.0과 1.0 사이의 임의의 double값을 반환
		//0.0 <= Math.randow() < 1.0
		
		double random = Math.random();
		System.out.println(Math.round(random*3)+1);
		
		
	}
}
