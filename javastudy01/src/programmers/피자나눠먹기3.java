package programmers;

public class 피자나눠먹기3 {

	public static void main(String[] args) {

		int slice = 7; // 피자 조각수
		int n = 10; // 사람 수
		int answer = (n%slice)==0?(n/slice):(n/slice)+1;
		//다른 풀이 : (n+slice-1)/slice
		
		System.out.println(answer);
		
		
	}

}
