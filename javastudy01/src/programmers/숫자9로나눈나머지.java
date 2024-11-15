package programmers;

import java.math.BigInteger;

public class 숫자9로나눈나머지 {

	public static void main(String[] args) {
		
		String number = "78720646226947352489";
		int answer = 0;
		
		//처음에는 int로 해보려고 했으나 number의 숫자형이 커질 경우 int 그리고 long의 범위를 벗어남
		//따라서 long보다 더 큰 수를 다뤄야하는 경우에는 BigInterger 클래스를 사용한다고 한다.
//		BigInteger bi = new BigInteger(number);
//		BigInteger bi1 = new BigInteger("9");
//		System.out.println(bi.remainder(bi1));
//		
//		answer = bi.remainder(bi1).intValue();
		
		//다른 풀이
		for(int i = 0; i < number.length(); i++) {
			answer += number.charAt(i)-'0';
		}
		answer %= 9;
		System.out.println(answer);

	}

}
