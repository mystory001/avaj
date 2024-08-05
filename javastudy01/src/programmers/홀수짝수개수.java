package programmers;

public class 홀수짝수개수 {
	
	public static void main(String[] args) {

		int[] num_list = {1,2,3,4,5,7,8,9};
		int[] answer = new int[2];
		int odd = 0;
		int even = 0;
		for(int i = 0 ; i < num_list.length ; i++) {
			if(num_list[i]%2==0) {
				even += 1;
			} else {
				odd += 1;
			}
			
		}
		
		answer[0] = even;
		answer[1] = odd;
		
		for(int a : answer) {
			System.out.println(a);
		}
		
		//다른 풀이
	       for(int i = 0 ; i < num_list.length ; i++){
	            if(num_list[i]%2==0){
	                answer[0]++;
	            }else{
	                answer[1]++;
	            }
	        }
		
	}

}
