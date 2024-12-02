package programmers;

public class 내적 {
	
	public static void main(String[] args) {

		//a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
		
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		int answer = 0;
		
		//answer = 0이 아니라 1234567890? => 여러개의 수가 곱셈이 나오면 리턴값이 long일수도 있음을 주의해야겠지?
		for(int i =0; i < a.length; i++) {
			answer += a[i]*b[i];
		}
		System.out.println(answer);
		
	}

}
