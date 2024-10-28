package programmers;

public class 문자열바꿔서찾기 {
	
	public static void main(String[] args) {

		String myString = "ABAB"; 
		String pat ="ABAB";
		
		int answer = 0;
		//myString의 A를 B로, B를 A로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1 아니면 0
		
		/*
		StringBuffer, StringBuilder 문자열을 추가하거나 변경할 때 주로 사용하는 자료형
		StringBuffer => 멀티 스레드 환경(동기화), StringBuilder => StringBuffer보다 성능이 우수
		*/
		
		StringBuilder sb = new StringBuilder(myString);
		//A를 B로, B를 A로 변경 
		for(int i =0; i <myString.length();i++) {
			if(myString.charAt(i)=='A') {
				sb.setCharAt(i, 'B');
			} else {
				sb.setCharAt(i, 'A');
			}
		}
		
//		if(sb.indexOf(pat)) { 패턴이 존재하지 않으면 -1을 반환
		if(sb.indexOf(pat)!=-1) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		
		System.out.println(answer);
		
		
	}

}
