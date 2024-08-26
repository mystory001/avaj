package chapter14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * *��Ʈ���� �������� - forEach()
 * -��Ʈ���� ��� ��ҿ� ������ �۾��� ���� - forEach(), forEachOrdered()
 * void forEach(Consumer<? super T> action) //���Ľ�Ʈ���� ��� ������ ������� ����
 * void forEachOrdered(Consumer<? super T> action) //���Ľ�Ʈ���� ��쿡�� ������ �����
 * //sequential() : ���Ľ�Ʈ��, ��������
 * IntStream.range(1,10).sequential().forEach(System.out::print); //123456789
 * IntStream.range(1,10).sequential().forEachOrdered(System.out::print); //123456789
 * //parallel() : ���� ��Ʈ��
 * IntStream.range(1,10).parallel().forEach(System.out::print); //������ ������� �ʴ� 1~9���� ����
 * IntStream.range(1,10).parallel().forEachOrdered(System.out::print); //123456789
 */

/**
 * *��Ʈ���� �������� - ���� �˻�
 * -allMatch(), anyMatch(), noneMatch()
 * boolean allMatch (Predicate<? super T> predicate) //��� ��Ұ� ������ ������Ű�� true
 * boolean anyMatch (Predicate<? super T> predicate) //�� ��Ҷ� ������ ������Ű�� true
 * boolean noneMatch (Predicate<? super T> predicate) //��� ��Ұ� ������ ������Ű�� ������ true
 * -���ǿ� ��ġ�ϴ� ��� ã�� - findFirst(), findAny()
 * Optional<T> findFirst() //ù ��° ��Ҹ� ��ȯ. ���� ��Ʈ���� ���
 * Optional<T> findAny() //�ƹ��ų� �ϳ��� ��ȯ. ���� ��Ʈ���� ���
 * //Optional�� ����? ����� null�� �� �־
 */

/**
 * *��Ʈ���� �������� - reduce()
 * -��Ʈ���� ��Ҹ� �ϳ��� �ٿ����� �������� ����
 * Optional<T> reduce(BinaryOperator<T> accumulator)
 * T			reduce(T identity, BinaryOperator<T> accumulator)
 * U			reduce(U identity, BiFunction<U,T,U> accumulator, BinaryOperator<U> combiner)
 * //identity �ʱⰪ, accumulator ���� �������� ��Ʈ���� ��ҿ� ������ ����, combiner ����ó���� ����� ��ġ�µ� ����� ����(���� ��Ʈ��)
 * int count = intStream.reduce(0,(a,b)->a+1); //��Ұ���
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
		
		//Stream<String[]>�� IntStream���� ��ȯ
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
