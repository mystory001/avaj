package programmers;

public class 첫번째로나오는음수 {
	
	public static void main(String[] args) {

		int[] num_list = {3, 22, 53, 24, 15, 6};
		int answer = 0;
		
		for(int i =0;i<num_list.length;i++) {
			if(num_list[i]<0) {
				answer = i;
				break;
			} else {
				answer = -1;
			}
		}
		
		System.out.println(answer);
		
		
	}

}
