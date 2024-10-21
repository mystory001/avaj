package programmers;

public class 세균증식 {
	
	public static void main(String[] args) {

		int n = 7; //처음 세균의 마리 수
		int t = 15; //시간
		
		//1시간 후 => n = 7*2
		//2시간 후 => n = n*2
		//3시간 후 => n = n*2
		// ...
		// n 시간 후 = n = n*2^t
		
		int answer = n*(int)Math.pow(2, t);
		System.out.println(answer);
		
	}

}
