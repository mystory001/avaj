package exercise.chapter02;

public class Ex01 {

	public static void main(String[] args) {
		
		/**
		 * 1. 기본형 크기
		 * 
		 * 종류\크기	1byte	2byte	4byte	8byte
		 * 논리형		boolean
		 * 문자형				char					//char는 2byte
		 * 정수형		byte	short	int		long
		 * 실수형						float	double
		 */
		
		/**
		 * 2. 주민번호를 숫자로 저장하고자한다. 이 값을 저장하기 위해서는 어떤 자료형을 선택해야하며,
		 *    regNo라는 이름의 변수를 선언하고 초기화하는 한 줄의 코드를 작성
		 *    		 
		 *  long regNo = 0001013123456L;
		 */
		
		/**
		 * 3. 리터럴, 변수, 상수, 키워드는?
		 * int i = 100;
		 * long l = 100L;
		 * final float PI = 3.14f;
		 * 
		 * 리터럴 : 100, 100l, 3.14f
		 * 변수 : i, l
		 * 키워드 : int, long, float, final
		 * 상수 : PI
		 */
		
		/**
		 * 4. 기본형이 아닌 것은
		 * 
		 * => b. Byte
		 */
		
		/**
		 * 5. 출력 결과
		 * =>
		 * System.out.println("1"+"2"); //12
		 * System.out.println(true+""); //true
		 * System.out.println('A'+'B'); //131
		 * System.out.println('1'+2); //49+2 = 51
		 * System.out.println('1'+'2'); //49+50 = 99
		 * System.out.println('J'+"ava"); //Java
		 * System.out.println(true+null); //오류
		 */
		
		/**
		 * 6. 키워드가 아닌 것은?
		 * 
		 * => True, NULL, Class, System
		 * ※ Java에서 사용하는 키워드
		 * a : abstract, assert
		 * b: boolean, break, byte
		 * c : case, catch, char, class, const, continue
		 * d : default, do, double
		 * e : else, enum, extends
		 * f : false, final, finally, float, for
		 * g : goto
		 * i : if, implements, import, instanceof, int, interface
		 * l : long
		 * n : native, new, null
		 * p : package, private, protected, public
		 * r : return
		 * s : short, static, strictfp, super, switch, synchronized
		 * t : this, throw, throws, transient, true, try
		 * v : void, volatile, while
		 * 
		 */
		
		/**
		 * 7. 변수 이름으로 사용할 수 있는 것은?
		 * 
		 * => $ystem, If, 자바, $MAX_NUM
		 * ※ 변수의 이름 규칙
		 * 대소문자가 구분되며 길이에 제한이 없음(if와 If는 서로 다른 것으로 간주됨)
		 * 예약어 사용 불가(True는 가능하지만, true는 예약어이기 때문에 사용 불가)
		 * 숫자로 시작할 수 없음
		 * 특수문자는 '_'와 '$'만 허용 
		 */
		
		/**
		 * 8. 참조형 변수와 같은 크기의 기본형은?
		 * 
		 * => int, float
		 * ※ 참조형 변수는 4byte
		 */
		
		/**
		 * 9. 형변환을 생략할 수 있는 것은
		 * byte b = 10;
		 * char ch = 'A';
		 * int i = 100;
		 * long l = 1000L;
		 * 
		 * => d, e 
		 */
		
		/**
		 * 10. char 타입의 변수에 저장될 수 있는 정수 값의 범위?
		 * 
		 * => 0~65535
		 * ※ char는 2byte(2*8=16bit)이므로 2^16개의 값을 표현할 수 있음
		 * 2^16=65536이며 0을 포함해야하기 때문에 0~65535가 char의 범위가 됨
		 */
		
		/**
		 * 11. 변수를 잘못 초기화한 것은?
		 * 
		 * => a, b, c, d
		 * ※ byte는 -128~127 범위를 넘는 값으로 초기화 불가
		 * char는 반드시 한개의 문자를 지정해줘야함 cf, String s = ""; 가능. 또한 한 개의 문자만 저장
		 * float에는 접미사 f를 붙이거나 형 변환(double) 필요
		 */
		
		/**
		 * 12. main 메소드의 선언부로 알맞은 것은?
		 * 
		 * => a, b, c, e
		 * ※ 메소드 선언부
		 * 매개변수 args의 이름은 달라도 됨
		 * public과 static은 위치가 바뀌어도 됨
		 * void는 반드시 main 앞에 위치해야함. public void static main 불가
		 */
		
		/**
		 * 13. 타입과 기본값이 잘못 연결된 것은
		 * 
		 * => c, e, f
		 * ※ 타입의 기본값
		 * boolean = false
		 * char = '\u0000'
		 * int = 0
		 * long = 0L
		 * float = 0.0f
		 * String = null
		 */
	}

}
