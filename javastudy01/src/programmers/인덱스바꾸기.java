package programmers;

public class �ε����ٲٱ� {
	
	public static void main(String[] args) {

		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		StringBuilder answer = new StringBuilder(my_string);
		
		answer.setCharAt(num2, my_string.charAt(num1));
		answer.setCharAt(num1, my_string.charAt(num2));
		answer.toString();
		System.out.println(answer);
		
		//���� ó�� �Ϸ��� ������ �ϴٰ� ������ Ǯ��
//        char[] chars = my_string.toCharArray();
//        char temp = chars[num1];
//        chars[num1] = chars[num2];
//        chars[num2] = temp;
//        String.valueOf(chars);
		
	}

}
