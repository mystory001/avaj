package exercise.chapter03;

public class Ex08 {

	public static void main(String[] args) {
		
		/**
		byte a = 10;
		byte b = 20;
		byte c = a + b;
		char ch = 'A';
		ch = ch + 2;
		float f = 3 / 2;
		long l = 3000 * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d==f2;
		
		������
		c=30
		ch=C
		f=1.5
		l=27000000000
		result=true
		 */
		//�� �ڵ忡�� �������� �����ؼ� ���� ����� ���� ����� �򵵷� �Ͻÿ�
		
		byte a = 10;
		byte b = 20;
		int c = a + b;
		char ch = 'A';
		ch = (char)(ch + 2);
		float f = 3 / 2f;
		long l = 3000l * 3000l * 3000l;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2;
		
		System.out.println("c="+c); 
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);

	}

}
