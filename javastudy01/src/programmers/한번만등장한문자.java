package programmers;

import java.util.Arrays;

public class �ѹ��������ѹ��� {
	
	public static void main(String[] args) {

		String s = "hello";
		String answer = "";
		String[] sArr = s.split("");
		Arrays.sort(sArr);
		
		for(int i = 0; i < sArr.length; i++) {
			int count = 0;
			for(int j = 0; j < sArr.length; j++) {
				if(sArr[i].equals(sArr[j])) {
					count++;
				}
			}
			if(count ==1) {
				answer += sArr[i];
			}
		}
		
		System.out.println(answer);
		
	}

}
