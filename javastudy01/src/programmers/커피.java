package programmers;

public class Ŀ�� {
	
	public static void main(String[] args) {

		//Ŀ�� �� �� ������ 5500��
		//�ִ�� ���� �� �ִ� Ŀ�� �� ���� ���� ���� �迭�� ���
		
		int money = 0; //���� �ݾ�
		int[] answer = new int[2]; //���� �ݾ����� �ִ�� ���� �� �ִ� Ŀ�� ��, ���� ��
		
		answer[0] = (int)(money/5500);
		answer[1] = (int)(money%5500);
		
		for(int i = 0; i<answer.length;i++) {
			System.out.println(answer[i]);
		}
		
	}

}
