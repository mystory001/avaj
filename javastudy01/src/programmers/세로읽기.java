package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class �����б� {

	public static void main(String[] args) {
		
		String my_string = "ihrhbakrfpndopljhygc";
		int m = 4;
		int c = 2;

		//ihrh
		//bakr
		//fpnd
		//oplj
		//hygc

		
		//for�� ������ => [i][c]
		
		//my_string�� 2���� �迭�� [my_string.length()/m][m]
//		String[][] test = {{"i","h","r","h"},{"b","a","k","r"},{"f","p","n","d"},{"o","p","l","j"},{"h","y","g","c"}};
//		for(int i = 0 ; i < test[0].length; i++) {
//				System.out.println(test[c][i]);
//		}
//		System.out.println(test[0][1]);
		
		String[][] strArr = new String[my_string.length()/m][m];
		String answer = "";
		
//		for(int i = 0; i < my_string.length()/m; i++) {
//				strArr[i] = my_string.charAt(i); //Ÿ���� ��ġ���� �ʾ� ���� �߻�
//		}
		int idx = 0;
		for(int i = 0 ; i < my_string.length()/m; i++) {
			for(int j = 0; j < m; j++) {
//				strArr[i][j] = my_string.charAt(idx++); //�� ���� Ÿ�� ��ġ X. my_string.charAt(i)�� char�̹Ƿ�, String���� ��ȯ => String.valueOf(my_string.valueOf(����));
				strArr[i][j] = String.valueOf(my_string.charAt(idx++));
			}
		}
		
		for(int i = 0; i < my_string.length()/m; i++) {
				answer+=strArr[i][c-1];
		}

		System.out.println(answer);
		
		//�ҿ� �ð� 1�ð� 30��
		
		//�ٸ� ��� Ǯ��
		for(int i = c-1; i < my_string.length(); i +=m) {
			answer+=my_string.charAt(i);
		}
		
		
		
	}

}
