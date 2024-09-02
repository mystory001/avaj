package exercise.chapter04;

public class Ex10 {

	public static void main(String[] args) {
		
		//int타입의 변수 num, 각 자리의 합을 더한 결과를 출력하는 코드
		//만일 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력
		//단, 문자열로 변환하지말고 숫자로만 처리
		
		int num = 12345;
		int sum = 0;
		
//		System.out.println(num/10000);
//		System.out.println(num%10000/1000);
		//...
//		sum = num/10000 + num%10000/1000 + num%1000/100 + num %100/10 + num%10/1;
		
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		
		System.out.println("sum = " + sum);
	}

}
