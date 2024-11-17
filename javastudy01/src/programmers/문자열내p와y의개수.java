package programmers;

public class 문자열내p와y의개수 {
	
	public static void main(String[] args) {

		String s = "pPoooyY";
		boolean answer = true;
		String s1 = s.toLowerCase();
		int p_count = 0;
		int y_count = 0;
		
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)=='p') {
				p_count++;
			} else if(s1.charAt(i)=='y') {
				y_count++;
			}
		}
		
		answer = (p_count==y_count)? true : false;
		
		System.out.println(answer);
		
	}

}
