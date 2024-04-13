package chapter03;

public class Study3 {
	
	public static void main(String[] args) {

		//증감 연산자
		//증가연산자(++) 피연산자의 값을 1 증가
		//감소연산자(--) 피연산자의 값을 1 감소
		
		//전위형 값이 참조되기 전에 증가 j = ++i;
		//j = ++i; => ++i; j=i; //증가 후에 참조하여 대입
		//후위형 값이 참조된 후에 증가 j = i++; 
		//j = i++; => j=i; i++; //참조하여 대입 후 증가
		
		//단, 증감 연산자가 독립적으로 사용된 경우, 전위형과 후위형의 차이가 없음
		
		int i = 3, j = 0;
		
		j = i++;
		System.out.println("후위형 증가연산자, i = " + i + " j = " + j);
		
		i = 3; j = 0;
		j = ++i;
		System.out.println("전위형 증가연산자, i = " + i + " j = " + j);
		
		//부호 연산자
		int num = -10;
		num = +num;
		System.out.println(num);
		
		num = -10;
		num = -num;
		System.out.println(num);
		
		
	}
}
