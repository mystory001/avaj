package chapter09;

public class Study09 {
	
	public static void main(String[] args) {

		//Wrapper Ŭ���� �⺻������ ���δ� Ŭ����(Study09Ex1)
		//8���� �⺻���� ��ü�� �ٷ���� �� ����ϴ� Ŭ����
		
		//boolean(Boolean)
		//������ : Boolean(boolean value), Boolean(String s)
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = new Boolean("true");
		
		//char(Character)
		//������ : Character(char value)
		Character character = new Character('a');
		
		//byte(Byte)
		//������ : Byte(byte value), Byte(String s)
		Byte byte1 = new Byte((byte) 3);
		Byte byte2 = new Byte("10");
		
		//short(Short)
		//������ : Short(short value), Short(String s)
		Short short1 = new Short((short) 10);
		Short short2 = new Short("10");
		
		//int(Integer)
		//������ : Integer(int value), Integer(String s)
		Integer integer1 = new Integer(100);
		Integer integer2 = new Integer("100");
		
		//long(Long)
		//������ : Long(long value), Long(String s)
		Long long1 = new Long(100);
		Long long2 = new Long("100");
		
		//float(Float)
		//������ : Float(double value), Float(float value), Float(String s)
		Float float1 = new Float(1.0);
		Float float2 = new Float(1.0F);
		Float float3 = new Float("1.0F");
		
		//double(Double)
		//������ : Double(double value), Double(String s)
		Double double1 = new Double(1.0);
		Double double2 = new Double("1.0");
		
		//���ڹٴ� ��ü ���� ���, 90%�̻��� ��ü�� �̷����. 8���� �⺻���� ��ü�� �ƴ�. �⺻���� ����ϴ� ������ �ܼ��� ���ɶ���.
		
		//Number Ŭ����
		//��� ���� ���� Ŭ������ ����(Byte, Short, Integer, Long, Float, Double, BigInteger, BigDecimal)
		//���� ��ü -> �⺻��
		integer1.intValue();
		
		
		
		
	}

}
