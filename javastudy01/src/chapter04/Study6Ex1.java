package chapter04;

public class Study6Ex1 {

	public static void main(String[] args) {

		int num = 12345, sum = 0;
		
		//10���� ������ ������ �ϸ� ������ �ڸ��� ����
	
		for(num = 12345; num > 0; num /= 10) {
			System.out.println(num%10);
			sum += num%10;
		}
		
		//==
//		while (num > 0) {
//			sum += num %10;
//			System.out.println(sum +", " + num%10);
//			num = num / 10;
//		}
		
		System.out.println("�� �ڸ����� �� " + sum);
		
	}
}
