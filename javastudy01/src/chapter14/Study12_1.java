package chapter14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * *스트림의 최종연산 - forEach()
 * -스트림의 모든 요소에 지정된 작업을 수행 - forEach(), forEachOrdered()
 * void forEach(Consumer<? super T> action) //병렬스트림인 경우 순서가 보장되지 않음
 * void forEachOrdered(Consumer<? super T> action) //병렬스트림인 경우에도 순서가 보장됨
 * //sequential() : 직렬스트림, 생략가능
 * IntStream.range(1,10).sequential().forEach(System.out::print); //123456789
 * IntStream.range(1,10).sequential().forEachOrdered(System.out::print); //123456789
 * //parallel() : 병렬 스트림
 * IntStream.range(1,10).parallel().forEach(System.out::print); //순서가 보장되지 않는 1~9까지 숫자
 * IntStream.range(1,10).parallel().forEachOrdered(System.out::print); //123456789
 */

/**
 * *스트림의 최종연산 - 조건 검사
 * -allMatch(), anyMatch(), noneMatch()
 * boolean allMatch (Predicate<? super T> predicate) //모든 요소가 조건을 만족시키면 true
 * boolean anyMatch (Predicate<? super T> predicate) //한 요소라도 조건을 만족시키면 true
 * boolean noneMatch (Predicate<? super T> predicate) //모든 요소가 조건을 만족시키지 않으면 true
 * -조건에 일치하는 요소 찾기 - findFirst(), findAny()
 * Optional<T> findFirst() //첫 번째 요소를 반환. 순차 스트림에 사용
 * Optional<T> findAny() //아무거나 하나를 반환. 병렬 스트림에 사용
 * //Optional인 이유? 결과가 null일 수 있어서
 */

/**
 * *스트림의 최종연산 - reduce()
 * -스트림의 요소를 하나씩 줄여가며 누적연산 수행
 * Optional<T> reduce(BinaryOperator<T> accumulator)
 * T			reduce(T identity, BinaryOperator<T> accumulator)
 * U			reduce(U identity, BiFunction<U,T,U> accumulator, BinaryOperator<U> combiner)
 * //identity 초기값, accumulator 이전 연산결과와 스트림의 요소에 수행할 연산, combiner 병렬처리된 결과를 합치는데 사용할 연산(병렬 스트림)
 * int count = intStream.reduce(0,(a,b)->a+1); //요소개수
 * int sum = intStream.reduce(0,(a,b)->a+b); //=> int a = identity; for(int b : stream) a=a+b;
 * int max = intStream.reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
 * int min = intStream.reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
 */
public class Study12_1 {

	public static void main(String[] args) {
		
		String[] strArr = {"Inheritance","Java","Lambda","stream","IntStream","OptionalDouble","count","sum"};
		Stream.of(strArr).forEach(System.out::println);

		System.out.println();
		
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0);
		Optional<String> sWord = Stream.of(strArr).filter(s->s.charAt(0)=='s').findFirst();
		
		System.out.println("noEmptyStr = " + noEmptyStr);
		System.out.println("sWord = " + sWord);
		
		System.out.println();
		
		//Stream<String[]>을 IntStream으로 변환
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b)->a+1);
		int sum = intStream2.reduce(0, (a,b)->a+b);
		
		OptionalInt max = intStream3.reduce(Integer::max);
		OptionalInt min = intStream4.reduce(Integer::min);
		
		System.out.println("count = " + count);
		System.out.println("sum = " + sum);
		System.out.println("max = " + max);
		System.out.println("max.getAsInt() = " + max.getAsInt());
		System.out.println("min = " + min);
		System.out.println("min.getAsInt() = " + min.getAsInt());

	}

}
