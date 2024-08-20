package programmers;

public class 접미사인지확인하기 {

	public static void main(String[] args) {
		
		String my_string = "banana";
		String is_suffix = "ana";
		int answer = 0;
		
		boolean a = my_string.endsWith(is_suffix);
		
		answer = a? 1: 0;
		System.out.println(answer);

	}

}
