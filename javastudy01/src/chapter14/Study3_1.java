package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * *java.util.function 패키지
 * -자주 사용되는 다양한 함수형 인터페이스를 제공(표준화에 도움이 됨)
 * java.lang.Runnable : 매개변수도 없고, 반환값도 없음
 * Supplier<T> : 매개변수는 없고 반환값만 있음. 공급자
 * Consumer<T> : 매개변수만 있고 반환값이 없음. 소비자
 * Function<T,R> : 일반적인 함수. 하나의 매개변수를 받아서 결과를 반환
 * Predicate<T> : 조건식을 표현하는데 사용됨. 매개변수는 하나, 반환 타입은 boolean. 조건식
 * -매개변수가 2개인 함수형 인터페이스
 * BiConsumer<T,U> : 두 개의 매개변수만 있고, 반환값은 없음
 * BiPredicate<T,U> : 조건식을 표현하는데 사용됨. 매개변수는 둘, 반환값은 boolean
 * BiFunction<T,U,R> : 두 개의 매개변수를 받아서 하나의 결과를 반환
 * -매개변수의 타입과 반환타입이 일치하는 함수형 인터페이스
 * UnaryOperator<T> : Function의 자손, Function과 달리 매개변수와 결과의 타입이 같음.
 * BinaryOperator<T> : BiFunction의 자손, BiFunction과 달리 매개변수와 결과의 타입이 같음.
 */


public class Study3_1 {

	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());

		for(T i : list) {
			newList.add(f.apply(i));
		}	

		return newList;
	}

	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i)) //짝수인지 검사
				c.accept(i); //화면에 i 출력
		}	
		System.out.println("]");
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0;i<10;i++) {
			list.add(s.get());
		}
	}
	
	public static void main(String[] args) {
		Supplier<Integer>  s = ()-> (int)(Math.random()*100)+1; //1~100난수
		Consumer<Integer>  c = i -> System.out.print(i+", "); 
		Predicate<Integer> p = i -> i%2==0;  //짝수인지 검사
		Function<Integer, Integer> f = i -> i/10*10; // i의 일의 자리를 없앤다.

		List<Integer> list = new ArrayList<>();	
		makeRandomList(s, list); //list를 램덤값으로 채움
		System.out.println(list);
		printEvenNum(p, c, list); //짝수를 출력
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);

	}

}
