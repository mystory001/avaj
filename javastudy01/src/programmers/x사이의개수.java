package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class x사이의개수 {
	
	public static void main(String[] args) {
		
		String myString = "oxooxoxxox";
//		int[] answer = myString.split("x");
//		String[] a = myString.trim().split("x",myString.length());
		String[] a = myString.split("x",myString.length()); //trim()이 없어도 된다.
		System.out.println(Arrays.toString(a));
		int[] answer = new int[a.length];
		int count = 0; //answer 요소에 들어갈 변수
		
		for(int i = 0; i<a.length;i++) {
			if(a[i]!="") {
				count=a[i].length();
				answer[i] = count;
			}
			count = 0;
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
