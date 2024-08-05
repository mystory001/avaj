package chapter11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Study09Ex2 {
	
	public static void main(String[] args) {

		Set set = new HashSet();
 		
		for(int i = 0; set.size() < 6; i++) {
			//set�� ũ�Ⱑ 6���� ���� ���� 1 ~ 45 ������ ������ ����
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set); //set�� ��� ��Ҹ� List�� ����
		Collections.sort(list); //list ����
		System.out.println(list);
		
	}

}