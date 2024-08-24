package chapter14;

/**
 * *스트림
 * -다양한 데이터소스(컬렉션, 배열)를 표준화된 방법으로 다루기 위한 것
 * List,Set,Map 사용방법이 같지 않았지만 스트림을 통해 사용방법을 통일시킴
 * Stream → 중간 연산(n번) → 최종연산(1번, 결과)
 * 스트림 작업 : 스트림 만들기 → 중간연산 → 최종연산
 * Stream<T> Collection stream()
 * List<Integer> list = Arrays.asList{1,2,3,4,5};
 * Stream<Integer> intStream = list.stream(); //컬렉션
 * Stream<String> strStream = Stream.of(new String[]{"a","b","c"}); //배열
 * Stream<Integer> evenStream = Stream.iterate(0, n -> n+2); //0,2,4,6,8,...
 * Steram<Double> randomStream = Stream.generate(Math::random);
 * IntStream intStream = new Random().ints(5); //크기가 5인 난수 스트림
 * -스트림이 제공하는 기능
 * 중간 연산 : 연산결과가 스트림인 연산. 반복적으로 적용가능
 * 최종 연산 : 연산결과가 스트림이 아닌 연산. 단 한 번만 적용가능(스트림의 요소를 소모)
 * String[] strArr={"dd","aaa","cc","CC","b"};
 * Stream<String> stream = Stream.of(strArr); //문자열 배열이 소스인 스트림
 * Stream<String> filteredStream = stream.filter(); //걸러내기(중간연산)
 * Stream<String> distinctedStream = stream.distinct(); //중복제거(중간연산)
 * Stream<String> sortedStream = stream.sort(); //정렬(중간연산)
 * Stream<String> limitedStream = stream.limit(5); //스트림자르기(중간연산)
 * int total = stream.count(); //요소 개수 세기(최종 연산)
 */

/**
 * *스트림의 특징
 * -스트림은 데이터 소스로부터 데이터를 읽기만할 뿐 변경하지 않음
 * 원본을 변경하지 않고 오직 읽기만 함
 * List<Integer> list = Arrays.asList(3,1,5,2,4);
 * List<Integer> sortedList = list.stream().sorted() //list를 정렬
  							.collect(Collectors.toList()); //새로운 List에 저장
 * System.out.println(list); // [3,1,5,2,4]
 * System.out.println(sortedList); //[1,2,3,4,5]
 * -Iterator처럼 일회용(한 번 사용하면 다시 스트림을 생성해야함)
 * strStream.forEach(System.out::println); //모든 요소를 화면에 출력(최종연산)
 * int numOfStr = strStream.count(); //에러 스트림이 닫혀있음
 * -최종 연산 전까지 중간연산이 수행되지 않음. 지연된 연산
 * IntStream intStream = new Random().ints(1,46); //1~45범위의 무한 스트림
 * IntStream.distinct().limit(6).sorted() //중간연산
  		.forEach(i->System.out.println(i+", ")); //최종연산
 * -스트림은 작업을 내부 반복으로 처리함
 * -작업을 병렬로 처리 - 병렬 스트림(멀티쓰레드)
 * -기본형 스트림 - IntStream, LongStream, DoubleStream
 * 오토박싱 & 언박싱의 비효율이 제거됨(Stream<Integer> 대신 IntStream 사용)
 * 숫자와 관련된 유용한 메소드를 Stream<T>보다 더 많이 제공
 */

public class Study6_1 {

}
