package chapter08;

public class Study05 {

	public static void main(String[] args) {

		//예외를 처리 하는 방법 : try-catch문, 예외 선언(예외 떠넘기기), 은폐(덮기)
		//메서드 예외 선언 : 메서드가 호출 시 발생 가능한 예외를 호출하는 쪽에 알리는 것
		//※예외를 발생시키는 키워드 throw와 예외를 메서드에 선언할 때 쓰이는 throws 구분
		//void method() throws Exception1, Exception2, .... , ExceptionN{
		// //메서드 내용
		//}
		
		//method()에서 Exception 클래스 예외 발생 가능
		//void method() throws Exception {
		// //메서드 내용
		//}
		
		//finally 블럭
		//예외 발생여부와 관계없이 수행되어야 하는 코드를 넣음
//		try {
//			//예외가 발생할 가능성이 있는 문장
//		} catch (Exception e) {
//			//예외처리를 위한 문장
//		} finally {
//			//예외 발생여부에 관계없이 항상 수행되어야하는 문장들을 넣음
			//finally 블럭은 try-catch문의 맨 마지막에 위치
//		}
		//try 블럭 안에 return문이 있어 try블럭을 벗어날 때도 finally 블럭이 실행
		
	}

}
