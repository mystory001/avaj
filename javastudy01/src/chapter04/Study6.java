package chapter04;

public class Study6 {

	public static void main(String[] args) {

		//while��
		//������ ������Ű�� ���� ��� {}�� �ݺ� - �ݺ�Ƚ���� �� �� ���
		// while(���ǽ�){
		//	���ǽ��� �������� true�� ����, �ݺ��� ����
		//}
		
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		
		int sum = 0;
		int i1 = 0;
		//i�� 1�� �������� sum�� ��� ���س���
		while (sum<=100) {
			System.out.println(i1 + ", " + sum);
			sum += ++i1;
		}
		
		//do-while��
		//�� {}�� �ּ��� �� �� �̻� �ݺ� - ����� �Է¹��� �� ����
		//do{
		//		//���ǽ��� �������� ���� �� ����� ����(ó�� �� ���� ������ ����)
		//} while(���ǽ�);
		
		
	}
}
