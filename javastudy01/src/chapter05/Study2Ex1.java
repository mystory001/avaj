package chapter05;

public class Study2Ex1 {

	public static void main(String[] args) {

		//index ���� : 0 ~ 9
		int[] arr = new int[10]; //���̰� 10�� int �迭
		int tem = arr.length; //arr.length�� ���� 10, tmp�� 10�� ����
		System.out.println("arr.length = " + tem);
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println("arr["+ i + "] = " + arr[i]);
		}
		
		System.out.println();
		
		//�迭�� �ʱ�ȭ
		int[] score = new int[5]; //���̰� 5�� int�� �迭�� ����
//		score[0] = 50; //�� ��ҿ� ���� ���� ����
//		score[1] = 60;
//		score[2] = 70;
//		score[3] = 80;
//		score[4] = 90;
		
		for(int i = 0; i < score.length; i++) {
			score[i] = i * 10 + 50;
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
	}
	
}
