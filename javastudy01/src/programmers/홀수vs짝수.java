package programmers;

public class 홀수vs짝수 {
	
	public static void main(String[] args) {

		int[] num_list = {4, 2, 6, 1, 7, 6};
		int answer = 0;
		
		int odd = 0; //홀수 원소의 합
		int even = 0; //짝수 원소의 합
		
		for(int i = 0; i < num_list.length ; i++) {
			//원소가 홀수일 때
			if(i==0 || i%2==0) {
				odd += num_list[i];
			} else {
				even += num_list[i];
			}
		}
		
		answer = (odd>even)? odd:even;
		
		
		//다른 사람 풀이
//		answer = Math.max(odd, even);
	}

}
