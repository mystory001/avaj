package programmers;

public class N번째원소까지 {
	
	public static void main(String[] args) {

		int[] num_list = {5, 2, 1, 7, 5};
		int n = 3;
		int[] answer = new int[n];
		
		for(int i = 0; i<answer.length;i++) {
			answer[i] = num_list[i];
		}
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		System.out.println(answer[2]);
		
		//다른 풀이
//		Arrays.stream(num_list,0,n).toArray();
	}

}
