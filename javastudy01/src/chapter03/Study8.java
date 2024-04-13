package chapter03;

public class Study8 {
	
	public static void main(String[] args) {

		//논리연산자 &&(and) ||(or)
		//조건식을 연결할 때 사용하는 연산자
		//ex1) x는 10보다 크고 20보다 작다
		// x > 10 && x <20 == 10 < x && x <20
		//단, 10 < x < 20 이런식의 표현은 허용하지 않음
		
		//ex2) i는 2의 배수 또는 3의 배수
		//i%2==0 || i%3 ==0
		
		//ex3) i는 2의배수 또는 3의 배수이지만 6의배수는 아니다.
		//(i%2==0 || i%3==0) && i%6 !=0
		//※&&가 ||보다 우선순위가 높다
		
		//ex4) 문자 ch는  숫자('0'~'9')이다
		//'0' <= ch && ch <= '9'
		
		//ex5) 문자 ch는 대문자 또는 소문자
		//('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')
		
		//논리 부정 연산자 !
		boolean b = true;
		System.out.println(!!b);
		System.out.println(!b);
		
		//ex1) 문자 ch가 소문자가 아니다
		// ch < 'a' || ch > 'z'
		// == !('a' <= ch && ch <= 'z')
		
	}

}
