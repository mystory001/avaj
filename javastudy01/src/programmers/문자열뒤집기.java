package programmers;

public class 문자열뒤집기 {
	
	public static void main(String[] args) {

		//문자열을 거꾸로 뒤집기
		String string = "abc";
		String answer = "";
		
		for(int i = string.length()-1; i>=0;i--) {
			answer += string.charAt(i);
		}
		
		System.out.println(answer);
		
		//다른 풀이
		StringBuilder sb = new StringBuilder();
		sb.append(string);
		sb.reverse();
		
		}

}
