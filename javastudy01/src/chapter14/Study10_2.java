package chapter14;

import java.io.File;
import java.util.stream.Stream;

/**
 * *스트림의 중간연산
 * -스트림의 요소를 소비하지 않고 보기 - peek()
 * Stream<T> peek(Consumer<? super T> action) //중간연산(스트림 소비 X)
 * void forEach(Consumer<? super T> action) //최종연산(스트림 소비 O)
 */
public class Study10_2 {

	public static void main(String[] args) {

		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")};
		Stream<File> fileStream = Stream.of(fileArr);
		
		Stream<String> filenameStream = fileStream.map(File::getName); //map()으로 Stream<File>을 Stream<String>으로 변환
		filenameStream.forEach(System.out::println); //모든 파일이름을 출력
		
		fileStream = Stream.of(fileArr); //스트림을 다시 생성
		
		fileStream.map(File::getName) //Stream<File> → Stream<String>
				.filter(s->s.indexOf('.')!=-1) //확장자가 없는 것은 제외
				.map(String::toUpperCase)
				.peek(s->System.out.printf("extension=%s%n", s)) //중간중간 확인할 수 있음
				.distinct()
				.forEach(System.out::print);;
				
		System.out.println();	
		
		
	}
}
