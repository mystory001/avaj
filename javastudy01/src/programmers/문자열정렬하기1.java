package programmers;

import java.util.ArrayList;
import java.util.Comparator;

public class 문자열정렬하기1 {
	
	public static void main(String[] args) {

		String my_string = "hi12392";
		
		StringBuilder sb = new StringBuilder(my_string);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < my_string.length(); i++) {
			if('0'<=my_string.charAt(i)&&my_string.charAt(i)<='9') {
				list.add((int) my_string.charAt(i)-'0');
			}
		}
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).intValue();
		}
		
	}

}
