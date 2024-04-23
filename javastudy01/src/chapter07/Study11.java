package chapter07;

public class Study11 {
	
	public static void main(String[] args) {

		//다형성(polymorphism)
		//여러 가지 형태를 가질 수 있는 능력
		//조상 타입 참조 변수로 자손 타입 객체를 다루는 것
		
		//객체와 참조변수의 타입이 일치할 때와 일치하지 않을 때 차이?
		//SmartTV sTV = new SmartTV(); //참조 변수와 인스턴스의 타입이 일치 => 모든 기능 사용 가능
		//TV tv = new SmartTV(); //조상 타입 참조변수로 자손 타입 인스턴스 참조 => TV 기능만 사용 가능
		
		//자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없음
		//TV tv = new SmartTV(); //허용
		//SmartTV sTV = new TV(); //에러. 허용안됨. 없는 기능을 호출해서 에러가 발생
		
		//참조변수의 타입은 인스턴스의 타입과 반드시 일치해야하는가? => 보틍은 일치하지만 일치하지 않을 수도 있음(다형성)
		//참조변수가 조상타입일 때와 자손타입일 때의 차이는? => 참조변수로 사용할 수 있는 멤버의 개수가 달라짐
		//자손타입의 참조변수로 조상타입의 객체를 가리킬 수 있을까? => ㄴㄴ. 자손 기능이 더 많기 때문에 허용되지 않음
		
	}

}
