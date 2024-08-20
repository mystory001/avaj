package programmers;

public class 순서바꾸기 {
	
	public static void main(String[] args) {

		int[] num_list = {5, 2, 1, 7, 5};
		int n = 3;
		int[] answer = new int[num_list.length];
		
		for(int i =0; i<num_list.length;i++) {
			answer[i] =  num_list[(i+n)%num_list.length];
		}
		
		for(int a : answer) {
			System.out.println(a);
		}
		
	}

}
