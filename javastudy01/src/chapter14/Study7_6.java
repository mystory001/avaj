package chapter14;

/**
 * *스트림 만들기 - 파일과 빈 스트림
 * -파일을 소스로 하는 스트림 생성
 * Stream<Path> Files.list(Path dir) //Path는 파일 또는 디렉토리
 * Stream<String> Files.lines(Path path)
 * Stream<String> Files.lines(Path path, Charset cs)
 * Stream<String> lines() //BufferedReader 클래스의 메소드. 파일 내용을 라인 단위를 String
 * -비어 있는 스트림 생성하기
 * Stream emptyStream = Stream.empty(); //empty()는 빈 스트림을 생성해서 반환
 * long count = emptyStream.count(); //0
 */

public class Study7_6 {
	
}
