package programmers;

public class 배열에서홀수만 {
	
	public static void main(String[] args) {

		int n = 10;
		if(n%2==0) {
			n = n/2;
		} else {
			n = (n/2) + 1;
		}
		
		int[] answer = new int[n];
		//다른 풀이 : int[] answer = new int[n%2!=0?(n/2)+1:n/2];
		
		
		for(int i = 0 ; i<answer.length;i++) {
			answer[i] = (2*i)+1;
		}
		
		
		//0 1 2 3 4
		//1 3 5 7 9
		//2*0+1 2*1+1 4+1 6+1 7+1
	}

}
