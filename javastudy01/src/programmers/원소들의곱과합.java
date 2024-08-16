package programmers;

public class 원소들의곱과합 {
	
	public static void main(String[] args) {

		int[] num_list = {3, 4, 5, 2, 1};
		int answer = 0;
		
		int pow = 0;
		int multi = 1;
		
		for(int i = 0; i < num_list.length;i++) {
			pow += num_list[i];
			multi *= num_list[i];
		}
		
		System.out.println((int)Math.pow(pow, 2)); // pow*pow
		System.out.println(multi);
		if((int)Math.pow(pow, 2)>multi) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		//다른 풀이
		answer = (pow*pow>multi)? 1 : 0;
		
	}

}
