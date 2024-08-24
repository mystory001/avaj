package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * *��Ʈ�� ����� - �÷���
 * -Collection
 * Stream<E> stream() //Collection �������̽��� �޼ҵ�
 * List<Integer> list = Arrays.asList(1,2,3,4,5);
 * Stream<Integer> intStream = list.stream(); //list�� ��Ʈ���� ��ȯ
 * //��Ʈ���� ��� ��Ҹ� ���
 * intStream.forEach(System.out::print); //12345
 * intStream.forEach(System.out::print); //����. ��Ʈ���� ����
 * 
 */
public class Study7_1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();
		intStream.forEach(System.out::print);
//		intStream.forEach(System.out::println); //�����߻�
		
		//stream�� 1ȸ���̹Ƿ� ���������� �����ϸ� stream�� ���� �ٽ� �����������
		intStream = list.stream();
		intStream.forEach(System.out::print);
		
		
	}
	
}
