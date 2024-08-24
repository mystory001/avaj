package chapter14;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * *스트림 만들기 - 임의의 수
 * -난수를 요소로 갖는 스트림 생성하기
 * IntStream intStream = new Random().ints(); //무한 스트림
 * intStream.limit(5).forEach(System.out::println); //5개의 요소만 출력
 * ==>
 * IntStream intStream = new Random().ints(5); //크기가 5인 난수 스트림을 반환
 * Integer.MIN_VALUE <= ints() <= Integer.MAX_VALUE
 * Long.MIN_VALUE <= longs() <= Long.MAX_VALUE
 * 0.0<= doubles() < 1.0
 * -지정된 범위의 난수를 요소로 갖는 스트림을 생성하는 메소드(Random 클래스)
 * //무한 스트림
 * IntStream ints(int begin, int end);
 * LongStream longs(int begin, int end);
 * DoublesStream doubles(int begin, int end);
 * //유한 스트림
 * IntStream ints(long streamSize, int begin, int end);
 * LongStream longs(long streamSize, long begin, long end);
 * DoubleStream doubles(long streamSize, double begin, double end);
 */

public class Study7_3 {

	public static void main(String[] args) {

		IntStream intStream = new Random().ints();
		intStream
		.limit(5) //5개만 자르기
		.forEach(System.out::println);

		System.out.println();
		
		IntStream intStream2 = new Random().ints(10,5,10);
		intStream2
		.forEach(System.out::println);
		
		
	}
}
