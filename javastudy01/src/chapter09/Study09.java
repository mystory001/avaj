package chapter09;

public class Study09 {
	
	public static void main(String[] args) {

		//Wrapper 클래스 기본형값을 감싸는 클래스(Study09Ex1)
		//8개의 기본형을 객체로 다뤄야할 때 사용하는 클래스
		
		//boolean(Boolean)
		//생성자 : Boolean(boolean value), Boolean(String s)
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = new Boolean("true");
		
		//char(Character)
		//생성자 : Character(char value)
		Character character = new Character('a');
		
		//byte(Byte)
		//생성자 : Byte(byte value), Byte(String s)
		Byte byte1 = new Byte((byte) 3);
		Byte byte2 = new Byte("10");
		
		//short(Short)
		//생성자 : Short(short value), Short(String s)
		Short short1 = new Short((short) 10);
		Short short2 = new Short("10");
		
		//int(Integer)
		//생성자 : Integer(int value), Integer(String s)
		Integer integer1 = new Integer(100);
		Integer integer2 = new Integer("100");
		
		//long(Long)
		//생성자 : Long(long value), Long(String s)
		Long long1 = new Long(100);
		Long long2 = new Long("100");
		
		//float(Float)
		//생성자 : Float(double value), Float(float value), Float(String s)
		Float float1 = new Float(1.0);
		Float float2 = new Float(1.0F);
		Float float3 = new Float("1.0F");
		
		//double(Double)
		//생성자 : Double(double value), Double(String s)
		Double double1 = new Double(1.0);
		Double double2 = new Double("1.0");
		
		//※자바는 객체 지향 언어, 90%이상이 객체로 이루어짐. 8개의 기본형은 객체가 아님. 기본형을 사용하는 이유는 단순히 성능때문.
		
		//Number 클래스
		//모든 숫자 래퍼 클래스의 조상(Byte, Short, Integer, Long, Float, Double, BigInteger, BigDecimal)
		//래퍼 객체 -> 기본형
		integer1.intValue();
		
		
		
		
	}

}
