package chapter12;

public class Study05 {

	public static void main(String[] args) {
		/*
		
		*제한된 제네릭 클래스
		-extends로 대입할 수 있는 타입을 제한
		ex) class FruitBox<T extends Fruit>{ //Fruit 자손만 타입으로 지정가능
				ArrayList<T> list = new ArrayList<T>();
				(...생략...)
			}
			
			FruitBox<Apple> appleBox = new FruitBox<Apple>();
			FruitBox<Toy> toyBox = new FruitBox<Toy>(); //Toy는 Fruit의 자손이 아니므로 에러
			
		-인터페이스의 경우 extends를 사용. 'implement'를 사용하지 않음	
		ex) interface Eatable{}
			class FruitBox<T extends Eatable>{~~~}
		
		*제네릭의 제약
		-타입 변수에 대입은 인스턴스 별로 다르게 가능
		ex) Box<Apple> appleBox = new Box<Apple>(); //Apple 객체만 저장가능
			Box<Grape> grapeBox = new Box<Grape>(); //Grape 객체만 저장가능
		-1) static 멤버에 타입 변수 사용 불가 static 멤버는 모든 인스턴스에 공통
		class Box<T>{
			static T item; //에러
			static int compare(T t1, T t2){~~~} //에러
			...
		}	
		-2) 배열, 객체 생성할 때 타입 변수 사용불가. 타입 변수로 배열 선언은 가능
			new T => 객체 생성, 배열 생성 X, new 예약어는 뒤에오는 것이 타입이 확정되어 있어야함. T의 경우 아직 타입이 확정되어 있지 않음
		ex) class Box<T>{
				T[] itemArr; // T타입의 배열을 위한 참조변수. 생성 가능
				...
				T[] toArray(){
					T[] tmpArr = new T[itemArr.length]; //생성 불가
				}
			}
		*/
	}

}
