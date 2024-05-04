package chapter09;

public class Study10 {
	
	public static void main(String[] args) {

		//문자열과 숫자변환
		//문자열을 숫자로 변환하는 방법
		int i1 = new Integer("100").intValue(); //floatValue(), longValue(),...
		int i2 = Integer.parseInt("100"); //주로 많이 사용
		Integer i3 = Integer.valueOf("100");
		
		//문자열 -> 기본형
		byte b = Byte.parseByte("100");
		short s = Short.parseShort("100");
		int i = Integer.parseInt("100");
		long l = Long.parseLong("100");
		float f = Float.parseFloat("3.14");
		double d = Double.parseDouble("3.14");
		//문자열 -> 래퍼 클래스
		Byte b1 = Byte.valueOf("100"); //또는 Byte b1 = new Byte("100");
		Short s1 = Short.valueOf("100");
		Integer ii1 = Integer.valueOf("100");
		Long l1 = Long.valueOf("100");
		Float f1 = Float.valueOf("3.14");
		Double d1 = Double.valueOf("3.14");
		
		//래퍼 클래스 -> 문자열
		//.toString()
		
		//10진법이 아닌 문자열을 숫자로 변환하는 방법
		int i4 = Integer.parseInt("100",2); //100(2) -> 4
		int i5 = Integer.parseInt("100", 8); //100(8) -> 64
		int i6 = Integer.parseInt("100", 16); //100(16) -> 256
		int i7 = Integer.parseInt("FF",16); //FF(16) -> 255
		
		//오토박싱, 언박싱
		//오토박싱 : 기본형(int) -> 래퍼클래스(Integer)
		//언박싱 : 래퍼클래스(Integer) -> 기본형(int)
		//JDK1.5이전에는 기본형과 참조형 간의 연산이 불가능
		//기본형의 값을 객체로 자동변환하는 것을 오토박싱, 그 반대를 언박싱
		
		
	}

}
