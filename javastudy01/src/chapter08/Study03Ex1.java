package chapter08;

public class Study03Ex1 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException e) {
			e.printStackTrace(); //참조변수 a를 통해 생성된 ArithmeticException 인스턴스에 접근 가능
			System.out.println("예외 메시지 : " + e.getMessage());
		}
		
		System.out.println(5);
		
	}

}
