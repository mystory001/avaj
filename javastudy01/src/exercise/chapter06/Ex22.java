package exercise.chapter06;

public class Ex22 {

	public static boolean isNumber(String str) { //주어진 문자열이 모두 숫자로만 이루어져있는지 확인
		if(str==null||str.equals("")) { //유효성 검사
			return false;
		}
		
		for(int i = 0; i<str.length();i++) {
			if(!('0'<=str.charAt(i)&&str.charAt(i)<='9'))
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		String str = "123";
		System.out.println(str+"는 숫자일까?" + isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자일까?" + isNumber(str));

	}

}
