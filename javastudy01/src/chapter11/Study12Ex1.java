package chapter11;

import java.util.ArrayList;
import java.util.Collections; //import static java.util.Collections; 로 작성 시 Collections를 생략 가능하게 해줌
import java.util.Enumeration;
import java.util.List;

public class Study12Ex1 {
	
	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println(list);
		
		Collections.addAll(list,1,2,3,4,5);
		System.out.println(list); //[1,2,3,4,5]
		
		Collections.rotate(list,2); //반시계 방향으로 두번 회전
		System.out.println(list); //[4,5,1,2,3]
		
		Collections.swap(list, 0, 2); //2번째 인수와 3번째 인수 교환
		System.out.println(list); //[1,5,4,2,3]
		
		Collections.shuffle(list); //저장된 요소의 위치를 임의로 변경
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder()); //역순 정렬 reverse(list)와 동일
		System.out.println(list); //[3,2,4,5,1]
		
		Collections.sort(list); //정렬
		System.out.println(list); //[1,2,3,4,5]
		
		int idx = Collections.binarySearch(list, 3); //두번째 인자(저장된위치(index))를 반환. ※binarySearch를 할 때 정렬이 먼저 되어있어야함
		System.out.println(idx); //2
		
		System.out.println("max = " + Collections.max(list));
		System.out.println("min = " + Collections.min(list));
		System.out.println("min(reverseOrder) =" + Collections.min(list,Collections.reverseOrder()));
		
		Collections.fill(list, 0); //list를 0으로 채움
		System.out.println(list);
		
		List newList = Collections.nCopies(list.size(), 2); //list와 같은 크기의 새로운 list를 생성하고 2로 채움. 단 결과는 변경불가
		System.out.println("newList = " + newList);
		
		System.out.println(Collections.disjoint(list, newList)); //공통요소가 없으면 true
		
		Collections.copy(list, newList);
		System.out.println("newList = " + newList);
		System.out.println("list = " + list);
		
		Collections.replaceAll(list, 2, 1); //두번째 인자를 세번째인자로 교체
		System.out.println("list = " + list);
		
		Enumeration e = Collections.enumeration(list); //enumeration==iterator
		ArrayList list2 = Collections.list(e);
		System.out.println("list2 = " + list2);
		
	}

}
