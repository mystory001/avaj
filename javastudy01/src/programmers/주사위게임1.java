package programmers;

public class 주사위게임1 {

	public static void main(String[] args) {
		//두 주사위를 굴려 나온 숫자를 각각 a, b
		//a와 b가 모두 홀수라면 a^2 + b^2의 값
		//a와 b 중 둘 중 하나만 홀수라면 2(a+b)
		//a와 b가 모두 짝수라면 |a-b|
		
		int a = 3, b=2;
		int answer;
		if(a%2!=0 && b%2!=0) {
			answer = (int)Math.pow(a,2) + (int)Math.pow(b, 2);
		} else if((a%2==0 && b%2!=0) || (a%2!=0 && b%2==0)) {
			answer = 2*(a+b);
		} else {
			answer = Math.abs(a-b);
		}
		
		System.out.println("=====================");
		//풀이 1
		boolean x = a % 2 !=0;
		boolean y = b % 2 !=0;
		if(x&&y) {
			answer = a*a + b*b;
		} else if(x||y) {
			answer = 2 * (a+b);
		} else {
			answer = Math.abs(a-b);
		}
		
		//풀이 2
		answer = a % 2 != 0 && b % 2 != 0 ? (int) (Math.pow(a, 2) + Math.pow(b, 2)) : a % 2 != 0 || b % 2 != 0 ? 2 * (a + b) : Math.abs(a - b);

	}

}
