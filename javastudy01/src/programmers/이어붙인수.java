package programmers;

public class 이어붙인수 {
	
	public static void main(String[] args) {

		int[] num_list = {3, 4, 5, 2, 1};
		int answer = 0;
		String odd = "";
		String even = "";
		for(int i =0; i<num_list.length;i++) {
			if(num_list[i]%2!=0) {
				odd += num_list[i]+""; 
			} else {
				even += num_list[i]+"";
			}
		}
		answer = Integer.parseInt(even)+Integer.parseInt(odd);
		
		//다른 풀이
		int otherAnswer = 0;
		StringBuilder a = new StringBuilder();
		StringBuilder b = new StringBuilder();
		for(int num : num_list) {
			(num%2==0?a:b).append(num);
		}
		otherAnswer = Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
		System.out.println(otherAnswer);
		
	}

}
