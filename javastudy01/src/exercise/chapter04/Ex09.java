package exercise.chapter04;

public class Ex09 {

	public static void main(String[] args) {
		
		//���ڷ� �̷���� ���ڿ� str�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ�
		//���� ���ڿ��� 12345���, 1+2+3+4+5�� ����� 15�� ���
		String str = "123456";
		int sum = 0;
		for(int i =0; i<str.length();i++) {
			sum+= str.charAt(i)-48;
		}
		System.out.println(sum);
		

	}

}
