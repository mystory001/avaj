package chapter03;

public class Study9 {

	public static void main(String[] args) {

		//조건 연산자(3항 연산자) ? :
		//조건식의 결과에 따라 연산 결과가 다름
		// 조건식 ? 식1 : 식 2
		// 조건식이 참이면 식1, 거짓이면 식2
		//(x > y)? x : y;
		//=> if(x > y){result x} else{result y};
		
		//대입 연산자
		//오른쪽 피연자를 왼쪽 피연산자에 저장후 저장된 값을 반환
		//모든 연산자는 결과값을 반환
		int x = 3;
		System.out.println(x);
		//x = 3
		//x lvalue(저장공간, 변수, 배열), 3 rvalue(값)
		
		//복합 대입 연산자
		//대입 연산자와 다른 연자를 하나로 축약
		//i += j => i = i + j
		//...
		//주의할 점
		//i *= x + j; => i = i * (x + j);
	}
}
