package chapter08;

public class Study01 {

	public static void main(String[] args) {

		//프로그램 오류
		//논리적 에러 : 작성 의도와 다르게 동작
		//컴파일 에러 : 컴파일 할 때 발생하는 에러
		//※자바 컴파일러 역할
			//1. 구문 확인
			//2. 번역
			//3. 최적화 ex) int i = 3 + 5;
			//4. 생략된 코드 추가 ex) extends Object
		
		//런타임 에러 : 실행할 때 발생하는 에러(프로그램 종료)
		//※Java 런타임 에러
			//에러(error) : 프로그램 코드에 의해 수습될 수 없는 심각한 오류 ex)OOME
			//예외(exception) : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
		
		//예외처리(exception handling)의 정의와 목적
			//정의 : 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
			//목적 : 프로그램의 비정상 종료를 막고, 정상적인 실행 상태를 유지하는 것
		
		//예외 클래스의 계층 구조
		//Object - Throwable(클래스. 모든 오류의 조상) - Exception, Error
		//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html
		
		//Exception 클래스 : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
		//RuntimeException 클래스 : 프로그래머의 실수로 발생하는 예외

	}

}
