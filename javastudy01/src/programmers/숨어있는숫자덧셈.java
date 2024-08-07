package programmers;

public class ¼û¾îÀÖ´Â¼ıÀÚµ¡¼À {

	public static void main(String[] args) {
		
		String my_string = "1a2a3a4a5a";
		int answer = 0;
		
		for(int i = 0; i<my_string.length();i++) {
			if(my_string.charAt(i)>=48 && my_string.charAt(i)<=57 && my_string.charAt(i)!=0) {
				answer+= my_string.charAt(i)-48;
			}
		}

		System.out.println(answer);
		
		//´Ù¸¥ Ç®ÀÌ
		String str = my_string.replaceAll("[^0-9]", "");
		for(char ch : str.toCharArray()) {
			answer += Character.getNumericValue(ch);
		}
		System.out.println(answer);

	}

}
