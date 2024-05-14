package chapter11;

import java.util.ArrayList;
import java.util.Collections; //import static java.util.Collections; �� �ۼ� �� Collections�� ���� �����ϰ� ����
import java.util.Enumeration;
import java.util.List;

public class Study12Ex1 {
	
	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println(list);
		
		Collections.addAll(list,1,2,3,4,5);
		System.out.println(list); //[1,2,3,4,5]
		
		Collections.rotate(list,2); //�ݽð� �������� �ι� ȸ��
		System.out.println(list); //[4,5,1,2,3]
		
		Collections.swap(list, 0, 2); //2��° �μ��� 3��° �μ� ��ȯ
		System.out.println(list); //[1,5,4,2,3]
		
		Collections.shuffle(list); //����� ����� ��ġ�� ���Ƿ� ����
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder()); //���� ���� reverse(list)�� ����
		System.out.println(list); //[3,2,4,5,1]
		
		Collections.sort(list); //����
		System.out.println(list); //[1,2,3,4,5]
		
		int idx = Collections.binarySearch(list, 3); //�ι�° ����(�������ġ(index))�� ��ȯ. ��binarySearch�� �� �� ������ ���� �Ǿ��־����
		System.out.println(idx); //2
		
		System.out.println("max = " + Collections.max(list));
		System.out.println("min = " + Collections.min(list));
		System.out.println("min(reverseOrder) =" + Collections.min(list,Collections.reverseOrder()));
		
		Collections.fill(list, 0); //list�� 0���� ä��
		System.out.println(list);
		
		List newList = Collections.nCopies(list.size(), 2); //list�� ���� ũ���� ���ο� list�� �����ϰ� 2�� ä��. �� ����� ����Ұ�
		System.out.println("newList = " + newList);
		
		System.out.println(Collections.disjoint(list, newList)); //�����Ұ� ������ true
		
		Collections.copy(list, newList);
		System.out.println("newList = " + newList);
		System.out.println("list = " + list);
		
		Collections.replaceAll(list, 2, 1); //�ι�° ���ڸ� ����°���ڷ� ��ü
		System.out.println("list = " + list);
		
		Enumeration e = Collections.enumeration(list); //enumeration==iterator
		ArrayList list2 = Collections.list(e);
		System.out.println("list2 = " + list2);
		
	}

}
