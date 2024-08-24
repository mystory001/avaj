package chapter14;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * *스트림의 중간연산
 * -스트림 자르기 - skip(), limit()
 * Stream<T> skip(long n) //앞에서부터 n개 건너뛰기
 * Stream<T> limit(long maxSize) //maxSize 이후의 요소는 잘라냄
 * IntStream intStream = IntStream.rangeClosed(1,10); //12345678910
 * intStream.skip(3).limit(5).forEach(System.out::print); //45678
 * -스트림의 요소 걸러내기 - filter(), distinct()
 * Stream<T> filter(Predicate <? super T> predicate) //조건에 맞지 않는 요소 제거
 * Stream<T> distinct() //중복제거
 * IntStream intStream = IntStream.of(1,2,3,4,4,5,5,5,6,6,1);
 * intStream.distinct().forEach(System.out::print); //123456
 * IntStream intStream = IntStream.rangeClosed(1,10); //12345678910
 * intStream.filter(i->i%2==0).forEach(System.out::print); //246810
 * intStream.filter(i->i%2!=0 &&i%3!=0).forEach(System.out::print);
 * intStream.filter(i->i%2!=0).filter(i->i%3!=0).forEach(System.out::print);
 * -스트림 정렬하기 - sorted()
 * Stream<T> sorted() //스트림 요소의 기본 정렬(Comparable)로 정렬
 * Stream<T> sorted(Comparator<? super T> comparator) //지정된 Comparator로 정렬
 * strStream.sorted() //기본정렬
 * strStream.sorted(Comparator, naturalOrder()) //기본정렬
 * strStream.sorted((s1,s2)->s1.compareTo(s2)) //람다식 가능
 * strStream.sorted(String::comparaTo) //메소드 참조
 * //출력결과 예 : CCaaabccdd
 * strStream.sorted(Comparator.reverseOrder()) //기본 정렬의 역순
 * strStream.sorted(Comparator.(String)naturalOrder().reversed())
 * //출력결과 예 : ddccbaaaCC
 * strStream.sorted(String.CASE_INSENSITIVE_ORDER) //대소문자 구분안함
 * //출력결과 예 : aaabCCccdd
 * strStream.sorted(String.CASE_INSENSITIVE_ORDER.reversed())
 * //출력결과 예 : ddCCccbaaa
 * strStream.sorted(Comparator.comparing(String::length)) //길이 순 정렬
 * strStream.sorted(Comparator.comparingInt(String::length)) //no 오토박
 * //출력결과 예 : bddCCccaaa
 * strStream.sorted(Comparator.comparing(String::length).reversed())
 * //출력결과 예 : aaaddCCccb
 * -Comparator의 comparing()으로 정렬 기준을 제공
 * comparing(Function<T,U> keyExtractor)
 * comparing(Function<T,U> keyExtractor, Comparator<U> keyComparator)
 * studentStream.sorted(Comparator.comparing(Student::getBan)) //반별로 정렬
  			.forEach(System.out::println);
 * -추가 정렬 기준을 제공할 때는 thenComparing() 사용
 * thenComparing(Comparator<T> other)
 * thenComparing(Function<T,U> keyExtractor)
 * thenComparing(Function<T,U> keyExtractor, Comparator<U> keyComp)
 * studentStream.sorted(Comparator.comparing(Student::getBan) //반별로 정렬
  			  .thenComparing(Student::getTotalScore) //총점별로 정렬
              .thenComparing(Student::getName)) //이름별로 정려
              .forEach(System.out::print);
 *  			
 */
class Student9_1 implements Comparable<Student9_1>{
	String name;
	int ban;
	int totalScore;
	
	public Student9_1(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return String.format("[%s, %d, %d]",name,ban,totalScore);
	}
	
	String getName() {return name;}
	int getBan() {return ban;}
	int getTotalScore() {return totalScore;}

	@Override
	public int compareTo(Student9_1 s) {
		return s.totalScore-this.totalScore;
	}
	
}

public class Study9_1 {

	public static void main(String[] args) {

		Stream<Student9_1> studentStream = Stream.of(
											new Student9_1("aaa", 3, 300),
											new Student9_1("bbb", 2, 200),
											new Student9_1("ccc", 2, 150),
											new Student9_1("ddd", 1, 300),
											new Student9_1("eee", 3, 200),
											new Student9_1("fff", 1, 200),
											new Student9_1("ggg", 3, 200)
											);
		studentStream.sorted(Comparator.comparing(Student9_1::getBan) //반별로 정렬
					.thenComparing(Comparator.naturalOrder())) //기본정렬
					.forEach(System.out::println);
		
		
	}
	
}
