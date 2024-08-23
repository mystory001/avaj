package chapter14;

/**
 * *람다식(Lambda Expression)
 * -함수(메소드)를 간단한 '식(expression)'으로 표현하는 방법
 * -익명 함수(이름이 없는 함수, anonymous function)
 * -함수는 일반적인 용어, 메소드는 객체지향개념 용어. 함수는 클래스에 독립적, 메소드는 클래스에 종속적
 */

/**
 * *람다식 작성하기
 * int max(int a, int b){
 *  return a > b ? a : b;
 * }
 * 1. 메소드의 이름과 반환타입을 제거하고 '->'를 블록{} 앞에 추가
 * (int a, int b) -> { return a > b ? a : b; }
 * 2. 반환값이 있는 경우, 식이나 값만 적고 return문 생략 가능(끝에 ';' 안 붙임)
 * (int a, int b) -> a > b ? a : b
 * 3. 매개변수의 타입이 추론 가능하면 생략가능(대부분의 경우 생략가능)
 * (a, b) -> a > b? a : b
 * 
 * *주의사항
 * 1. 매개변수가 하나인 경우, 괄호() 생략가능(타입이 없을 때만)
 * 2. 블록 안의 문장이 하나뿐 일 때, 괄호{} 생략가능(끝에 ';' 안 붙임) 단, 하나뿐인 문장이 return문이면 괄호{} 생략불가
 */

/**
 * *람다식은 익명 객체
 * -람다식은 익명 함수가 아니라 익명 객체임
 * -람다식(익명 객체)을 다루기 위한 참조변수가 필요. 참조변수 타입은?
 */

public class Study1_1 {

	public static void main(String[] args) {

//		Object obj = (a,b) -> a>b?a:b; //람다식. 익명객체
		Object obj = new Object() {
			int max(int a, int b) {
				return a>b?a:b;
			}
		};
		
//		int value = obj.max(3,5); //에러 발생. Object에 max()메소드를 가지고 있지 않음 → 함수형 인터페이스 사용

	}

}
