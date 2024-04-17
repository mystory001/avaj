package chapter05;

public class Study7 {

	public static void main(String[] args) {

		//2차원 배열
		//테이블 형태의 데이터를 저장하기 위한 배열
		
		/*
		 *   국어    영어    수학
		 * 1 100    100    100
		 * 2 50     30     40
		 * 3 40     50     60
		 * 4 70     80     90
		 */
		
		int[][] score = new int [4][3]; //4행 3열의 2차원 배열 생성
		/*
		 *  0 0 0 
		 *  0 0 0
		 *  0 0 0
		 *  0 0 0
		 */
		
		/*
		 * 행 index (0~행길이 - 1) ㅣ
		 * 열 index (0~열길이 - 1) ㅡ
		 * 		0			1			2
		 *0  score[0][0] score[0][1] score[0][2]
		 *1  score[1][0] score[1][1] score[1][2]
		 *2  score[2][0] score[2][1] score[2][2]
		 *3  score[3][0] score[3][1] score[3][2]
		 */
		
		score[0][0] = 100;
		System.out.println(score[0][0]);
		
		//2차원 배열의 초기화 => 1차원 배열의 배열
		int[][] arr = { {1,2,3},{4,5,6} }; //new int[][] 가 생략됨
		// =>
		// int[][] arr = {
		//					{1,2,3}, //1차원배열
		//					{4,5,6}  //1차원배열
		//				 };
		
		
	}
	
}
