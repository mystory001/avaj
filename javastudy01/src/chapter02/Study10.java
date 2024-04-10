package chapter02;

import java.util.Scanner;

public class Study10 {

	public static void main(String[] args) {
		
		//Scanner
		//화면으로부터 데이터를 입력받는 기능을 제공하는 클래스
		Scanner scanner = new Scanner(System.in);
		//System.in => 화면입력
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); //문자열을 숫자로 변환
		//숫자 -> 문자열 : 숫자 + ""
		//문자열 -> 숫자 : Integer.parseInt();
		
		
	}

}
