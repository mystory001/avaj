package chapter03;

public class Study5 {
	
	public static void main(String[] args) {

		//같은 형끼리만 계산이 가능함
		//산술 변환 : 연산 전 피연산자의 타입을 일치 시키는 것
		//두 가지 규칙은 반드시 암기할 것
		//규칙 1. 두 피연산자의 타입을 같게 일치시킴(보다 큰 타입으로 일치, 값 손실을 최소화하기 위해서)
		//long + int => long + long ==> long
		//float + int => float + float ==> float
		//double + float => double + double ==> double
		//규칙 2. 피연산자의 타입이 int보다 작은 타입이면 int로 변환
		//byte + short => int + int => int
		//char + short => int + int => int
		char a = '2', b = '0';
		System.out.println(a-b); //문자에서 숫자로 형변환할 때 -'0'을 하는 이유
		
		System.out.println();
		
		int x = 1000000;
		int y = 2000000;
		
		long z = x * y; //오버플로우가 발생함
		long z1 = (long)x * y; //오버플로우가 발생하지 않으려면 x나 y를 형 변환해줘야함
		System.out.println(z);
		System.out.println(z1);
		
	}

}
