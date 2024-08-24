package chapter14;

import java.util.stream.Stream;

/**
 * *��Ʈ�� ����� - ���ٽ� iterate(), generate()
 * -���ٽ��� �ҽ��� �ϴ� ��Ʈ�� ����
 * static <T> Stream<T> iterate(T seed, UnaryOperator<T> f) //���� ��ҿ� ������. T seed �ʱⰪ, ���ѽ�Ʈ��
 * static <T> Stream<T> genrate(Supplier<T> s) //���� ��ҿ� ������
 * -iterate()�� ���� ��Ҹ� seed�� �ؼ� ���� ��Ҹ� ���
 * Stream<Integer> evenStream = Stream.iterate(0, n->n+2); //0,2,4,6,...
 * -generate()�� seed�� ������� ����
 * Stream<Double> randomStream = Stream.generate(Math::random);
 * Stream<Integer> oneStrem = Stream.generate(()->1);
 */

public class Study7_5 {
	
	public static void main(String[] args) {

		//iterate(T seed, UnaryOperator f) 
		Stream<Integer> intStream = Stream.iterate(1, n->n+2);
		intStream.limit(10).forEach(System.out::print);
		
		//generate(Supplier s) : �ֱ⸸ �ϴ� ��. �Է� X ��� O
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream.limit(10).forEach(System.out::print);
	}
	
}
