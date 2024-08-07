package programmers;

public class 대문자소문자변환 {
	
	public static void main(String[] args) {

		//대문자 A 65, Z 90
		//소문자 a 97, z 122
		
		String my_string = "aabXYZ";
		String answer = "";
		
		for(char ch : my_string.toCharArray()) {
			if(ch>=97 && ch<=122) {
				answer+=(char)(ch-32);
			} else if(ch>=65 && ch<=90) {
				answer+=(char)(ch+32);
			}
		}
		System.out.println(answer);
		
		//다른 풀이
		for(char a : my_string.toCharArray()) {
			if(Character.isLowerCase(a)) {
				answer+=Character.toUpperCase(a);
			} else {
				answer+=Character.toLowerCase(a);
			}
		}
		
	}

}
