package chapter06;

public class Study06 {

	public static void main(String[] args) {
		
		//클래스의 정의
		//설계도, 데이터 + 함수, 사용자정의 타입

		//클래스 == 데이터 + 함수
		//변수 : 하나의 데이터를 저장할 수 있는 공간
		//배열 : 같은 종류의 여러 데이터를 하나로 저장할 수 있는 공간(같은 타입만)
		//구조체 : 서로 관련된 여러 데이터를 하나로 저장할 수 있는 공간(다른 타입도 OK)
		//클래스 : 데이터와 함수의 결합(구조체 + 함수(명령문 묶음))
		
		//사용자 정의 타입 원하는 타입(클래스)을 직접 만들 수 있음
		class Time{
			int hour;
			int minute;
			int second;
		}
		Time time = new Time();
		

	}

}
