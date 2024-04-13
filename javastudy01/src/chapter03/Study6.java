package chapter03;

public class Study6 {
	
	public static void main(String[] args) {

		//반올림 Math.rount()
		//실수를 소수 첫째자리에서 반올림한 정수를 반환
		long result1 = Math.round(3.14);
		System.out.println(result1);
		long result2 = Math.round(3.54);
		System.out.println(result2); //반올림 된 결과
		
		System.out.println();
		
		double pi = 3.141592;
		//double shortPi = Math.round(pi*1000)/1000.0;
		//System.out.println(shortPi);
		//계산과정
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000); //int/int => int
		System.out.println(Math.round(pi*1000)/1000.0); //int/double => double
		System.out.println((double)Math.round(pi*1000)/1000); 
		//10^n을 곱한 후 10^n.0으로 나누면 원하는 자리에서 반올림가능
		
		//결과를 3.141로 나타내려면?
		System.out.println(pi*1000);
		System.out.println((int)(pi*1000)); //값 손실을 내서
		System.out.println((int)(pi*1000)/1000.0);
		
		System.out.println();
		
		//나머지 연산자 %
		//나누는 피연산자는 0이 아닌 정수만 허용되며, 부호는 무시됨
		System.out.println(3%2);
		System.out.println(3%-2);
		System.out.println(-3%2);
		System.out.println(-3%-2);
		
	}
}
