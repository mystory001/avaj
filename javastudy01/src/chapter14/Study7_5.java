package chapter14;

import java.util.stream.Stream;

/**
 * *스트림 만들기 - 람다식 iterate(), generate()
 * -람다식을 소스로 하는 스트림 생성
 * static <T> Stream<T> iterate(T seed, UnaryOperator<T> f) //이전 요소에 종속적. T seed 초기값, 무한스트림
 * static <T> Stream<T> genrate(Supplier<T> s) //이전 요소에 독립적
 * -iterate()는 이전 요소를 seed로 해서 다음 요소를 계산
 * Stream<Integer> evenStream = Stream.iterate(0, n->n+2); //0,2,4,6,...
 * -generate()는 seed를 사용하지 않음
 * Stream<Double> randomStream = Stream.generate(Math::random);
 * Stream<Integer> oneStrem = Stream.generate(()->1);
 */

public class Study7_5 {
	
	public static void main(String[] args) {

		//iterate(T seed, UnaryOperator f) 
		Stream<Integer> intStream = Stream.iterate(1, n->n+2);
		intStream.limit(10).forEach(System.out::print);
		
		//generate(Supplier s) : 주기만 하는 것. 입력 X 출력 O
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream.limit(10).forEach(System.out::print);
	}
	
}
