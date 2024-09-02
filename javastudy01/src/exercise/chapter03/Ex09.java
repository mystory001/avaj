package exercise.chapter03;

public class Ex09 {

	public static void main(String[] args) {
		
		//문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 
		//숫자(0~9)일 때만 변수 b의 값이 true가 되도록 하는 코드
		char ch = 'z';//122
		boolean b =('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')||('0'<=ch&&ch<='9');
//		boolean b =('a'<=ch&&ch<='Z')||('0'<=ch&&ch<='9'); 
		//위의 코드가 잘못된 이유
		//아스키코드 A~Z : 65~90, a~z: 97~122 때문에 
		System.out.println(b);
	}

}
