package chapter11;

public class Study05 {
	
	public static void main(String[] args) {

		//Stack(밑이 막힌 상자) => 배열
		//LIFO(Last in First Out)구조. 마지막에 저장된 것을 제일 먼저 꺼내게 됨
		//저장(push), 추출(pop)
		
		//Queue(양끝이 뚫린 상자) => 링크드리스트
		//FIFO(First in First Out) 구조. 제일 먼저 저장한 것을 제일 먼저 꺼내게 됨
		//저장(offer), 추출(poll)
		
		//Stack의 메서드
		//Stack stack = new Stack() //Stack 클래스
		//boolean empty() : Stack이 비어있는지 알려줌
		//Object peek() : Statck 맨 위에 저장된 객체를 반환. pop()과 달리 Stack에서 객체를 꺼내지 않음.(비어있을 때는 EmptyStackException 발생)
		//Object pop() : Statck의 맨 위의 저장된 객체를 꺼냄(비어있을 때는 EmptyStackException 발생)
		//Object push(Object item) : Statck에 객체(item)를 저장
		//int search(Object o) : Stack에서 주어진 객체(o)를 찾아서 그 위치를 반환. 못 찾으면 -1을 반환. (배열과 달리 위치는 0이 아닌 1부터 시작)

		//Queue의 메서드
		//boolean add(Object o) : 지정된 객체를 Queue에 추가. 성공하면 true 반환, 저장공간이 부족하면 IllegalStateException 발생
		//Object remove() : Queue에서 객체를 꺼내 반환. 비어있으면 NoSuchElementException 발생
		//Object element() : 삭제없이 요소를 읽음. peek와 달리 Queue가 비어있을 때 NoSuchElementException 발생
		//boolean offer(Object o) : Queue에 객체를 저장. 성공하면 true 반환, 실패하면 false 반환
		//Object poll() : Queue에서 객체를 꺼내서 반환. 비어있으면 null 반환
		//Object peek() : 삭제없이 요소를 읽어 옴. 비어있으면 null 반환
		//인터페이스로 구현됨 => Queue를 직접구현, Queue를 구현한 클래스를 사용
		//Queue queue = new LinkedList();
		//==LinkedList queue = new LinkedList();
		//queue.offer("0");
		
		//스택과 큐의 활용
		
		
		
		
	}

}
