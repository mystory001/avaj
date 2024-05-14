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
		map.put("태조", 60);
		map.put("태조", 70);
		map.put("정종", 40);
		map.put("태종", 90);
		map.put("세종", 100);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 " + e.getKey() + "의 점수는 " +e.getValue());
		}
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values(); 
		it = values.iterator();
		
		int total = 0;
		
		while (it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고 점수 : " + Collections.max(values));
		System.out.println("최저 점수 : " + Collections.min(values));

	}

}
