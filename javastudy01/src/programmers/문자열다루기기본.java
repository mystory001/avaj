package programmers;

public class 문자열다루기기본 {
	
	public static void main(String[] args) {

		String s = "a234";
		boolean answer = true;

//		int length = 0;
//		for(int i = 0; i < s.length(); i++) {
//			if('0'<=s.charAt(i) && s.charAt(i)<='9') {
//				length++;
//			} else {
//				length = 0;
//			}
//		}
//		answer = length == s.length();
//		

		// 내가 작성한 코드는 수정할 수록 정확성이 높아지지만 몇몇 테스트에서 실패함 => 문제 설명에서 s의 길이가 4 혹은 6
		
//		if(s.length()==4 || s.length()==6) {
//			for(int i = 0; i < s.length(); i++) {
//				if('0'<=s.charAt(i) && s.charAt(i)<='9') {
//					answer = true;
//				} else {
//					answer = false;
//				}
//			}
//		} else {
//			answer = false;
//		}
		// 이 또한 실패
//		System.out.println((int)'0');
//		System.out.println((int)'9');
//		
		// 내가 작성한 코드가 뭐가 문제인지 몰라서 검색해봤는데, 다른 방법이 있었음
		int x;
		try {
			x = Integer.parseInt(s);
			System.out.println(x);
			System.out.println("String s의 문자열은 숫자로만 구성되어있습니다.");
			answer = true;
		} catch (Exception e) {
			answer = false;
		}
		// 이 또한 제대로 안됨. 찾다보니 정규 표현식으로도 가능함
//		if(s.matches("?\\d+")) {
//			x = Integer.parseInt(s);
//			answer = true;
//		} else {
//			answer = false;
//		}
		
		System.out.println(answer);
		
		// 가장 처음한것의 수정된 코드
		int length = s.length();
		if ((length == 4) || (length == 6)) {
			for (int i = 0; i < length; i++) {
				if (!(Character.isDigit(s.charAt(i)))) {
					answer = false;
				}
			}
		} else {
			answer = false;
		}
		
		// 문제에 설명과 제한 사항이 이상함. 오해의 소지가 있음.
		
	}

}
