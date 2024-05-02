package chapter09;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Study03 {
	
	public static void main(String[] args) {

		//String 클래스 문자열을 다루기 위한 클래스
		//String 클래스 = 데이터(char[]) + 메서드(문자열 관련)
		//내용을 변경할 수 없는 불변(immutable) 클래스
		String a = "a";
		String b = "b";
		a = a + b;
		//덧셈 연산자를 이용한 문자열 결합은 성능이 떨어짐, 문자열의 결합이나 변경이 많다면, 내용을 변경가능한 StringBuffer를 사용
		
		//문자열 비교(String str = "abc";와 String str = new String("abc");의 비교)
		String str1 = "abc"; //문자열 리터럴 "abc"의 주소가 str1에 저장
		String str2 = "abc"; //문자열 리터럴 "abc"의 주소가 str2에 저장
		//new를 이용하면 항상 새로운 문자열이 만들어짐
		String str3 = new String("abc"); //새로운 String 인스턴스를 생성
		String str4 = new String("abc"); //새로운 String 인스턴스를 생성
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		
		//문자열 리터럴
		//프로그램 실행 시 자동으로 생성(constant pool에 저장)
		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = "AAA";
		String s4 = "BBB";
		//같은 내용의 문자열 리터럴은 하나만 만들어지고 값을 공유
		
		//빈 문자열("", empty string)
		//내용이 없는 문자열. 크기가 0인 char형 배열을 저장하는 문자열
		String str = ""; //str을 빈 문자열로 초기화
		//크기가 0인 배열을 생성하는 것은 어느 타입이나 가능
		char[] chArr = new char[0]; //길이가 0인 char 배열
		int[] iArr = {}; //길이가 0인 int 배열
		//문자(char)와 문자열(String)의 초기화
		String s = null;
		s = ""; //빈문자로 초기화
		char c = '\u0000';
		c = ' '; //공백으로 초기화 
		
	}

}
