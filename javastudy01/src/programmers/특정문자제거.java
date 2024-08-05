package programmers;

public class 특정문자제거 {

	public static void main(String[] args) {
		
		String a ="dfeLrLJffd";
		String del = "L";
		
		String answer = a.replaceAll(del, "");
		System.out.println(answer);
		
		//다른 풀이
		for(char c : del.toCharArray()) {
			a = a.replace(String.valueOf(c), "");
		}
		
	}

}
