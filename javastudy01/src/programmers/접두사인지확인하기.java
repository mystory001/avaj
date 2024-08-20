package programmers;

public class 접두사인지확인하기 {
	
	public static void main(String[] args) {

		String my_string = "banana";
		String is_prefix = "nan";
		int answer = 0;
		
		boolean a = my_string.startsWith(is_prefix);
		
		if(a) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		System.out.println(answer);
		
		//다른 풀이
//        int a = my_string.indexOf(is_prefix);
//
//        a==0? 1 : 0;
		
	}

}
