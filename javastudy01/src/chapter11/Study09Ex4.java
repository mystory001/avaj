package chapter11;

import java.util.HashSet;
import java.util.Iterator;

public class Study09Ex4 {

	public static void main(String[] args) {
		
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setC = new HashSet();
		HashSet setD = new HashSet();
		HashSet setE = new HashSet();

		setA.add("1"); setA.add("2"); setA.add("3"); setA.add("4"); setA.add("5");
		System.out.println("A = " + setA); //A = [1, 2, 3, 4, 5]
		setB.add("4"); setB.add("5"); setB.add("6"); setB.add("7"); setB.add("8");
		System.out.println("B = " + setB); //B = [4, 5, 6, 7, 8]
		
		//교집합
//		Iterator iterator = setB.iterator();
//		while (iterator.hasNext()) {
//			Object tmp = iterator.next();
//			if(setA.contains(tmp))
//				setC.add(tmp);
//		}
//		System.out.println("교집합 = " + setC);
		
		//차집합
//		iterator = setA.iterator();
//		while (iterator.hasNext()) {
//			Object tmp = iterator.next();
//			if(!setB.contains(tmp))
//				setD.add(tmp);
//		}
//		System.out.println("차집합 = " + setD);
		
		//합집합
//		iterator = setA.iterator();
//		while (iterator.hasNext()) {
//			setE.add(iterator.next());
//		}
//		iterator = setB.iterator();
//		while (iterator.hasNext()) {
//			setE.add(iterator.next());
//		}
//		System.out.println("합집합 = " + setE);
		
		
//		setA.retainAll(setB); //공통된 요소만 남기고 삭제 => 교집합
//		setA.addAll(setB); //setB의 모든 요소를 추가(중복 제외) => 합집합
//		setA.removeAll(setB); //setB와 공통 요소를 제거 => 차집합
//		System.out.println(setA);
		
	}

}
