package chapter09;

public class Study04 {
	
	public static void main(String[] args) {

		//String ������

		//String(String s) �־��� ���ڿ�(s)�� ���� String �ν��Ͻ��� ����
		String string = new String("Hello");
		//String(char[] value) �־��� ���ڿ�(value)�� ���� String �ν��Ͻ��� ����
		char[] c = {'H','e','l','l','o'};
		String string2 = new String(c);
		//String(StringBuffer buf) StringBuffer �ν��Ͻ��� ���� �ִ� ���ڿ��� ���� ������ String �ν��Ͻ��� ����
		StringBuffer sb = new StringBuffer("Hello");
		String string3 = new String(sb);
		//char charAt(int index) ������ ��ġ(index)�� �ִ� ���ڿ��� �˷���. index�� 0���� ����
		String string4 = "Hello";
		String n = "0123456";
		char c1 = sb.charAt(1);
		char c2 = n.charAt(1);
		//int compareTo(String str) ���ڿ�(str)�� ���������� ��. ������ 0, ���������� �����̸� ����, ���ĸ� ����� ��ȯ
		int i1 = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		//String concat(String str) ���ڿ�(Str)�� �ڿ� ������
		String string5 = "Hello";
		String string6 = string5.concat(" World");
		//boolean contains(CharSequence s) ������ ���ڿ�(s)�� ���ԵǾ� �ִ��� �˻�
		
		
	}

}
