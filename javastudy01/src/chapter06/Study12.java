package chapter06;

public class Study12 {

	public static void main(String[] args) {
		
		//호출 스택(call stack)
		//스택(stack) : 밑이 막힌 상자. 위에 차곡차곡 쌓임. 후입선출
		//메서드 수행에 필요한 메모리가 제공되는 공간
		//메서드가 호출되면 호출스택에 메모리 할당, 종료되면 해제
		//아래 있는 메서드가 위의 메서드를 호출
		//맨 위의 메서드 하나만 실행 중이고 나머지는 대기 중
		
		System.out.println("Hello");
		//비어있는 스택 -> main -> main(대기) println 호출(실행) -> main-> 비어있는 스택

	}

}
