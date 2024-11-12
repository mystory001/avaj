package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 공백으로구분하기2 {
	
	public static void main(String[] args) {

		String my_string = "i   love  you";
		
		//내가 푼 방법 => 원하는 결과가 맞지만 실패
//		String a = my_string.replaceAll("\\s+", " ");
		// 정규식 \s : \t, \n, \x0B, \f, \r 공백을 나타냄
		// +는 1번 이상을 의미 즉, "\s+"는 1번 이상의 공백을 의미
		
//		String[] x =  a.split(" "); //=> [i, love, you]
//		//원하는 결과는 ["i", "love", "you"]
//		
//		
//		ArrayList<String> answer = new ArrayList<String>();
//		
//		for(int i = 0; i<x.length;i++) {
//			answer.add("\""+x[i]+"\"");
//		}
//		
//		System.out.println(answer);
//		
		//내가 푼 다른 방법
		String[] answer = my_string.trim().replaceAll("\\s+", " ").split(" ");
	    System.out.println(Arrays.toString(answer));
		
		//이스케이프 문자 사용 및 메소드 사용 => 필요한 메소드 찾는데 조금 시간이 걸림
	      
		
	}

}
