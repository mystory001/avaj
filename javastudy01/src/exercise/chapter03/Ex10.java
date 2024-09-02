package exercise.chapter03;

public class Ex10 {

	public static void main(String[] args) {
		
		//대문자를 소문자로 변경하는 코드
		char ch = 'C';
		char lowerCase = (65<=ch&&ch<=90)?(char)((int)ch+32):ch;
		//다른 풀이
//		char lowerCase = ('A'<=ch&&ch<='Z')?(char)((int)ch+32):ch;
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);

	}

}
