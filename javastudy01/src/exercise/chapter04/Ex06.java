package exercise.chapter04;

public class Ex06 {

	public static void main(String[] args) {
		
		//�� ���� �ֻ����� ������ ��, ���� ���� 6�̵Ǵ� ��� ����� ���� ���
		//�ֻ��� A, �ֻ��� B
		//1-5,2-4,3-3,4-2,5-1 5������ ����� ���� ����
		for(int i = 1; i<=6;i++) {
			for(int j = 1; j<=6;j++) {
				if(i+j==6) {
					System.out.println("i = " + i + " j = "+ j +" ���� 6�� �Ǵ� ��� " + i +", " +j);
				}
			}
		}
		
		
	}

}
