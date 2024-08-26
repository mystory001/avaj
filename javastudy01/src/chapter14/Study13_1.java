package chapter14;

/**
 * *collect()와 Collectors
 * -collect는 Collector를 매개변수로 하는 스트림의 최종 연산
 * Object collect(Collector collector) //Collector를 구현한 클래스의 객체를 매개변수로
 * -Collector는 수집(collect)에 필요한 메소드를 정의해 놓은 인터페이스
 *  public interface Collector<T,A,R>>{ //T(요소)를 A에 누적한 다음, 결과를 R로 변환해서 반환
 *  	Supplier<A> supplier(); //StringBuilder::new 누적할 곳
 *      BiConsumer<A,T> accumulator(); //(sb,s)->sb.append(s) 누적방법
 *      BinaryOperator<A> combiner(); //(sb1,sb2)->sb1.append(sb2) 결합방법(병렬)
 *      Function<A,R> finisher() //sb->sb.toString() 최종변환
 *      Set<Characteristics> characteristics(); //컬렉터의 특성이 담긴 Set을 반환
 *      ...
 *  }
 * -Collectors 클래스는 다양한 기능의 컬렉터(Collector를 구현한 클래스)를 제공
 * 변환 : mapping(), toList(), toSet, toMap(), toCollection(),...
 * 통계 : counting(), summingInt(), averagingInt(), maxBy(), minBy, summarizingInt(),..
 * 문자열 결합 : joining()
 * 리듀싱 : reducing()
 * 그룹화와 분할 : groupingBy(), partitioningBy(), collectingAndThen()
 */

/**
 * *스트림을 컬렉션, 배열로 변환
 * -스트림을 컬렉션으로 변환 : toList(), toSet(), toMap(), toCollection()
 * -스트림을 배열로 변환 : toArray()
 * Student[] stuNames = studentStream.toArray(Student[]::new); //가능
 * Student[] stuNames = studentStream.toArray(); //에러
 * Object[] stuNames = studentStream.toArray(); //가능
 */

/**
 * *스트림의 통계
 * -스트림의 통계정보 제공 : counting(), summingInt(), maxBy(), minBy(),..
 */

/**
 * *스트림을 리듀싱
 * -스트림을 그룹별 리듀싱 : reducing()
 * Collector reducing(BinaryOperator<T> op)
 * Collector reducing(T identity, BinaryOperator<T> op)
 * Collector reducing(U identity, Function<T,U> mapper ,BinaryOperator<T> op) //map+reduce
 * -문자열 스트림의 요소를 모두 연결 : joining
 */

public class Study13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
