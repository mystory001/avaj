package chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Study09Ex1 {
	
	public static void main(String[] args) {

		Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","5","5"};
		Set set = new HashSet();		
		
		for(int i = 0; i<objArr.length;i++) {
//			set.add(objArr[i]); //HashSet�� objArr ��Ҹ� ����
			System.out.println(objArr[i]+" = " + set.add(objArr[i]));
		}
		
		System.out.println(set); //HashSet�� ����� ��� ���. ������ �������� ����. [1, 1, 2, 3, 4, 5] 
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) { //hasNext() �о� �� ��Ұ� �ִ��� Ȯ��
			System.out.println(iterator.next()); //next() ��� �ϳ� ��������
		}
		
	}

}
