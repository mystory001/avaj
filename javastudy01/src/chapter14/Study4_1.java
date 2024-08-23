package chapter14;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * *Predicate의 결합
 * -and(), or(), negate()로 두 Predicate를 하나로 결합(default 메소드)
 * ※함수형 interface => default메소드, static메소드, 추상메소드
 * //and() : &&, or() : ||, negate() : !
 * Predicate<Integer> p = i -> i < 100;
 * Predicate<Integer> q = i -> i <200;
 * Predicate<Integer> r = i -> i%2==0;
 * Predicate<Integer> notP = p.negate(); //i>=100
 * Predicate<Integer> all = notP.and(q).or(r); // 100<=i && i<200 || i%2==0
 * Predicate<Integer> all2 = notP.and(q.or(r)); // 100<=i && (i<200 || i%2==0)
 * //test()를 이용
 * System.out.println(all.test(2)); //true
 * System.out.println(all2.test(2)); //false
 * -등가비교를 위한 Predicate의 작성에는 isEqual()를 사용(static 메소드)
 * String str1 = "abc";
 * String str2 = "abc";
 * Predicate<String> p = Predicate.isEqual(str1);
 * Boolean result = p.test(str2);
 * //두 줄을 한줄로
 * boolean result = Predicate.isEqual(str1).test(str2);
 */

public class Study4_1 {

	public static void main(String[] args) {

		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		
		Function<String, String> h = f.andThen(g); // String -> Integer -> String. 함수 두개를 연결.
		Function<Integer, Integer> h2 = f.compose(g);
		
		System.out.println(h.apply("FF")); //"FF" → 255 → "11111111"
		System.out.println(h2.apply(2)); //2 → "10" → 16
		System.out.println("==========================");
		
		Function<String, String> f2 = x -> x; //항등함수(identity function)
		System.out.println(f2.apply("AAA")); //AAA가 그대로 출력
		System.out.println("==========================");
		
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2==0;
		Predicate<Integer> notP = p.negate(); //!p => i>=100
		
		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150));
		
		System.out.println("==========================");
		
		String str1 = "abc";
		String str2 = "abc";
		
		//str1과 str2가 같은지 비교한 결과를 반환
		Predicate<String> x = Predicate.isEqual(str1);
		boolean result = x.test(str2);
		System.out.println(result);
		
	}

}
