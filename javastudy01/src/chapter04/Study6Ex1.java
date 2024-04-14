package chapter04;

public class Study6Ex1 {

	public static void main(String[] args) {

		int num = 12345, sum = 0;
		
		//10으로 나머지 연산을 하면 마지막 자리를 얻음
	
		for(num = 12345; num > 0; num /= 10) {
			System.out.println(num%10);
			sum += num%10;
		}
		
		//==
//		while (num > 0) {
//			sum += num %10;
//			System.out.println(sum +", " + num%10);
//			num = num / 10;
//		}
		
		System.out.println("각 자리수의 합 " + sum);
		
	}
}
