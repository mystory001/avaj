package chapter09;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Study03 {
	
	public static void main(String[] args) {

		//String Ŭ���� ���ڿ��� �ٷ�� ���� Ŭ����
		//String Ŭ���� = ������(char[]) + �޼���(���ڿ� ����)
		//������ ������ �� ���� �Һ�(immutable) Ŭ����
		String a = "a";
		String b = "b";
		a = a + b;
		//���� �����ڸ� �̿��� ���ڿ� ������ ������ ������, ���ڿ��� �����̳� ������ ���ٸ�, ������ ���氡���� StringBuffer�� ���
		
		//���ڿ� ��(String str = "abc";�� String str = new String("abc");�� ��)
		String str1 = "abc"; //���ڿ� ���ͷ� "abc"�� �ּҰ� str1�� ����
		String str2 = "abc"; //���ڿ� ���ͷ� "abc"�� �ּҰ� str2�� ����
		//new�� �̿��ϸ� �׻� ���ο� ���ڿ��� �������
		String str3 = new String("abc"); //���ο� String �ν��Ͻ��� ����
		String str4 = new String("abc"); //���ο� String �ν��Ͻ��� ����
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		
		//���ڿ� ���ͷ�
		//���α׷� ���� �� �ڵ����� ����(constant pool�� ����)
		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = "AAA";
		String s4 = "BBB";
		//���� ������ ���ڿ� ���ͷ��� �ϳ��� ��������� ���� ����
		
		//�� ���ڿ�("", empty string)
		//������ ���� ���ڿ�. ũ�Ⱑ 0�� char�� �迭�� �����ϴ� ���ڿ�
		String str = ""; //str�� �� ���ڿ��� �ʱ�ȭ
		//ũ�Ⱑ 0�� �迭�� �����ϴ� ���� ��� Ÿ���̳� ����
		char[] chArr = new char[0]; //���̰� 0�� char �迭
		int[] iArr = {}; //���̰� 0�� int �迭
		//����(char)�� ���ڿ�(String)�� �ʱ�ȭ
		String s = null;
		s = ""; //���ڷ� �ʱ�ȭ
		char c = '\u0000';
		c = ' '; //�������� �ʱ�ȭ 
		
	}

}
