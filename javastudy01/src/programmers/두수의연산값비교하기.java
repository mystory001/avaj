package programmers;

public class 두수의연산값비교하기 {
	
	public static void main(String[] args) {

		int a = 2;
		int b = 91;
		int answer = 0;
		
		String plus = a+""+b+"";
		int plusInt = Integer.parseInt(plus);
		if(plusInt>(2*a*b)){
			answer = plusInt;
		} else {
			answer = 2*a*b;
		}
		
		System.out.println("answer : " + answer);
		
		//다른 풀이
		int otherAnswer = 0;
		otherAnswer = Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)), 2*a*b);
		System.out.println("otherAnswer : " + otherAnswer);
	}

}
