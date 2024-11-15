package programmers;

public class 인덱스바꾸기 {
	
	public static void main(String[] args) {

		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		StringBuilder answer = new StringBuilder(my_string);
		
		answer.setCharAt(num2, my_string.charAt(num1));
		answer.setCharAt(num1, my_string.charAt(num2));
		answer.toString();
		System.out.println(answer);
		
		//내가 처음 하려고 했지만 하다가 포기한 풀이
//        char[] chars = my_string.toCharArray();
//        char temp = chars[num1];
//        chars[num1] = chars[num2];
//        chars[num2] = temp;
//        String.valueOf(chars);
		
	}

}
