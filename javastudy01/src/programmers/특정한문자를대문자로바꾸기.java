package programmers;

public class 특정한문자를대문자로바꾸기 {

	public static void main(String[] args) {

		String my_string = "programmers";
		String alp = "m";
		String answer = "";
		
		answer = my_string.replace(alp, alp.toUpperCase());
		
		//다른 풀이
//		for(int i = 0; i <my_string.length(); i++) {
//			String s = my_string.charAt(i)+"";
//			if(s.equals(alp)) {
//				s = s.toUpperCase();
//			}
//			answer += s;
//		}
		
	}

}
