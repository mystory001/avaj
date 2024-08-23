package chapter14;

import java.util.function.Function;

/**
 * *메소드 참조(method reference)
 * -하나의 메소드만 호출하는 람다식은 '메소드 참조'로 간단히 할 수 있음 => 클래스이름::메소드이름
 * -static 메소드 참조
 */

public class Study5_1 {

	public static void main(String[] args) {
		
//		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		Function<String, Integer> f = Integer::parseInt; //메소드 참조
		System.out.println(f.apply("100")+200);

	}

}
