package chapter14;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * * 생성자의 메소드 참조
 * -생성자와 메소드 참조
 * Supplier<MyClass> s = () -> new MyClass();
 * Supplier<MyClass> s = MyClass::new;
 * Function<Integer, MyClass> s = (i) -> new MyClass(i);
 * Function<Integer, MyClass> s = MyClass::new;
 * -배열과 메소드 참조
 * Function<Integer, int[]> f = x -> new int[x]; //람다식
 * Function<Integer, int[]> f2 = int[]::new //메소드 참조. 배열타입[]::new
 */

class MyClass5_2{
	int iv;
	
	public MyClass5_2(int iv) {
		this.iv = iv;
	}
}

public class Study5_2 {
	
	public static void main(String[] args) {
		//Supplier 입력 X, 출력 O
//		Supplier<MyClass5_2> s = () -> new MyClass5_2();
//		Supplier<MyClass5_2> s = MyClass5_2::new;

//		MyClass5_2 mc = s.get(); //MyClass5_2 객체 반환
//		System.out.println(mc);
//		System.out.println(s.get()); //또다른 객체
		
		//생성자가 존재한다면, 입력과 출력이 생기므로 Function으로 바뀌어야함
//		Function<Integer,MyClass5_2> f = (i) -> new MyClass5_2(i);
		Function<Integer,MyClass5_2> f = MyClass5_2::new;
		MyClass5_2 mc = f.apply(100);
		System.out.println(mc.iv);
		System.out.println(f.apply(100).iv);
		
		Function<Integer, int[]> f2 = (i)-> new int[i];
		Function<Integer, int[]> f3 = int[]::new;
		System.out.println(f2.apply(200).length);
		System.out.println(f3.apply(300).length);
		
	}

}
