package chapter14;

import java.io.File;
import java.util.stream.Stream;

/**
 * *��Ʈ���� �߰�����
 * -��Ʈ���� ��Ҹ� �Һ����� �ʰ� ���� - peek()
 * Stream<T> peek(Consumer<? super T> action) //�߰�����(��Ʈ�� �Һ� X)
 * void forEach(Consumer<? super T> action) //��������(��Ʈ�� �Һ� O)
 */
public class Study10_2 {

	public static void main(String[] args) {

		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")};
		Stream<File> fileStream = Stream.of(fileArr);
		
		Stream<String> filenameStream = fileStream.map(File::getName); //map()���� Stream<File>�� Stream<String>���� ��ȯ
		filenameStream.forEach(System.out::println); //��� �����̸��� ���
		
		fileStream = Stream.of(fileArr); //��Ʈ���� �ٽ� ����
		
		fileStream.map(File::getName) //Stream<File> �� Stream<String>
				.filter(s->s.indexOf('.')!=-1) //Ȯ���ڰ� ���� ���� ����
				.map(String::toUpperCase)
				.peek(s->System.out.printf("extension=%s%n", s)) //�߰��߰� Ȯ���� �� ����
				.distinct()
				.forEach(System.out::print);;
				
		System.out.println();	
		
		
	}
}
