package programmers;

public class x만큼간격이있는n개의숫자 {
	
	public static void main(String[] args) {

		int x = 4;
		int n = 3;
		long[] answer = new long[n];
		
		for(int i = 0; i<answer.length;i++) {
			answer[i] = (long)x*(i+1); //명시적 형변환 필수
		}
		
		for(long a: answer) {
			System.out.println(a);
		}
		
	}

}
