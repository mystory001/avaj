package chapter14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * *�÷��� �����ӿ�ũ�� �Լ��� �������̽�
 * -�Լ��� �������̽��� ����ϴ� �÷��� �����ӿ�ũ�� �޼ҵ�(���ϵ�ī�� ����)
 * Collection �������̽�
 * => boolean removeif(Predicate<E> fillter) : ���ǿ� �´� ��Ҹ� ����
 * List �������̽�
 * => void replaceAll(UnaryOperator<E> operator) : ��� ��Ҹ� ��ȯ�Ͽ� ��ü
 * Iterable �������̽�
 * => void forEach(Consumer<T> action) : ��� ��ҿ� �۾� action�� ����
 * Map �������̽�
 * => V compute(K key, BiFunction<K,V,V> f) :  ������ Ű�� ���� �۾� f�� ����
 * V computeIfAbsent(K key, Function<K,V> f) : Ű�� ������, �۾� f ���� �� �߰�
 * V computeIfPresent(K key, BiFunction<K, V, V> f) : ������ Ű�� ���� ��, �۾� f ����
 * V merge(K key, V value, BiFunction<V,V,V> f) : ��� ��ҿ� �����۾� f�� ����
 * void forEach(BiConsumer<K,V> action) : ��� ��ҿ� �۾� action�� ����
 * void repaceAll(BiFunction<K,V,V>f) : ��� ��ҿ� ġȯ�۾� f�� ����
 */

public class Study4_2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<10; i++)
			list.add(i);
		
		//list�� ��� ��Ҹ� ���
		list.forEach(i->System.out.print(i+","));
		System.out.println();
		//���ٽ��� �ƴ� ���
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		System.out.println();
		
		//list���� 2 �Ǵ� 3�� ����� ����
		list.removeIf(x->x%2==0||x%3==0);
		System.out.println(list);
		
		list.replaceAll(i->i*10); //list�� �� ��ҿ� 10�� ����
		System.out.println(list);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		//map�� ��� ��Ҹ� {k,v}�� �������� ���
		map.forEach((k,v)->System.out.print("{"+k+", "+v+"}, "));

	}

}
