package chapter03;

public class Study4 {

	public static void main(String[] args) {

		//형변환 연산자
		//형변환? 변수 또는 상수의 타입을 다른 타입으로 변환
		//(타입)피연산자
		double d = 85.4;
		int integer = (int)d;
		double cd = integer;
		System.out.println(d);
		System.out.println(cd);
		
		//자동형변환
		//컴파일러가 자동으로 형변환
		float f = 1234;
		//== float f = (float)1234;
		//int i = 3.14f; 
		//큰 -> 작은 => 값 손실 발생
		int i = (int)3.14f;
		//기존 값을 최대한 보존할 수 있는 타입으로 자동 형변환됨
		
		byte b1 = 100;
		byte b2 = (byte)100; //리터럴
		
		int i1 = 100;
		//byte b3 = i; i가 변수이고 i의 값을 모르기 때문에 컴파일러가 알 수 없다-> 에러 
		byte b3 = (byte)i; //수동형변환
		
		//byte b4 = 1000; byte타입의 범위를 벗어난 값 대입임으로 에러
		byte b4 = (byte)1000; //값 손실이 발생하여 b4에는 -24의 값이 저장
		
		
	}
}
