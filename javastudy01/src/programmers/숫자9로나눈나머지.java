package programmers;

import java.math.BigInteger;

public class ����9�γ��������� {

	public static void main(String[] args) {
		
		String number = "78720646226947352489";
		int answer = 0;
		
		//ó������ int�� �غ����� ������ number�� �������� Ŀ�� ��� int �׸��� long�� ������ ���
		//���� long���� �� ū ���� �ٷ���ϴ� ��쿡�� BigInterger Ŭ������ ����Ѵٰ� �Ѵ�.
//		BigInteger bi = new BigInteger(number);
//		BigInteger bi1 = new BigInteger("9");
//		System.out.println(bi.remainder(bi1));
//		
//		answer = bi.remainder(bi1).intValue();
		
		//�ٸ� Ǯ��
		for(int i = 0; i < number.length(); i++) {
			answer += number.charAt(i)-'0';
		}
		answer %= 9;
		System.out.println(answer);

	}

}
