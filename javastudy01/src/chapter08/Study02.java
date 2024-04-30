package chapter08;

public class Study02 {

	public static void main(String[] args) {

		//예외 처리 => try-catch문
//		try {
//			//예외가 발생할 가능성이 있는 문장, 구문
//		} catch (Exception1 e1) {
//			// Exception1이 발생했을 경우, 이를 처리하기 위한 구문 작성
//		} catch (Exception2 e2) {
//			// Exception2이 발생했을 경우, 이를 처리하기 위한 구문 작성
//		} catch (ExceptionN eN) {
//			// ExceptionN이 발생했을 경우, 이를 처리하기 위한 구문 작성
//		}
		
		//※ if문과 달리 try 블럭이나 catch 블럭 내에 포함된 문장이 하나뿐이라도 괄호{}를 생략할 수 없음
		
		//try-catch문 흐름
		//1. try 블럭 내에서 예외가 발생한 경우
			//1) 발생한 예외와 일치하는 catch블럭이 있는지 확인
			//2) 일치하는 catch 블럭을 찾게 되면, 그 catch 블럭 내의 문장들을 수행하고 전체 try-catch문을 빠져나가서 그 다음 문장을 계속해서 수행
			//	 만일 일치하는 catch블럭을 찾지 못하면, 예외는 처리되지 못함
		//2. try 블럭 내에서 예외가 발생하지 않은 경우
			//1) catch 블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속함
		
		
	}

}
