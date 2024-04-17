package chapter05;

public class Study8 {

	public static void main(String[] args) {

		//String 클래스
		//1. String 클래스는 char[]와 메서드를 결합한 것
		//2. String 클래스는 내용을 변경할 수 없음(읽기만 가능)
		//ex) String a = "a", b = "b"; 
		//    a = a + b => ab라는 변수값이 생김
		
		//String 클래스의 주요 메서드
		//char charAt(int index) 문자열에서 해당 위치에 있는 문자를 반환
		String string1 = "ABCDE";
		char ch1 = string1.charAt(3); //문자열 string의 4번째 문자 D를 ch에 저장
		//int length() 문자열의 길이를 반환
		string1.length(); //5
		//String substring(int from, int to) 문자열에서 해당 범위(from ~ to)의 문자열을 반환(to는 포함 안됨)
		//String substring(int from) to 생략시 from부터 끝까지 반환 (== String substring(int from, .length())
		String string2 = "012345";
		String temp1 = string2.substring(1,4);//string2에서 index번위 1~4의 문자를 반환
		System.out.println(temp1);
		//boolean equals(Obeject obj) 문자열의 내용이 같은지 확인
		//char[] toCharArray() 문자열을 문자배열로 변환해서 반환
		
		
	}
	
}
