package chapter05;

public class Study8 {

	public static void main(String[] args) {

		//String Ŭ����
		//1. String Ŭ������ char[]�� �޼��带 ������ ��
		//2. String Ŭ������ ������ ������ �� ����(�б⸸ ����)
		//ex) String a = "a", b = "b"; 
		//    a = a + b => ab��� �������� ����
		
		//String Ŭ������ �ֿ� �޼���
		//char charAt(int index) ���ڿ����� �ش� ��ġ�� �ִ� ���ڸ� ��ȯ
		String string1 = "ABCDE";
		char ch1 = string1.charAt(3); //���ڿ� string�� 4��° ���� D�� ch�� ����
		//int length() ���ڿ��� ���̸� ��ȯ
		string1.length(); //5
		//String substring(int from, int to) ���ڿ����� �ش� ����(from ~ to)�� ���ڿ��� ��ȯ(to�� ���� �ȵ�)
		//String substring(int from) to ������ from���� ������ ��ȯ (== String substring(int from, .length())
		String string2 = "012345";
		String temp1 = string2.substring(1,4);//string2���� index���� 1~4�� ���ڸ� ��ȯ
		System.out.println(temp1);
		//boolean equals(Obeject obj) ���ڿ��� ������ ������ Ȯ��
		//char[] toCharArray() ���ڿ��� ���ڹ迭�� ��ȯ�ؼ� ��ȯ
		
		
	}
	
}
