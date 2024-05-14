package chapter11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Study11Ex2 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("����", 60);
		map.put("����", 70);
		map.put("����", 40);
		map.put("����", 90);
		map.put("����", 100);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� " + e.getKey() + "�� ������ " +e.getValue());
		}
		set = map.keySet();
		System.out.println("������ ��� : " + set);
		
		Collection values = map.values(); 
		it = values.iterator();
		
		int total = 0;
		
		while (it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ� ���� : " + Collections.max(values));
		System.out.println("���� ���� : " + Collections.min(values));

	}

}
