package chapter14;

/**
 * *함수형 인터페이스
 * -단 하나의 추상 메소드만 선언된 인터페이스
 * @FunctionalInterface
 * interface MyFunction{
 * 	public abstract int max(int a, int b);
 * }
 * MyFunction f = new MyFunction(){ //익명클래스. 클래스의 선언, 객체 생성을 동시에
 * 					public int max(int a, int b){
 *                 		return a>b?a:b;
 *                  }
 *                };
 * int value = f.max(3,5); //MyFunction에 max()가 존재하므로 가능
 * -함수형 인터페이스 타입의 참조변수로 람다식을 참조할 수 있음
 *  단, 함수형 인터페이스의 메소드와 람다식의 매개변수 개수와 반환타입이 일치해야함.
 *  MyFunction f = (a,b) -> a>b?a:b;
 *  int value = f.max(3,5); //실제로 람다식(익명 함수)이 호출됨
 */

@FunctionalInterface //함수형 인터페이스는 단 하나의 추상 메소드만 가져야함
interface MyFunction2_1{
	public abstract int max(int a, int b);
}

public class Study2_1 {
	
	public static void main(String[] args) {

//		MyFunction14_2 f = new MyFunction14_2() {
//			@Override
//			public int max(int a, int b) { //오버라이딩 규칙 - 접근제어자는 좁게 할 수 없음
//				return a>b?a:b;
//			}
//		};
		
		//람다식(익명객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 함
		MyFunction2_1 f = (a,b) -> a>b? a:b; //람다식. 익명 객체
		
		int value = f.max(3, 5);
		System.out.println("value = " + value);
		
	}

}
