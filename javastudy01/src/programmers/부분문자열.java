package programmers;

public class �κй��ڿ� {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "aabcc";
		
		int answer = 0;
		
		if(str2.contains(str1)) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		System.out.println(answer);
		
		//���� ������ Ǯ��
		answer = str2.contains(str1)? 1:0;

	}

}
