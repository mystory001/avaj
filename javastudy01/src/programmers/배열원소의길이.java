package programmers;

public class 배열원소의길이 {

	public static void main(String[] args) {
		String[] list = {"I","can","java"};
		int[] answer = 
				new int[list.length];
		for(int i = 0; i < list.length;i++) {
			answer[i] = list[i].length(); 
		}
		
		System.out.println(list[1].length());

	}

}
