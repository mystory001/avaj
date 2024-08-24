package chapter14;

import java.io.File;
import java.util.stream.Stream;

/**
 * *스트림의 중간연산
 * -스트림 요소 변환하기 - map()
 * Stream<R> map(Function<?super T, ? extends R> mapper) //Stream<T>에서 Stream<R>
 */

public class Study10_1 {
	
	public static void main(String[] args) {

		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")};
		Stream<File> fileStream = Stream.of(fileArr);
		
		Stream<String> filenameStream = fileStream.map(File::getName); //map()으로 Stream<File>을 Stream<String>으로 변환
		filenameStream.forEach(System.out::println); //모든 파일이름을 출력
		
		fileStream = Stream.of(fileArr); //스트림을 다시 생성
		
		fileStream.map(File::getName) //Stream<File> → Stream<String>
				.filter(s->s.indexOf('.')!=-1) //확장자가 없는 것은 제외
				.map(String::toUpperCase)
				.distinct()
				.forEach(System.out::print);;
				
		System.out.println();		
	}

}
