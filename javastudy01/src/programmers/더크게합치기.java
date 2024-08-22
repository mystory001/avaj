package programmers;

public class 더크게합치기 {
	
	public static void main(String[] args) {
		//두수의연산값비교하기 다른풀이참고함
		int a = 9;
		int b = 91;
		int answer = Math.max((Integer.parseInt(String.valueOf(a)+String.valueOf(b))), (Integer.parseInt(String.valueOf(b)+String.valueOf(a))));
		
		System.out.println(answer);
		
		
		
	}

}
