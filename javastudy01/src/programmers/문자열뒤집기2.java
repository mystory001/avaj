package programmers;

public class 문자열뒤집기2 {
	
	public static void main(String[] args) {

		String my_string = "Progra21Sremm3";
		int s = 6;
		int e = 12;
		
		String answer = "";
		
//		StringBuilder sb = new StringBuilder();
//		for(int i = e; i >= s; i--) {
//			sb.append(my_string.charAt(i));
//		}
		
		for(int i = 0; i < s; i++) {
			answer+=my_string.charAt(i); //Progra
		}
		
		for(int i = e; i >=s; i--) {
			answer+=my_string.charAt(i); //ProgrammerS12
		}
		
		for(int i = e+1; i < my_string.length(); i++) {
			answer += my_string.charAt(i);
		}
		System.out.println(answer);
		
		//다른 풀이
		answer = my_string.substring(0, s) + new StringBuilder(my_string.substring(s, e + 1)).reverse().toString() + my_string.substring(e + 1);
		

		//다른 풀이
//		StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
//      answer.reverse();
//      return my_string.substring(0, s) + answer + my_string.substring(e + 1);
		
		
	}

}
