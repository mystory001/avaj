package programmers;

public class 문자열안에문자열 {

	public static void main(String[] args) {
		
		String str1 = "asdf";
		String str2 = "cc";
		
		//contains() : 문자 안에 문자열을 포함하는지 참, 거짓으로 반환
		
		String answer = "0"; 
		
		if(str1.contains(str2)) {
			answer = "문자열이 존재함";
		} else {
			answer = "문자열이 존재하지 않음";
		}
		
		System.out.println(answer);
		
		

	}

}
