package programmers;

import java.util.Arrays;

public class ���̻�迭 {
	
	public static void main(String[] args) {

		String my_string = "banana";
		String[] answer = new String[my_string.length()];
		
		for(int i = 0; i < my_string.length(); i++) {
			answer[i] = my_string.substring(i);
		}
		//substring() : ���ڿ��� Ư�� �κ��� �߶󳻴� �� ���
		
		System.out.println(Arrays.toString(answer));
		
		Arrays.sort(answer);
		
	}

}
