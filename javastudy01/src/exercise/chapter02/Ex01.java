package exercise.chapter02;

public class Ex01 {

	public static void main(String[] args) {
		
		/**
		 * 1. �⺻�� ũ��
		 * 
		 * ����\ũ��	1byte	2byte	4byte	8byte
		 * ����		boolean
		 * ������				char					//char�� 2byte
		 * ������		byte	short	int		long
		 * �Ǽ���						float	double
		 */
		
		/**
		 * 2. �ֹι�ȣ�� ���ڷ� �����ϰ����Ѵ�. �� ���� �����ϱ� ���ؼ��� � �ڷ����� �����ؾ��ϸ�,
		 *    regNo��� �̸��� ������ �����ϰ� �ʱ�ȭ�ϴ� �� ���� �ڵ带 �ۼ�
		 *    		 
		 *  long regNo = 0001013123456L;
		 */
		
		/**
		 * 3. ���ͷ�, ����, ���, Ű�����?
		 * int i = 100;
		 * long l = 100L;
		 * final float PI = 3.14f;
		 * 
		 * ���ͷ� : 100, 100l, 3.14f
		 * ���� : i, l
		 * Ű���� : int, long, float, final
		 * ��� : PI
		 */
		
		/**
		 * 4. �⺻���� �ƴ� ����
		 * 
		 * => b. Byte
		 */
		
		/**
		 * 5. ��� ���
		 * =>
		 * System.out.println("1"+"2"); //12
		 * System.out.println(true+""); //true
		 * System.out.println('A'+'B'); //131
		 * System.out.println('1'+2); //49+2 = 51
		 * System.out.println('1'+'2'); //49+50 = 99
		 * System.out.println('J'+"ava"); //Java
		 * System.out.println(true+null); //����
		 */
		
		/**
		 * 6. Ű���尡 �ƴ� ����?
		 * 
		 * => True, NULL, Class, System
		 * �� Java���� ����ϴ� Ű����
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
		 * 7. ���� �̸����� ����� �� �ִ� ����?
		 * 
		 * => $ystem, If, �ڹ�, $MAX_NUM
		 * �� ������ �̸� ��Ģ
		 * ��ҹ��ڰ� ���еǸ� ���̿� ������ ����(if�� If�� ���� �ٸ� ������ ���ֵ�)
		 * ����� ��� �Ұ�(True�� ����������, true�� ������̱� ������ ��� �Ұ�)
		 * ���ڷ� ������ �� ����
		 * Ư�����ڴ� '_'�� '$'�� ��� 
		 */
		
		/**
		 * 8. ������ ������ ���� ũ���� �⺻����?
		 * 
		 * => int, float
		 * �� ������ ������ 4byte
		 */
		
		/**
		 * 9. ����ȯ�� ������ �� �ִ� ����
		 * byte b = 10;
		 * char ch = 'A';
		 * int i = 100;
		 * long l = 1000L;
		 * 
		 * => d, e 
		 */
		
		/**
		 * 10. char Ÿ���� ������ ����� �� �ִ� ���� ���� ����?
		 * 
		 * => 0~65535
		 * �� char�� 2byte(2*8=16bit)�̹Ƿ� 2^16���� ���� ǥ���� �� ����
		 * 2^16=65536�̸� 0�� �����ؾ��ϱ� ������ 0~65535�� char�� ������ ��
		 */
		
		/**
		 * 11. ������ �߸� �ʱ�ȭ�� ����?
		 * 
		 * => a, b, c, d
		 * �� byte�� -128~127 ������ �Ѵ� ������ �ʱ�ȭ �Ұ�
		 * char�� �ݵ�� �Ѱ��� ���ڸ� ����������� cf, String s = ""; ����. ���� �� ���� ���ڸ� ����
		 * float���� ���̻� f�� ���̰ų� �� ��ȯ(double) �ʿ�
		 */
		
		/**
		 * 12. main �޼ҵ��� ����η� �˸��� ����?
		 * 
		 * => a, b, c, e
		 * �� �޼ҵ� �����
		 * �Ű����� args�� �̸��� �޶� ��
		 * public�� static�� ��ġ�� �ٲ� ��
		 * void�� �ݵ�� main �տ� ��ġ�ؾ���. public void static main �Ұ�
		 */
		
		/**
		 * 13. Ÿ�԰� �⺻���� �߸� ����� ����
		 * 
		 * => c, e, f
		 * �� Ÿ���� �⺻��
		 * boolean = false
		 * char = '\u0000'
		 * int = 0
		 * long = 0L
		 * float = 0.0f
		 * String = null
		 */
	}

}
