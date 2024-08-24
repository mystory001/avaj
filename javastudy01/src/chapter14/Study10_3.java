package chapter14;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * *스트림의 중간연산
 * -스트림의 스트림을 스트림으로 변환 - flatMap()
 * Stream<String[]> strArrStrm = Stream.of(new String[]{"abc","def","ghi"}, new String[] {"ABC","GHI","JKLMN"});
 * Stream<Stream<String>> strStrStrm = strArrStrm.map(Arrays::stream);//스트림의 스트림
 * Stream<Stream<String>> strStrStrm = strArrStrm.flatMap(Arrays::stream); //Arrays.stream(T[])
 * 
 */
public class Study10_3 {

	public static void main(String[] args) {

		Stream<String[]> strArrStrm = Stream.of(new String[]{"abc","def","ghi"}, new String[] {"ABC","GHI","JKLMN"});
		
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		strStrm.map(String::toLowerCase) //스트림의 요소를 모두 소문자로 변경
				.distinct() //중복 제거
				.sorted() //정렬
				.forEach(System.out::println);

		System.out.println();
		
		String[] lineArr = {
				"abc def ghi",
				"stream is not easy"
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line->Stream.of(line.split(" +"))) //정규식기호 하나이상의 공백
				.map(String::toLowerCase)
				.distinct()
				.sorted()
				.forEach(System.out::println);
			
	}
}
