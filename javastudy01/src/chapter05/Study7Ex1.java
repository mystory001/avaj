package chapter05;

public class Study7Ex1 {

	public static void main(String[] args) {

		/* 100    100    100
		 * 50     30     40
		 * 40     50     60
		 * 70     80     90
		 * 2차원 배열로 만들어보기
		 */
		
		int[][] score = {
				{100, 100, 100},
				{50, 30, 40},
				{40, 50, 60},
				{70, 80, 90}
		};
		int sum = 0;
		
		for(int i = 0; i< score.length;i++) {
			for(int j = 0; j < score[i].length;j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				sum += score[i][j];
			}
		}
		System.out.println("sum = " + sum);
		
		
	}
	
}
