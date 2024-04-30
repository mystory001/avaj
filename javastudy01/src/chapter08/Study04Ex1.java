package chapter08;

public class Study04Ex1 {

	public static void main(String[] args) {

		try {
			Exception exception = new Exception("예외 발생");
			throw exception; //예외를 발생
			//throw new Exception("예외 발생"); //위의 코드를 한 줄로 작성
		} catch (Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
	
}
