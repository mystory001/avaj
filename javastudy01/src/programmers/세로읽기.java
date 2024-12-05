package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 세로읽기 {

	public static void main(String[] args) {
		
		String my_string = "ihrhbakrfpndopljhygc";
		int m = 4;
		int c = 2;

		//ihrh
		//bakr
		//fpnd
		//oplj
		//hygc

		
		//for문 돌릴때 => [i][c]
		
		//my_string을 2차원 배열로 [my_string.length()/m][m]
//		String[][] test = {{"i","h","r","h"},{"b","a","k","r"},{"f","p","n","d"},{"o","p","l","j"},{"h","y","g","c"}};
//		for(int i = 0 ; i < test[0].length; i++) {
//				System.out.println(test[c][i]);
//		}
//		System.out.println(test[0][1]);
		
		String[][] strArr = new String[my_string.length()/m][m];
		String answer = "";
		
//		for(int i = 0; i < my_string.length()/m; i++) {
//				strArr[i] = my_string.charAt(i); //타입이 일치하지 않아 오류 발생
//		}
		int idx = 0;
		for(int i = 0 ; i < my_string.length()/m; i++) {
			for(int j = 0; j < m; j++) {
//				strArr[i][j] = my_string.charAt(idx++); //이 역시 타입 일치 X. my_string.charAt(i)는 char이므로, String으로 변환 => String.valueOf(my_string.valueOf(변수));
				strArr[i][j] = String.valueOf(my_string.charAt(idx++));
			}
		}
		
		for(int i = 0; i < my_string.length()/m; i++) {
				answer+=strArr[i][c-1];
		}

		System.out.println(answer);
		
		//소요 시간 1시간 30분
		
		//다른 사람 풀이
		for(int i = c-1; i < my_string.length(); i +=m) {
			answer+=my_string.charAt(i);
		}
		
		
		
	}

}
