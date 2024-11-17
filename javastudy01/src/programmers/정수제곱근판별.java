package programmers;

public class 정수제곱근판별 {
	
	public static void main(String[] args) {

		long n = 3;
		long answer = 0;
		
		if((Math.sqrt(n)*Math.sqrt(n))==n) {
			answer = ((long)((Math.sqrt(n)+1)*(Math.sqrt(n)+1)));;
		} else {
			answer = Long.valueOf(-1);
		}
		
		System.out.println(answer);
		//라고 작성했을 때 테스트 3, 테스트 6, 테스트 13에서 실패
		
		long otherAnswer = 0;
		
		if(Math.pow((int)Math.sqrt(n), 2)==n) {
			otherAnswer = (long)Math.pow(Math.sqrt(n)+1, 2);
		} else {
			otherAnswer = -1;
		}
		
		System.out.println(otherAnswer);
		
	}

}
