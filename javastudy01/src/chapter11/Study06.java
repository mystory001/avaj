package chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Study06 {
	
	public static void main(String[] args) {

		//Iterator, Enumeration, Map
		//�÷��ǿ� ����� �����͸� �����ϴµ� ���Ǵ� �������̽�(�о����)
		//Enumeration�� Iterator�� ������(�� Iterator)
		//ListIterator�� Iterator�� ���ټ��� ����Ų ��(�ܹ��⿡�� ���������)
		//Iterator �������̽��� �޼���
		//boolean hasNext() : �о�� ��Ұ� �����ִ��� Ȯ��. ������ true, ������ false ��ȯ
		//Object next() : ���� ��Ҹ� �о��. next()�� ȣ���ϱ� ���� hasNext()�� ȣ���ؼ� �о� �� ��Ұ� �ִ��� Ȯ���ϴ� ���� ����
		//void remove() : next()�� �о�� ��Ҹ� ����. next()�� ȣ���� ������ remove()�� ȣ���ؾ���(������ ���)
		//void forEachRemaining(Consumer<? super E> action) : �÷��ǿ� �����ִ� ��ҵ鿡 ���� ������ �۾�(action)�� ����. ���ٽ��� ����ϴ� ����Ʈ �޼���
		//Enumeration �������̽� �޼���
		//boolean hasMoreElements() : �о� �� ��Ұ� �����ִ��� Ȯ��. ������ true, ������ false ��ȯ.Iterator�� hasNext()�� ����
		//Object nextElement() : ���� ��Ҹ� �о��. nextElement()�� ȣ���ϱ� �� hasMoreElements()�� ȣ���ؼ� �о�� ��Ұ� �����ִ��� Ȯ���ϴ� ���� ���� Iterator�� next()�� ����

		//�÷���(List, Set, Map)�� ����� ��ҵ��� �о���� ����� ǥ��ȭ�� ��. Iterator�� hasNext()�� Ȯ�� �� Object next()�� �б�
		//�÷��ǿ� iterator()�� ȣ���ؼ� Iterator�� ������ ��ü�� �� ���
		List list = new ArrayList(); //�ٸ� �÷������� ������ �� �� �κи� ��ġ�� ��
		Iterator it = list.iterator();
		while (it.hasNext()) { //�о� �� ��Ұ� �ִ��� Ȯ��
			System.out.println(it.next()); //���� ��Ҹ� �о��
		}
		
//		Set set = new Set();
//		Iterator iter = set.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		//Map�� Iterator
		//Map���� iterator()�� ����. keySet(), entrySet(), values()�� ȣ���ؾ���
		//Map map = new HashMap();
		//(...����...)
		//Iterator iterator = map.entrySet().iterator(); == Set eSet = map.entrySet(); Iterator it = eSet.iterator();
		
		
		

		
	}

}
