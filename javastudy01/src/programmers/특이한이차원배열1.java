package programmers;

public class Ư�����������迭1 {

	public static void main(String[] args) {
		
		int n = 2;
		int[][] answer = new int[n][n];
		/* 
		 * 1 0
		 * 0 1
		 * */
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i==j) {
					answer[i][j] = 1;
				} else {
					answer[i][j] = 0;
				}
			}
		}
		
		//�ٸ� ��� Ǯ��
		//int ������ ���� �������� ������ 0����, ��ü ������ null
		for(int i = 0; i < n ; i++) {
			answer[i][i] = 1;
		}

	}

}
