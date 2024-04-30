package chapter08;

public class Study02Ex3 {
	
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); //실행되지 않음
		} catch (ArithmeticException e) {
			if(e instanceof ArithmeticException) 
					System.out.println("true");
				System.out.println("ArithmeticException");
			} catch (Exception e) { //ArithmeticException을 제외한 모든 예외가 처리
				System.out.println("Exception");
			}
			
		System.out.println(6);
		
		//try{}예외가 발생하면 이를 처리할 catch블럭으로 찾아 내려감
		//일치하는 catch 블럭이 없으면 예외는 처리 안됨
		//Exception이 선언된 catch블럭은 모든 예외 처리 => 마지막 catch 블럭에 작성
	}

}
