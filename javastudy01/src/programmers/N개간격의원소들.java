package programmers;

public class N개간격의원소들 {
	
	public static void main(String[] args) {

		int[] num_list = {4, 2, 6, 1, 7, 6};
		int n = 2;
		int[] answer = {};
		
        if (num_list.length % n == 0) {
            answer = new int[num_list.length / n];
        } else {
            answer = new int[num_list.length / n + 1];
        }
		
        int idx = 0;
        
		for(int i = 0; i<num_list.length;i+=n) {
			answer[idx++]= num_list[i];
		}
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		
		
		//다른풀이
//        int[] answer = new int[num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = num_list[i * n];
//        }
	}

}
