package chapter06;

public class Study16 {

	public static void main(String[] args) {
		
		//오버로딩(Overloading, 과적)
		//한 클래스 안에 같은 이름의 메서드 여러 개 정의 메서드 n : 메서드 이름 1
		//대표적인 예 println()
		
		//오버로딩이 성립하기 위한 조건(3가지 조건이 다 성립되어야함)
		//1. 메서드 이름이 같아야함
		//2. 매개변수의 개수 또는 타입이 달라야함
		//3. 반환 타입은 영향이 없음

		//ex1) int add(int a, int b){return a+b;}
		//	   int add(int x, int y){return x+y;}
		// 오버로딩 X
		
		//ex2) int add(int a, int b){return a+b;}
		//	   long add(int a, int b){return (long)(a+b);}
		// 오버로딩 X. 중복정의
		
		//ex3) long add(int a, long b){return a+b;}
		//	   long add(long a, int b){return a+b;}
		// 오버로딩 O
		//단 add(3,1)이라고 메서드 호출 시 에러발생(ambiguous)
		
	}

}
