package programmers;

public class �빮�ڼҹ��ں�ȯ {
	
	public static void main(String[] args) {

		//�빮�� A 65, Z 90
		//�ҹ��� a 97, z 122
		
		String my_string = "aabXYZ";
		String answer = "";
		
		for(char ch : my_string.toCharArray()) {
			if(ch>=97 && ch<=122) {
				answer+=(char)(ch-32);
			} else if(ch>=65 && ch<=90) {
				answer+=(char)(ch+32);
			}
		}
		System.out.println(answer);
		
		//�ٸ� Ǯ��
		for(char a : my_string.toCharArray()) {
			if(Character.isLowerCase(a)) {
				answer+=Character.toUpperCase(a);
			} else {
				answer+=Character.toLowerCase(a);
			}
		}
		
	}

}
