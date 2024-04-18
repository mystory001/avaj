package chapter06;

public class Study07 {

	public static void main(String[] args) {
		
		//선언위치에 따른 변수의 종류
		//종류 : iv(instance variable, 인스턴스 변수), cv(class variable, 클래스변수, static변수, 공유 변수), lv(local variable, 지역변수)
		//영역 클래스영역 - iv, cv(static + iv) 메서드 영역 - lv
		//클래스 영역 : 선언문(변수, 메서드)만 가능, 순서는 상관없음
		// 변수의 종류 	선언 위치 			생성시기
		// 클래스 변수		클래스 영역 			클래스가 메모리에 올라갈때(설계도가 필요할 때). 객체 생성 X -> 아무대나 사용가능
		// 인스턴스 변수	클래스 영역			인스턴스가 생성되었을 때. 객체 생성 O
		// 지역 변수 		클래스 영역 이외의 영역	변수 선언문이 수행되었을 때
		
		//객체는 iv변수 묶음
	}

}
