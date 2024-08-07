package programmers;

public class 암호해독 {
	
	public static void main(String[] args) {

		//암호화된 문자열 cipher
		//code의 배수 번째 글자만 진짜 암호
		
		String cipher = "pfqallllabwaoclk";
		int code = 2;
		String answer = "";
		
		for(int i = code-1;i<cipher.length();i+=code) {
			answer += cipher.charAt(i);
		}
		System.out.println(answer);
		
		//다른 풀이 1
        for (int i = code; i <= cipher.length(); i = i + code) {
            answer += cipher.substring(i - 1, i);
        }
        
        //다른 풀이 2
        for(int i =0; i<cipher.length(); i++){
            if((i+1)%code==0) answer += cipher.charAt(i);
        }
        
        
		
		
	}

}
