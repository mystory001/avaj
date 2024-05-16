package chapter12;

public class Study03 {
	
	public static void main(String[] args) {

		//제네릭 용어
		//Box<T> : 제네릭 클래스. 'T의 Box' 또는 'T Box' 라고 읽음
		//T : 타입 변수 또는 타입 매개변수.(T는 타입 문자)
		//Box : 원시 타입(raw type). 일반 클래스 -> 제네릭 클래스
		//class Box<T>{} : 제네릭 클래스 선언
		//Box<String> b = new Box<String>(); : 제네릭 타입 호출. String 대입된 타입(매개변수화된 타입, parameterized type). 생성할 때마다 바뀔 수 있음
		
		//제네릭 타입과 다형성
		//참조 변수와 생성자의 대입된 타입은 일치
		//Array<Tv> list = new ArrayList<Tv>();
		//ArrayList<Product> list = new ArrayList<Tv>(); //에러
		//제네릭 클래스 간의 다형성은 성립(대입된 타입은 일치해야함)
		//List <Tv> list = new ArrayList<Tv>(); //ArrayList가 List를 구현(다형성)
		//List<Tv> list = new LinkedList<Tv>(); //LinkedList가 List를 구현(다형성)
		//매개변수의 다형성도 성립
		//ArrayList<Product> list = new ArrayList<Product>();
		//list.add(new Product());
		//list.add(new Tv());
		//list.add(new Audio());
		
		
	}

}
