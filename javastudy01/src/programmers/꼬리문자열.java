package programmers;

public class �������ڿ� {

	public static void main(String[] args) {
		
		
		String[] str_list = {"abc", "bbc", "cbc"};
		String exString = "c";
		String answer = "";
		for(int i = 0; i<str_list.length;i++) {
			if(str_list[i].contains(exString)) {
			} else {
				answer += str_list[i];
			}
		}
		System.out.println(answer);

	}

}
