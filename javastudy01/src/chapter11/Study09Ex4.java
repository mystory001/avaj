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
		
		//������
//		Iterator iterator = setB.iterator();
//		while (iterator.hasNext()) {
//			Object tmp = iterator.next();
//			if(setA.contains(tmp))
//				setC.add(tmp);
//		}
//		System.out.println("������ = " + setC);
		
		//������
//		iterator = setA.iterator();
//		while (iterator.hasNext()) {
//			Object tmp = iterator.next();
//			if(!setB.contains(tmp))
//				setD.add(tmp);
//		}
//		System.out.println("������ = " + setD);
		
		//������
//		iterator = setA.iterator();
//		while (iterator.hasNext()) {
//			setE.add(iterator.next());
//		}
//		iterator = setB.iterator();
//		while (iterator.hasNext()) {
//			setE.add(iterator.next());
//		}
//		System.out.println("������ = " + setE);
		
		
//		setA.retainAll(setB); //����� ��Ҹ� ����� ���� => ������
//		setA.addAll(setB); //setB�� ��� ��Ҹ� �߰�(�ߺ� ����) => ������
//		setA.removeAll(setB); //setB�� ���� ��Ҹ� ���� => ������
//		System.out.println(setA);
		
	}

}
