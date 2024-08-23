package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * *java.util.function ��Ű��
 * -���� ���Ǵ� �پ��� �Լ��� �������̽��� ����(ǥ��ȭ�� ������ ��)
 * java.lang.Runnable : �Ű������� ����, ��ȯ���� ����
 * Supplier<T> : �Ű������� ���� ��ȯ���� ����. ������
 * Consumer<T> : �Ű������� �ְ� ��ȯ���� ����. �Һ���
 * Function<T,R> : �Ϲ����� �Լ�. �ϳ��� �Ű������� �޾Ƽ� ����� ��ȯ
 * Predicate<T> : ���ǽ��� ǥ���ϴµ� ����. �Ű������� �ϳ�, ��ȯ Ÿ���� boolean. ���ǽ�
 * -�Ű������� 2���� �Լ��� �������̽�
 * BiConsumer<T,U> : �� ���� �Ű������� �ְ�, ��ȯ���� ����
 * BiPredicate<T,U> : ���ǽ��� ǥ���ϴµ� ����. �Ű������� ��, ��ȯ���� boolean
 * BiFunction<T,U,R> : �� ���� �Ű������� �޾Ƽ� �ϳ��� ����� ��ȯ
 * -�Ű������� Ÿ�԰� ��ȯŸ���� ��ġ�ϴ� �Լ��� �������̽�
 * UnaryOperator<T> : Function�� �ڼ�, Function�� �޸� �Ű������� ����� Ÿ���� ����.
 * BinaryOperator<T> : BiFunction�� �ڼ�, BiFunction�� �޸� �Ű������� ����� Ÿ���� ����.
 */


public class Study3_1 {

	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());

		for(T i : list) {
			newList.add(f.apply(i));
		}	

		return newList;
	}

	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i)) //¦������ �˻�
				c.accept(i); //ȭ�鿡 i ���
		}	
		System.out.println("]");
	}

	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0;i<10;i++) {
			list.add(s.get());
		}
	}
	
	public static void main(String[] args) {
		Supplier<Integer>  s = ()-> (int)(Math.random()*100)+1; //1~100����
		Consumer<Integer>  c = i -> System.out.print(i+", "); 
		Predicate<Integer> p = i -> i%2==0;  //¦������ �˻�
		Function<Integer, Integer> f = i -> i/10*10; // i�� ���� �ڸ��� ���ش�.

		List<Integer> list = new ArrayList<>();	
		makeRandomList(s, list); //list�� ���������� ä��
		System.out.println(list);
		printEvenNum(p, c, list); //¦���� ���
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);

	}

}
