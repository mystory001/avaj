package programmers;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class 중복된문자제거 {
	
	public static void main(String[] args) {

		String my_string = "people";
		String answer = "";
		
		//중복된 문자를 찾고 거기서 제거하는 식으로 하려고 했으나 코드가 복잡하고, 아래쪽 for문 코드를 작성하지 못하겠음
//		String dup = ""; //중복된 문자
//		
//		for(int i = 0; i < my_string.length(); i++) {
//			for(int j = i+1; j < my_string.length(); j++) {
//				if(my_string.charAt(i)==my_string.charAt(j)) {
//					dup+=my_string.charAt(i);
//				}
//			}
//		}
//		System.out.println(dup);
		
		for(int i = 0; i < my_string.length(); i++) {
			if(!answer.contains(String.valueOf(my_string.charAt(i)))) {
				answer+=my_string.charAt(i);
			}
		}
		System.out.println(answer);

		
		//다른 풀이
		String[] answerString = my_string.split("");
		Set<String> set = new LinkedHashSet<String>(Arrays.asList(answerString));
		String.join("", set);
		
	}

}
