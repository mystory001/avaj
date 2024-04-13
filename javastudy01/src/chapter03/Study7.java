package chapter03;

public class Study7 {
	
	public static void main(String[] args) {

		//비교연산자 >, <, >=, <=, ==, !=
		//=>, =<, =! 이렇게 사용하는 것만 조심
		
		//문자열의 비교
		//문자열 비교에는 == 대신 equals() 메소드를 사용해야함
		//==도 결과가 나오긴 하나 올바른 결과가 나오지 않을 때가 있음
		
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2); //true
		System.out.println(str1.equals(str2)); //true
		
		String string1 = new String("abc");
		String string2 = new String("abc");
		System.out.println(string1==string2); //false
		System.out.println(string1.equals(string2)); //true
		
	}
}
