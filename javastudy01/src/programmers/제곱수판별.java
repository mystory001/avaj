package programmers;

public class 제곱수판별 {

	public static void main(String[] args) {
		
		//정수 n이 제곱수라면 1, 아니라면 2
		int n = 9;
		
		int answer = 0;

		//Math.sqrt() : 루트
		//Math.pow() : 거듭제곱
		if(Math.sqrt(n)%1==0) {
			answer = 1;
		} else {
			answer = 2;
		}
		
		System.out.println(answer);
		
		//다른 풀이
		if(n%Math.sqrt(n)==0) {
			answer = 1;
		} else {
			answer = 2;
		}
		

	}

}
