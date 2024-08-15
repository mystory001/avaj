package programmers;

public class 원하는문자열찾기 {
	
	public static void main(String[] args) {

		String myString = "AbCdEfG";
		String pat = "AbC";
		int answer = 0;
		
		if(myString.toLowerCase().contains(pat.toLowerCase())) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		//다른 풀이
		//myString.toLowerCase().contains(pat.toLowerCase())?1:0;
		
	}

}
