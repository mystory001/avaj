package chapter14;

/**
 * *함수형 인터페이스 타입의 매개변수, 반환타입
 * -함수형 인터페이스 타입의 매개변수
 * void exMethod(MyFunction f){
 * 	f.myMethod(); //MyFunction에 정의된 메소드 호출
 * }
 * @FunctionalInterface
 * interface MyFunction{
 * 	void myMethod();
 * }
 * MyFunction f = () -> System.out.println("myMethod()"));
 * exMethod(f);
 * //두 줄을 한 문장으로
 * exMethod(() -> System.out.println("myMethod()"));
 * -함수형 인터페이스 타입의 반환타입
 * MyFunction myFunction(){
 * 	MyFunction f = ()->{};
 *     return f;
 *     }
 * ==>
 * MyFunction myMethod(){
 * 	return () -> {};
 * }
 */

@FunctionalInterface
interface MyFunction2_2{
	void run(); // == public abstract void run();
}

public class Study2_2 {
	
	static void execute(MyFunction2_2 f) { //매개변수 타입이 MyFunction2_2인 메소드
		f.run();
	}
	
	static MyFunction2_2 getMyFunction2_2() { //반환타입이 MyFunction2_2인 메소드
//		MyFunction2_2 f = () -> System.out.println("f3.run()");
//		return f;
		return ()-> System.out.println("f3.run()");
		
	}

	public static void main(String[] args) {
		
		//람다식으로 MyFunction2_2의 run()을 구현
		MyFunction2_2 f1 = () -> System.out.println("f1.run()");
		
		MyFunction2_2 f2 = new MyFunction2_2() { //익명클래스로 run()을 구현
			@Override
			public void run() { //반드시 public을 붙여야함
				System.out.println("f2.run()");
				
			}
		};
		
		MyFunction2_2 f3 = getMyFunction2_2();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(f2);
		execute(f3);
		execute(()->System.out.println("run()"));
		
	}

}
