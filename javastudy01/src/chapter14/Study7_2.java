package chapter14;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * *��Ʈ�� ����� - �迭
 * -��ü �迭�κ��� ��Ʈ�� �����ϱ�
 * Stream<T> Stream.of(T... values) //��������
 * Stream<T> Stream.of(T[])
 * Stream<T> Stream.stream(T[])
 * Stream<T> Arrays.stream(T[] array, int startInclusive, int endExclusive) //from to
 * -�⺻�� �迭�κ��� ��Ʈ�� �����ϱ�
 * IntStream IntStream.of(int... value) //Stream�� �ƴ� IntStream
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
//		System.out.println("count = " + intStream.count()); //IntStream�� ���ڰ� ������� �� �� �־� �� ���� �޼ҵ带 ����
		System.out.println("average = " + intStream.average());
//		intStream.forEach(System.out::print);
		
		Integer[] intArr2 = {1,2,3,4,5};
//		Integer[] intArr2 = {new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5)};
		Stream<Integer> intStream2 = Arrays.stream(intArr2);
		intStream2.forEach(System.out::print);
		
	}

}
