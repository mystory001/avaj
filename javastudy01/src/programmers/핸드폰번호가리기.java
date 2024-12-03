package programmers;

public class 핸드폰번호가리기 {
	
	public static void main(String[] args) {
		
		
		//전화번호의 뒷자리 4자리를 제외한 나머지 숫자를 *으로 가리기
		String phone_number = "01033334444";
		String answer = "";
		
		for(int i = phone_number.length()-5; i>=0; i--) {
			answer+="*";
		}
		for(int i = phone_number.length()-4; i < phone_number.length(); i++) {
			answer+=phone_number.charAt(i);
		}
		
		System.out.println(answer);
		
		//다른 풀이
		char[] ch = phone_number.toCharArray();
		for(int i = 0; i < ch.length - 4; i++) {
			ch[i] = '*';
		}
		
		//다른 풀이
		phone_number.replaceAll(".(?=.{4})", "*");
		
		
	}

}
