package chapter06;

public class Study18 {

	public static void main(String[] args) {

		//this()는 생성자 this는 변수

		//생성자 this()
		//생성자에서 다른 생성자를 호출할 때 사용
		//다른 생성자 호출 시 첫 줄에서만 사용 가능
		
		//참조변수 this
		//인스턴스 자신을 가리키는 참조변수
		//인스턴스 메서드(생성자 포함)에서 사용가능
		//지역변수(lv)와 인스턴스 변수(iv)를 구별할 때 사용
		//Car(String color, String type, int door){
		// color = color; type = type; door = door;} 는 둘 다 lv임
		//iv를 사용할 때 참조변수.변수명
		
		//참조 변수 this와 생성자 this()
		//this 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있음
		//	   모든 인스턴스 메서드에서 지역변수로 숨겨진 채 존재(선언X 사용 가능)
		//this(), this(매개변수) 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용. 클래스 이름 대신 this() 사용
		
		
		
	}

}
