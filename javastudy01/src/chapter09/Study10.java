package chapter09;

public class Study10 {
	
	public static void main(String[] args) {

		//���ڿ��� ���ں�ȯ
		//���ڿ��� ���ڷ� ��ȯ�ϴ� ���
		int i1 = new Integer("100").intValue(); //floatValue(), longValue(),...
		int i2 = Integer.parseInt("100"); //�ַ� ���� ���
		Integer i3 = Integer.valueOf("100");
		
		//���ڿ� -> �⺻��
		byte b = Byte.parseByte("100");
		short s = Short.parseShort("100");
		int i = Integer.parseInt("100");
		long l = Long.parseLong("100");
		float f = Float.parseFloat("3.14");
		double d = Double.parseDouble("3.14");
		//���ڿ� -> ���� Ŭ����
		Byte b1 = Byte.valueOf("100"); //�Ǵ� Byte b1 = new Byte("100");
		Short s1 = Short.valueOf("100");
		Integer ii1 = Integer.valueOf("100");
		Long l1 = Long.valueOf("100");
		Float f1 = Float.valueOf("3.14");
		Double d1 = Double.valueOf("3.14");
		
		//���� Ŭ���� -> ���ڿ�
		//.toString()
		
		//10������ �ƴ� ���ڿ��� ���ڷ� ��ȯ�ϴ� ���
		int i4 = Integer.parseInt("100",2); //100(2) -> 4
		int i5 = Integer.parseInt("100", 8); //100(8) -> 64
		int i6 = Integer.parseInt("100", 16); //100(16) -> 256
		int i7 = Integer.parseInt("FF",16); //FF(16) -> 255
		
		//����ڽ�, ��ڽ�
		//����ڽ� : �⺻��(int) -> ����Ŭ����(Integer)
		//��ڽ� : ����Ŭ����(Integer) -> �⺻��(int)
		//JDK1.5�������� �⺻���� ������ ���� ������ �Ұ���
		//�⺻���� ���� ��ü�� �ڵ���ȯ�ϴ� ���� ����ڽ�, �� �ݴ븦 ��ڽ�
		
		
	}

}
