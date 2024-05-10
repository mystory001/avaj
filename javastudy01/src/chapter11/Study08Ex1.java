package chapter11;

import java.util.Arrays;
import java.util.Comparator;

class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1; //-1을 곱해서 기본 정렬방식의 역으로 변경 또는 c2.compareTo(c1)으로 작성
		}
		return -1;
	}
}


public class Study08Ex1 {

	public static void main(String[] args) {
		
		String[] strArr = {"cat", "Dog", "brid", "tiger", "panda"};
		
		Arrays.sort(strArr); //String의 Comparable구현에 의한 정렬
		//정렬을 위해서는 1) 대상 2) 기준이 필요함
		//static void sort(Object[] a) //객체 배열에 저장된 객체가 구현한 Comparable에 의한 정렬
		//static void sort(Object[] a, Comparator c) //지정한 Comparator에 의한 정렬
		System.out.println("strArr = " + Arrays.toString(strArr)); //strArr = [Dog, brid, cat, panda, tiger] 대문자가 먼저

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //대소문자 구분 안함
		System.out.println("strArr = " + Arrays.toString(strArr)); //strArr = [brid, cat, Dog, panda, tiger]
		
		Arrays.sort(strArr,new Descending()); //역순 정렬
		System.out.println("strArr = " + Arrays.toString(strArr)); //strArr = [tiger, panda, cat, brid, Dog]
		
		
	}

}