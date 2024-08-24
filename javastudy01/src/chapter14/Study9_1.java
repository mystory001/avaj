package chapter14;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * *��Ʈ���� �߰�����
 * -��Ʈ�� �ڸ��� - skip(), limit()
 * Stream<T> skip(long n) //�տ������� n�� �ǳʶٱ�
 * Stream<T> limit(long maxSize) //maxSize ������ ��Ҵ� �߶�
 * IntStream intStream = IntStream.rangeClosed(1,10); //12345678910
 * intStream.skip(3).limit(5).forEach(System.out::print); //45678
 * -��Ʈ���� ��� �ɷ����� - filter(), distinct()
 * Stream<T> filter(Predicate <? super T> predicate) //���ǿ� ���� �ʴ� ��� ����
 * Stream<T> distinct() //�ߺ�����
 * IntStream intStream = IntStream.of(1,2,3,4,4,5,5,5,6,6,1);
 * intStream.distinct().forEach(System.out::print); //123456
 * IntStream intStream = IntStream.rangeClosed(1,10); //12345678910
 * intStream.filter(i->i%2==0).forEach(System.out::print); //246810
 * intStream.filter(i->i%2!=0 &&i%3!=0).forEach(System.out::print);
 * intStream.filter(i->i%2!=0).filter(i->i%3!=0).forEach(System.out::print);
 * -��Ʈ�� �����ϱ� - sorted()
 * Stream<T> sorted() //��Ʈ�� ����� �⺻ ����(Comparable)�� ����
 * Stream<T> sorted(Comparator<? super T> comparator) //������ Comparator�� ����
 * strStream.sorted() //�⺻����
 * strStream.sorted(Comparator, naturalOrder()) //�⺻����
 * strStream.sorted((s1,s2)->s1.compareTo(s2)) //���ٽ� ����
 * strStream.sorted(String::comparaTo) //�޼ҵ� ����
 * //��°�� �� : CCaaabccdd
 * strStream.sorted(Comparator.reverseOrder()) //�⺻ ������ ����
 * strStream.sorted(Comparator.(String)naturalOrder().reversed())
 * //��°�� �� : ddccbaaaCC
 * strStream.sorted(String.CASE_INSENSITIVE_ORDER) //��ҹ��� ���о���
 * //��°�� �� : aaabCCccdd
 * strStream.sorted(String.CASE_INSENSITIVE_ORDER.reversed())
 * //��°�� �� : ddCCccbaaa
 * strStream.sorted(Comparator.comparing(String::length)) //���� �� ����
 * strStream.sorted(Comparator.comparingInt(String::length)) //no �����
 * //��°�� �� : bddCCccaaa
 * strStream.sorted(Comparator.comparing(String::length).reversed())
 * //��°�� �� : aaaddCCccb
 * -Comparator�� comparing()���� ���� ������ ����
 * comparing(Function<T,U> keyExtractor)
 * comparing(Function<T,U> keyExtractor, Comparator<U> keyComparator)
 * studentStream.sorted(Comparator.comparing(Student::getBan)) //�ݺ��� ����
  			.forEach(System.out::println);
 * -�߰� ���� ������ ������ ���� thenComparing() ���
 * thenComparing(Comparator<T> other)
 * thenComparing(Function<T,U> keyExtractor)
 * thenComparing(Function<T,U> keyExtractor, Comparator<U> keyComp)
 * studentStream.sorted(Comparator.comparing(Student::getBan) //�ݺ��� ����
  			  .thenComparing(Student::getTotalScore) //�������� ����
              .thenComparing(Student::getName)) //�̸����� ����
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
		studentStream.sorted(Comparator.comparing(Student9_1::getBan) //�ݺ��� ����
					.thenComparing(Comparator.naturalOrder())) //�⺻����
					.forEach(System.out::println);
		
		
	}
	
}
