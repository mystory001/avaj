package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * *스트림 만들기 - 컬렉션
 * -Collection
 * Stream<E> stream() //Collection 인터페이스의 메소드
 * List<Integer> list = Arrays.asList(1,2,3,4,5);
 * Stream<Integer> intStream = list.stream(); //list를 스트림을 변환
 * //스트림의 모든 요소를 출력
 * intStream.forEach(System.out::print); //12345
 * intStream.forEach(System.out::print); //에러. 스트림이 닫힘
 * 
 */
public class Study7_1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();
		intStream.forEach(System.out::print);
//		intStream.forEach(System.out::println); //에러발생
		
		//stream은 1회용이므로 최종연산을 수행하면 stream이 닫혀 다시 생성해줘야함
		intStream = list.stream();
		intStream.forEach(System.out::print);
		
		
	}
	
}
