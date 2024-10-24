package programmers;

public class 배열에서문자열대소문자변환하기 {
	
	public static void main(String[] args) {

		String[] strArr = {"aBc","AbC"};
		String[] answer = new String[strArr.length];
		
		//a = 97, A = 65
		//32차이
		
		
//			for (int j = 0; j < strArr[i].charAt(j); j++) {
//				if('a'<strArr[i].charAt(j) && strArr[i].charAt(j)<'z') {
//					answer[i] +=  strArr[i].charAt(j)-32;
//				} else {
//					answer[i] +=  strArr[i].charAt(j)+32;
//				}
//			}
		
		
		for (int i = 0; i < strArr.length; i++) {
			answer[i] = ""; //각 문자열에 대해 초기화
			if(i%2!=0) { //홀수번째 인덱스 → 대문자 - 32
				for(int j = 0; j < strArr[i].length(); j++) {
					char ch = strArr[i].charAt(j);
					if('a'<=ch && ch<='z') {
						answer[i] += (char)(ch-32);
					} else {
						answer[i] += ch;
					}
				}
			} else {
				for(int j = 0; j < strArr[i].length(); j++) {
					char ch = strArr[i].charAt(j);
					if('A'<=ch && ch<='Z') {
						answer[i] += (char)(ch+32);
					} else {
						answer[i] += ch;
					}
				}
			}
		}
		
		for(String a : answer) {
			System.out.println(a);
		}
	
		//다른사람 풀이 => Lower() 아님 -> toLowerCase(), toUpperCase()
//        for(int i = 0; i < strArr.length; i++) {
//            strArr[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
//        }
		
		
	}

}
