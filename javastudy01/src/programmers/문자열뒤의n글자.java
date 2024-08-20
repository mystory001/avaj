package programmers;

public class 문자열뒤의n글자 {

	public static void main(String[] args) {
		
		String my_string = "ProgrammerS123";
		int n = 11;
		String answer = my_string.substring(my_string.length()-n);
		System.out.println(answer);

	}

}
