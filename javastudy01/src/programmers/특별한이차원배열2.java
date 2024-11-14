package programmers;

public class 특별한이차원배열2 {
	
	public static void main(String[] args) {

		int[][] arr = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723},{587, 754, 723, 81}};
		int answer = 0;
		
		for(int i = 0; i < 1; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i][j] == arr[j][i]) {
					answer = 1;
				} else {
					answer = 0;
					break;
				}
			}
		}
		System.out.println(answer);
	}

}
