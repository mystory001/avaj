package programmers;

public class �ִ񰪸����2 {

	public static void main(String[] args) {

		int[] numbers = {0, -31, 24, 10, 1, 9};
//		int[] numbers = {10, 20, 30, 5, 5, 20, 5};
//		int answer = 0;
		int answer = Integer.MIN_VALUE; //�ʱⰪ ����. ��� ���� ����� ���� �� �ֵ��� ��
		
		//for��
		// 0*-31, 0*24, 0*10, 0*1, 0*9,
		//-31*24, -31*10, -31*1, -31*9
		//24*10, 24*1, 24*9
		//10*1, 10*9
		//1*9
		//���⼭ �� �� �ִ밪�� answer�� ����
		for(int i = 0; i<numbers.length;i++) {
			for(int j = i+1; j<numbers.length; j++) {
				answer = Math.max(numbers[i]*numbers[j],answer);
			}
		}
		
		System.out.println(answer);
		
		//�׽�Ʈ 7���� ����
		//int answer = Integer.MIN_VALUE �� �������ִ� ��.
		
		
	}
	
}
