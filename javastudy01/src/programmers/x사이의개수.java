package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class x�����ǰ��� {
	
	public static void main(String[] args) {
		
		String myString = "oxooxoxxox";
//		int[] answer = myString.split("x");
//		String[] a = myString.trim().split("x",myString.length());
		String[] a = myString.split("x",myString.length()); //trim()�� ��� �ȴ�.
		System.out.println(Arrays.toString(a));
		int[] answer = new int[a.length];
		int count = 0; //answer ��ҿ� �� ����
		
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
