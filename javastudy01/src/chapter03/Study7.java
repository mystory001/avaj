package chapter03;

public class Study7 {
	
	public static void main(String[] args) {

		//�񱳿����� >, <, >=, <=, ==, !=
		//=>, =<, =! �̷��� ����ϴ� �͸� ����
		
		//���ڿ��� ��
		//���ڿ� �񱳿��� == ��� equals() �޼ҵ带 ����ؾ���
		//==�� ����� ������ �ϳ� �ùٸ� ����� ������ ���� ���� ����
		
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2); //true
		System.out.println(str1.equals(str2)); //true
		
		String string1 = new String("abc");
		String string2 = new String("abc");
		System.out.println(string1==string2); //false
		System.out.println(string1.equals(string2)); //true
		
	}
}
