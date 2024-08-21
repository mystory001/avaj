package programmers;

public class 홀짝에따라다른값반환하기 {
	
	public static void main(String[] args) {

		int n = 7;
		int answer = 0;
		if(n%2==0){
			for(int i = 2; i<=n; i+=2){
				answer += Math.pow(i,2);
			}
		} else{
			for(int i =1; i<=n;i+=2){
				answer += i;
			}
		}

		//다른 풀이
//	  for(int i = n; i >= 0; i -= 2)
//	                answer += (n % 2 == 0) ? i * i : i;

		
		
	}

}
