package chapter14;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * *Predicate�� ����
 * -and(), or(), negate()�� �� Predicate�� �ϳ��� ����(default �޼ҵ�)
 * ���Լ��� interface => default�޼ҵ�, static�޼ҵ�, �߻�޼ҵ�
 * //and() : &&, or() : ||, negate() : !
 * Predicate<Integer> p = i -> i < 100;
 * Predicate<Integer> q = i -> i <200;
 * Predicate<Integer> r = i -> i%2==0;
 * Predicate<Integer> notP = p.negate(); //i>=100
 * Predicate<Integer> all = notP.and(q).or(r); // 100<=i && i<200 || i%2==0
 * Predicate<Integer> all2 = notP.and(q.or(r)); // 100<=i && (i<200 || i%2==0)
 * //test()�� �̿�
 * System.out.println(all.test(2)); //true
 * System.out.println(all2.test(2)); //false
 * -��񱳸� ���� Predicate�� �ۼ����� isEqual()�� ���(static �޼ҵ�)
 * String str1 = "abc";
 * String str2 = "abc";
 * Predicate<String> p = Predicate.isEqual(str1);
 * Boolean result = p.test(str2);
 * //�� ���� ���ٷ�
 * boolean result = Predicate.isEqual(str1).test(str2);
 */

public class Study4_1 {

	public static void main(String[] args) {

		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		
		Function<String, String> h = f.andThen(g); // String -> Integer -> String. �Լ� �ΰ��� ����.
		Function<Integer, Integer> h2 = f.compose(g);
		
		System.out.println(h.apply("FF")); //"FF" �� 255 �� "11111111"
		System.out.println(h2.apply(2)); //2 �� "10" �� 16
		System.out.println("==========================");
		
		Function<String, String> f2 = x -> x; //�׵��Լ�(identity function)
		System.out.println(f2.apply("AAA")); //AAA�� �״�� ���
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
		
		//str1�� str2�� ������ ���� ����� ��ȯ
		Predicate<String> x = Predicate.isEqual(str1);
		boolean result = x.test(str2);
		System.out.println(result);
		
	}

}
