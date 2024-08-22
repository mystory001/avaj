package programmers;

public class 문자열곱하기 {

	public static void main(String[] args) {
		
		String my_string = "string";
		int k = 3;
		String answer = "";
		
		answer = my_string.repeat(k);
		System.out.println(answer);
		
		//다른풀이
//        for (int i = 0; i < k; i++) {
//            answer += my_string;
//        }

	}

}
