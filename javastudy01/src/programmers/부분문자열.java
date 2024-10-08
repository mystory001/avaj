package programmers;

public class 부분문자열 {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "aabcc";
		
		int answer = 0;
		
		if(str2.contains(str1)) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		System.out.println(answer);
		
		//삼항 연산자 풀이
		answer = str2.contains(str1)? 1:0;

	}

}
