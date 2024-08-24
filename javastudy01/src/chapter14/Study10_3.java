package chapter14;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * *��Ʈ���� �߰�����
 * -��Ʈ���� ��Ʈ���� ��Ʈ������ ��ȯ - flatMap()
 * Stream<String[]> strArrStrm = Stream.of(new String[]{"abc","def","ghi"}, new String[] {"ABC","GHI","JKLMN"});
 * Stream<Stream<String>> strStrStrm = strArrStrm.map(Arrays::stream);//��Ʈ���� ��Ʈ��
 * Stream<Stream<String>> strStrStrm = strArrStrm.flatMap(Arrays::stream); //Arrays.stream(T[])
 * 
 */
public class Study10_3 {

	public static void main(String[] args) {

		Stream<String[]> strArrStrm = Stream.of(new String[]{"abc","def","ghi"}, new String[] {"ABC","GHI","JKLMN"});
		
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		strStrm.map(String::toLowerCase) //��Ʈ���� ��Ҹ� ��� �ҹ��ڷ� ����
				.distinct() //�ߺ� ����
				.sorted() //����
				.forEach(System.out::println);

		System.out.println();
		
		String[] lineArr = {
				"abc def ghi",
				"stream is not easy"
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line->Stream.of(line.split(" +"))) //���Խı�ȣ �ϳ��̻��� ����
				.map(String::toLowerCase)
				.distinct()
				.sorted()
				.forEach(System.out::println);
			
	}
}
