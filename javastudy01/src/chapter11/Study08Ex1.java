package chapter11;

import java.util.Arrays;
import java.util.Comparator;

class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1; //-1�� ���ؼ� �⺻ ���Ĺ���� ������ ���� �Ǵ� c2.compareTo(c1)���� �ۼ�
		}
		return -1;
	}
}


public class Study08Ex1 {

	public static void main(String[] args) {
		
		String[] strArr = {"cat", "Dog", "brid", "tiger", "panda"};
		
		Arrays.sort(strArr); //String�� Comparable������ ���� ����
		//������ ���ؼ��� 1) ��� 2) ������ �ʿ���
		//static void sort(Object[] a) //��ü �迭�� ����� ��ü�� ������ Comparable�� ���� ����
		//static void sort(Object[] a, Comparator c) //������ Comparator�� ���� ����
		System.out.println("strArr = " + Arrays.toString(strArr)); //strArr = [Dog, brid, cat, panda, tiger] �빮�ڰ� ����

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //��ҹ��� ���� ����
		System.out.println("strArr = " + Arrays.toString(strArr)); //strArr = [brid, cat, Dog, panda, tiger]
		
		Arrays.sort(strArr,new Descending()); //���� ����
		System.out.println("strArr = " + Arrays.toString(strArr)); //strArr = [tiger, panda, cat, brid, Dog]
		
		
	}

}