package chapter14;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * *��Ʈ�� ����� - ������ ��
 * -������ ��ҷ� ���� ��Ʈ�� �����ϱ�
 * IntStream intStream = new Random().ints(); //���� ��Ʈ��
 * intStream.limit(5).forEach(System.out::println); //5���� ��Ҹ� ���
 * ==>
 * IntStream intStream = new Random().ints(5); //ũ�Ⱑ 5�� ���� ��Ʈ���� ��ȯ
 * Integer.MIN_VALUE <= ints() <= Integer.MAX_VALUE
 * Long.MIN_VALUE <= longs() <= Long.MAX_VALUE
 * 0.0<= doubles() < 1.0
 * -������ ������ ������ ��ҷ� ���� ��Ʈ���� �����ϴ� �޼ҵ�(Random Ŭ����)
 * //���� ��Ʈ��
 * IntStream ints(int begin, int end);
 * LongStream longs(int begin, int end);
 * DoublesStream doubles(int begin, int end);
 * //���� ��Ʈ��
 * IntStream ints(long streamSize, int begin, int end);
 * LongStream longs(long streamSize, long begin, long end);
 * DoubleStream doubles(long streamSize, double begin, double end);
 */

public class Study7_3 {

	public static void main(String[] args) {

		IntStream intStream = new Random().ints();
		intStream
		.limit(5) //5���� �ڸ���
		.forEach(System.out::println);

		System.out.println();
		
		IntStream intStream2 = new Random().ints(10,5,10);
		intStream2
		.forEach(System.out::println);
		
		
	}
}
