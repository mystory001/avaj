package chapter14;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * *스트림 만들기 - 배열
 * -객체 배열로부터 스트림 생성하기
 * Stream<T> Stream.of(T... values) //가변인자
 * Stream<T> Stream.of(T[])
 * Stream<T> Stream.stream(T[])
 * Stream<T> Arrays.stream(T[] array, int startInclusive, int endExclusive) //from to
 * -기본형 배열로부터 스트림 생성하기
 * IntStream IntStream.of(int... value) //Stream이 아닌 IntStream
 * IntStream IntStream.of(int[])
 * IntStream Arrays.stream(int[])
 * IntStream Arrays.stream(int[] array, int startInclusive, int endExclusive)
 */

public class Study7_2 {
	
	public static void main(String[] args) {

		Stream<String> strStream = Stream.of("a","b","c");
		strStream.forEach(System.out::print);
		
		String[] strArr = new String[] {"a","b","c","d"};
//		Stream<String> strStream2 = Stream.of(strArr);
		Stream<String> strStream2 = Stream.of(new String[]{"a","b","c","d"});
		strStream2.forEach(System.out::print);
		
		Stream<String> strStream3 = Arrays.stream(strArr);
		strStream3.forEach(System.out::print);
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);
//		System.out.println("count = " + intStream.count()); //IntStream은 숫자가 요소임을 알 수 있어 더 많은 메소드를 포함
		System.out.println("average = " + intStream.average());
//		intStream.forEach(System.out::print);
		
		Integer[] intArr2 = {1,2,3,4,5};
//		Integer[] intArr2 = {new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5)};
		Stream<Integer> intStream2 = Arrays.stream(intArr2);
		intStream2.forEach(System.out::print);
		
	}

}
