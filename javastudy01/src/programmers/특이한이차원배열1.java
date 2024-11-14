package programmers;

public class 특이한이차원배열1 {

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
		
		//다른 사람 풀이
		//int 변수를 따로 지정하지 않으면 0으로, 객체 변수는 null
		for(int i = 0; i < n ; i++) {
			answer[i][i] = 1;
		}

	}

}
