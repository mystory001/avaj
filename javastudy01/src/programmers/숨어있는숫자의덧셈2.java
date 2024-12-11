package programmers;

import java.util.StringTokenizer;

public class 숨어있는숫자의덧셈2 {
	
	public static void main(String[] args) {

		String my_string = "1a2b3c4d123Z";
		int answer = 0;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < my_string.length(); i++) {
			char ch = my_string.charAt(i);
			
			if('0'<= ch && ch <= '9') {
				sb.append(ch);
			} else {
				if(sb.length()>0) {
					answer += Integer.parseInt(sb.toString());
					sb.setLength(0);
				}
			}
		}
		
		if(sb.length()>0) {
			answer += Integer.parseInt(sb.toString());
		}
		System.out.println(answer);
		
		// 다른 풀이
		String lower_string = my_string.toLowerCase();
		StringTokenizer st = new StringTokenizer(lower_string,"abcdefghijklmnopqrstuvwxyz");
		answer = 0;
		while(st.hasMoreTokens()) {
			answer+= Integer.parseInt(st.nextToken());
		}
		System.out.println(answer);
		
		// StringTokenizer : 문자열을 지정한 구분자로 문자열을 쪼개주는 클래스. 쪼개진 문자열을 토큰(token)
		// public StringTokenizer(String str, String delim) : 특정 delim으로 문자열을 분리
		
		// 다른 풀이
		String[] strArr = my_string.replaceAll("[a-zA-Z]"," ").split(" ");
		answer = 0;
		for(String s : strArr) {
			if(!s.equals("")) {
				
				answer += Integer.parseInt(s);
			}
		}
		System.out.println(answer);
		
	}

}
