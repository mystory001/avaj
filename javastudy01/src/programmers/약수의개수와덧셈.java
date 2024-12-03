package programmers;

public class 약수의개수와덧셈 {
	
	public static void main(String[] args) {

		int left = 24;
		int right = 27;
		
		int answer = 0;
		
		//약수의 개수 구하기?
		int count = 0;
//		for(int i = 1; i <= left; i++) {
//			if(left%i==0) {
//				count++;
//			}
//		}
		
		//left~right까지
		for(int i = left; i <=right; i++) {
			for(int j = 1; j <= i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count%2==0) {
				answer+=i;
			} else {
				answer-=i;
			}
			count=0;
		}
		System.out.println(answer);
		
		//다른 풀이
		for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }
		
		
	}

}
