package chapter09;

public class Study06 {
	
	public static void main(String[] args) {

		//StringBuffer Ŭ����
		//Stringó�� ������ �迭(char[])�� ���������� ������ ����
		//String�� �޸� ������ ������ �� ����(mutable)
		
		//StringBuffer�� ������
		//�迭�� ���� ���� �Ұ�. ������ �����ϸ� ���ο� �迭 ����
		//������� �迭�� ũ�Ⱑ �������� �� ũ�Ⱑ �� ū ���ο� �迭�� ������ �� ���� �迭�� ������ ����, ���� ����
		//StringBuffer�� ������ ���ڿ��� ���̸� ����ؼ� ������ ũ��� ����
		//�ع����� ũ�⸦ �������� ������ ������ ũ��� 16�̵�.
		
		//StringBuffer�� ����
		//StringBuffer�� String�� �޸� ���� ������ ����
		//StringBuffer sb = new StringBuffer("abc");
		//sb.append("123");
		//��append() : ���� ���ڿ� �߰�, delete() : ����, insert() ����
		//append()�� ������ ������ StringBuffer�� �߰� ��, StringBuffer�� ������ ��ȯ(Study06Ex2)
		
		//StringBuffer�� ��
		//StringBuffer�� equals()�� �������̵��Ǿ� ���� ����.(�ּҺ�)
		//StringBuffer sb1 = new StringBuffer("abc");
		//StringBuffer sb2 = new StringBuffer("abc");
		//System.out.println(sb1==sb2); //false
		//System.out.println(sb1.equals(sb2)); //false
		//StringBuffer�� String���� ��ȯ�� �Ŀ� equals()�� ���ؾ���
		//String s1 = sb1.toString();
		//String s2 = sb2.toString();
		//System.out.println(s1.equals(s2)); //true
		
	}

}
