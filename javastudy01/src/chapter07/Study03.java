package chapter07;

public class Study03 {
	
	public static void main(String[] args) {

		//단일 상속(Sinigle Inheritance)
		//하나의 부모만 상속 가능(인터페이스를 통해 다중 상속 문제를 해결)
		//비중이 높은 클래스 하나만 상속관계로, 나머지는 포함 관계(Study03Ex1)
		
		
		//Object 클래스 모든 클래스의 조상
		//부모가 없는 클래스는 자동적으로 Object 클래스를 상속받게 됨
		//모든 클래스는 Object 클래스에 정의된 11개의 메서드를 상속(toString(), equals(Object obj), hashCode(),...)
		//println() -> 참조변수 -> toString()호출
		//System.out.println(참조변수.toString()); == System.out.println(참조변수);
		
		
	}

}
