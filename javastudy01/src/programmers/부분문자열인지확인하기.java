package programmers;

public class 부분문자열인지확인하기 {
	
	public static void main(String[] args) {

		String my_string = "banana";
		String target = "ana";
		int answer = 0;
		
		/*
		 * 문자열에 특정 문자 포함 여부 확인
		 * 1. contains() : 파라미터로 입력받은 문자열을 포함하고 있는지 여부를 리턴. 대소문자 구분
		 * 2. indexOf() : 파라미터로 입력받은 문자나 문자열이 원본 문자열에서 처음 나타나는 index를 찾아서 index 위치를 리턴. 원본 문자열에서 찾는 문자나 문자열이 없으면 0을 리턴
		 * 3. matches() : 정규식을 이용하여, 문자열에 정규식과 일치하는 부분이 있는지 체크하는 메소드
		 */
		
		if(my_string.contains(target)) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		
	}

}
