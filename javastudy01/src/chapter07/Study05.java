package chapter07;

public class Study05 {
	
	public static void main(String[] args) {

		//super(this와 비슷)
		//객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자)내에만 존재(static 메서드 내에 사용불가)
		//조상의 멤버를 자신의 멤버와 구분할 때 사용
		
		//super() 조상의 생성자
		//조상의 생성자를 호출할 때 사용
		//조상의 멤버는 조상의 생성자를 호출해서 초기화
		//생성자의 첫 줄에 반드시 생성자(super(), this())를 호출해야함. 그렇지 않으면 컴퍼일러가 생성자의 첫 줄에 super(); 삽입(Study05Ex4)
		
	}

}
