package chapter02;

public class Study4 {

	public static void main(String[] args) {

		//리터럴의 접두사와 접미사
		boolean power = true;
		char ch = 'A';
		String string ="ABC";
		byte b = 127;
		//byte b1 = 128; 
		int i = 100; //10진수
		int oct = 0100; //8진수
		int hex = 0x100; //16진수
		//접두사 0, 0x, 0b(2진 접두사)
		//접미사 L, F
		
		long l = 10_000_000_000L;
		long l1 = 100;
		
		float f = 3.14F;
		double d = 3.14; 
		
		//10. => 10.0
		//.10 => 0.10
		//10F => 10.0F
		//1e3 => 1000.0
		
		//변수와 리터럴의 타입 불일치
		//범위가 변수 > 리터럴 인 경우 => 가능
		int x = 'A'; //int > char
		long y = 123; //long > int
		double z = 3.14F; //double > float
		
		//범위가 변수 < 리터럴 인 경우 => 불가능
		//int x1 = 30_0000_0000;
		//long y1 = 3.14F;
		//float z1 = 3.14;
		
		//byte, short 변수에 int 리터럴 저장 가능
		//단, 변수의 타입의 범위 이내여야함
		byte b1 = 100;
		//byte b2 = 128;
		
		
		
		
		
	}
}
