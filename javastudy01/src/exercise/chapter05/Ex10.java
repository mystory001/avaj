package exercise.chapter05;

public class Ex10 {
	
	public static void main(String[] args) {

		//알파벳과 숫자를 암호화하는 프로그램
		char[] abcCode = {'`','~','!','@','#','$',
						  '%','^','&','*','(',')',
						  '-','_','+','|','[',']',
						  '{','}',';',':',',','.','/'};
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";

		System.out.println((int)'z'-'a'); //97~122
		
		for(int i = 0; i<src.length();i++) {
			char ch = src.charAt(i);
			if(97<=ch&&ch<=122) {
				result+=abcCode[ch-'a'];
			} else if(49<=ch&&ch<=57) {
				result+=numCode[ch-'0'];
			}
		}
		System.out.println("src : " + src);
		System.out.println("result : " + result);
		
	}

}
