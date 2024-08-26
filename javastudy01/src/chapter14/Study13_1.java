package chapter14;

/**
 * *collect()�� Collectors
 * -collect�� Collector�� �Ű������� �ϴ� ��Ʈ���� ���� ����
 * Object collect(Collector collector) //Collector�� ������ Ŭ������ ��ü�� �Ű�������
 * -Collector�� ����(collect)�� �ʿ��� �޼ҵ带 ������ ���� �������̽�
 *  public interface Collector<T,A,R>>{ //T(���)�� A�� ������ ����, ����� R�� ��ȯ�ؼ� ��ȯ
 *  	Supplier<A> supplier(); //StringBuilder::new ������ ��
 *      BiConsumer<A,T> accumulator(); //(sb,s)->sb.append(s) �������
 *      BinaryOperator<A> combiner(); //(sb1,sb2)->sb1.append(sb2) ���չ��(����)
 *      Function<A,R> finisher() //sb->sb.toString() ������ȯ
 *      Set<Characteristics> characteristics(); //�÷����� Ư���� ��� Set�� ��ȯ
 *      ...
 *  }
 * -Collectors Ŭ������ �پ��� ����� �÷���(Collector�� ������ Ŭ����)�� ����
 * ��ȯ : mapping(), toList(), toSet, toMap(), toCollection(),...
 * ��� : counting(), summingInt(), averagingInt(), maxBy(), minBy, summarizingInt(),..
 * ���ڿ� ���� : joining()
 * ����� : reducing()
 * �׷�ȭ�� ���� : groupingBy(), partitioningBy(), collectingAndThen()
 */

/**
 * *��Ʈ���� �÷���, �迭�� ��ȯ
 * -��Ʈ���� �÷������� ��ȯ : toList(), toSet(), toMap(), toCollection()
 * -��Ʈ���� �迭�� ��ȯ : toArray()
 * Student[] stuNames = studentStream.toArray(Student[]::new); //����
 * Student[] stuNames = studentStream.toArray(); //����
 * Object[] stuNames = studentStream.toArray(); //����
 */

/**
 * *��Ʈ���� ���
 * -��Ʈ���� ������� ���� : counting(), summingInt(), maxBy(), minBy(),..
 */

/**
 * *��Ʈ���� �����
 * -��Ʈ���� �׷캰 ����� : reducing()
 * Collector reducing(BinaryOperator<T> op)
 * Collector reducing(T identity, BinaryOperator<T> op)
 * Collector reducing(U identity, Function<T,U> mapper ,BinaryOperator<T> op) //map+reduce
 * -���ڿ� ��Ʈ���� ��Ҹ� ��� ���� : joining
 */

public class Study13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
