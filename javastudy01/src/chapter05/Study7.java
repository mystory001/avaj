package chapter05;

public class Study7 {

	public static void main(String[] args) {

		//2���� �迭
		//���̺� ������ �����͸� �����ϱ� ���� �迭
		
		/*
		 *   ����    ����    ����
		 * 1 100    100    100
		 * 2 50     30     40
		 * 3 40     50     60
		 * 4 70     80     90
		 */
		
		int[][] score = new int [4][3]; //4�� 3���� 2���� �迭 ����
		/*
		 *  0 0 0 
		 *  0 0 0
		 *  0 0 0
		 *  0 0 0
		 */
		
		/*
		 * �� index (0~����� - 1) ��
		 * �� index (0~������ - 1) ��
		 * 		0			1			2
		 *0  score[0][0] score[0][1] score[0][2]
		 *1  score[1][0] score[1][1] score[1][2]
		 *2  score[2][0] score[2][1] score[2][2]
		 *3  score[3][0] score[3][1] score[3][2]
		 */
		
		score[0][0] = 100;
		System.out.println(score[0][0]);
		
		//2���� �迭�� �ʱ�ȭ => 1���� �迭�� �迭
		int[][] arr = { {1,2,3},{4,5,6} }; //new int[][] �� ������
		// =>
		// int[][] arr = {
		//					{1,2,3}, //1�����迭
		//					{4,5,6}  //1�����迭
		//				 };
		
		
	}
	
}
