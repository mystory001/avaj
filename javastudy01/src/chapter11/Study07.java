package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Study07 {

	public static void main(String[] args) {

		//Arrays �迭�� �ٷ�� ���� �޼���(static) ����
		//�迭�� ��� toString()
		//�迭�� ���� copyOf(), copyOfRange()
//		int[] arr = {0,1,2,3,4};
//		int[] arr2 = Arrays.copyOf(arr, arr.length); //arr2 = [0,1,2,3,4]
//		int[] arr3 = Arrays.copyOf(arr, 4); //arr3 = [0,1,2,3]
//		int[] arr4 = Arrays.copyOf(arr, 7); //arr4 = [0,1,2,3,4,0,0]
//		int[] arr5 = Arrays.copyOfRange(arr4, 1, 4); //arr5 = [1,2,3]
//		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); //arr6 = [0,1,2,3,4,0,0]

		//�迭 ä��� fill(), setAll()
//		int[] arr = new int[5];
//		Arrays.fill(arr, 9); //arr=[9,9,9,9,9]
//		Arrays.setAll(arr, (i) -> (int)(Math.random()*5)+1); //���ٽ�, arr=[1,4,5,3,1](������ 1~5������ ������)
		
		//�迭�� ���İ� �˻� sort(), binarySearch() ����Ž��
//		int[] arr = {3,2,1,0,4};
////		int idx = Arrays.binarySearch(arr, 2); //idx = -5 �߸��� ���, ���� Ž���� ���ĵ� �迭���� ����
//		Arrays.sort(arr); //arr�� ����
//		System.out.println(Arrays.toString(arr)); //[0,1,2,3,4]
//		int idx = Arrays.binarySearch(arr, 2); //idx = 2 �ùٸ� ���
		//�ؼ��� �˻�, ���� �˻�
		//���� �˻� => ������� ó������ �ϳ��ϳ� ã�����ϴ� ���� Ž����.
		//���� �˻� => ������ �� �񱳰��� ������ ���� => ������ ����
		//����(�̺�) �˻��� ���� �˻����� �˻��ϴ� ���� �� ����

		//������ �迭�� ��� deepToString()
//		int[] arr = {0,1,2,3,4};
//		int[][] arr2D = {{11,12},{21,22}};
//		System.out.println(Arrays.toString(arr)); //[0,1,2,3,4]
//		System.out.println(Arrays.deepToString(arr2D)); //[[11,12],[21,22]]
		
		//������ �迭�� �� deepEquals()
//		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
//		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
//		System.out.println(Arrays.equals(str2D, str2D2)); //false
//		System.out.println(Arrays.deepEquals(str2D, str2D2)); //true
		
		//�迭�� List�� ��ȯ asList(Object... a) //���� �Ű�����(������ �������� ����)
//		List list = Arrays.asList(new Integer[] {1,2,3,4,5}); //list=[1,2,3,4,5]
//		List list = Arrays.asList(1,2,3,4,5);
//		list.add(6); //List�� �б� ���� UnsupportedOperationException ���� �߻�
//		List list = new ArrayList(Arrays.asList(1,2,3,4,5)); //���ο� ArrayList. ���氡��
		
		
	}

}
