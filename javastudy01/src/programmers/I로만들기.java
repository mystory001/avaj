package programmers;

public class I로만들기 {

	public static void main(String[] args) {
		
		String myString = "abcdevwxyz";
		
		//a = 97, l = 105 
		System.out.println((int)'l');
		
		String answer = "";
		
		for(int i = 0; i<myString.length(); i++) {
			if('a'<=myString.charAt(i)&&myString.charAt(i)<='k') {
				answer += "l";
			} else {
				answer += myString.charAt(i);
			}
		}
		
		System.out.println(answer);
		
		//다른 사람 풀이 => 정규표현식을 이용
//		myString.replaceAll("[a-l]", "l");

	}

}
