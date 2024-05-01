package chapter08;
//예외 던지기
public class Study06Ex1 {

	static void method1() throws Exception{
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1() 메서드에서 예외가 처리됨");
			throw e;
		}
	}
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main() 메서드에서 예외가 처리됨");
		}
		
	}

}
