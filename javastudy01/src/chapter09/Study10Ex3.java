package chapter09;

public class Study10Ex3 {

	public static void main(String[] args) {

		int i = 10;
		
		//기본형을 참조형으로 형 변환(형변환 생략 가능)
		Integer integer = (Integer)i; //Integer intger = Integer.valueOf(i);
		Object obj = (Object)i; //Object obj = (Object)Integer.valueOf(i);
		
		Long long1 = 100L; //Long long1 = new Long(100L);
		int i2 = integer + 10; //참조형과 기본형간의 연산. 가능
		long l = integer +long1; //참조형 간의 덧셈 가능
		
		Integer integer2 = new Integer(20);
		int i3 = (int)integer2; //참조형을 기본형으로 형변환도 가능(형변환 생략가능)
		
		//컴파일 전 코드
		//Integer integer = (Integer)i;
		//Object obj = (Object)i;
		//Long long1 = 100L;
		
		//컴파일 후 코드
		//Integer integer = Integer.valueOf(i);
		//Object obj = (Object)Integer.valueOf(i);
		//Long long1 = new Long(100L);
		
	}
	
}
