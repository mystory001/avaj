package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ���������������ϱ� {

	public static void main(String[] args) {
		
		int[] arr = {5,3,7,1};
		int size = 0;
		if(arr.length!=1) {
			size = arr.length-1;
		} else {
			size = 1; 
		}
		
		int[] answer = new int[size];
		
//		ArrayList<Integer> intArr = new ArrayList<Integer>();
//		for(int a : arr) {
//			intArr.add(a);
//		}
//		Collections.sort(intArr, Collections.reverseOrder());
//		
////		System.out.println(intArr); //[4, 3, 2, 1]
//		
//		for(int i = 0; i < answer.length; i++) {
//			if(size == 1) {
//				answer[i] = -1;
//			} else {
//				answer[i] = intArr.get(i);
//			}
//		}
//		System.out.println(Arrays.toString(answer));
		
		//��� �׽�Ʈ���� ���� => ������ ���� �ʰ� �������?
		//�ּҰ��� ���� ���� ���� �� �ʱ�ȭ
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		int idx = 0;
		for(int i = 0; i < arr.length; i++) {
			if(min==arr[i]) {
				continue;
			} else {
				answer[idx] = arr[i];
				idx++;
			}
		}
		System.out.println(Arrays.toString(answer));
		
		/*
		//�迭 �����ϱ�
		//1. Array.sort() : java.utl.Arrays Ŭ������ Ȱ���ϸ� �迭�� ������ ������ �� ����
		int[] intArr = new int[] {1,3,2,6,4};
		double[] dobleArr = new double[] {1.1,1.3,2.4,5.1};
		String[] stringArr = new String[] {"A","C","B","Z","K"};
		
		System.out.println(Arrays.toString(intArr)); //[1, 3, 2, 6, 4]
		System.out.println(Arrays.toString(dobleArr)); //[1.1, 1.3, 2.4, 5.1]
		System.out.println(Arrays.toString(stringArr)); //[A, C, B, Z, K]

		Arrays.sort(intArr); 
		Arrays.sort(dobleArr);
		Arrays.sort(stringArr);
		System.out.println("Arrays.sort() ���� ��");
		System.out.println(Arrays.toString(intArr)); //[1, 2, 3, 4, 6]
		System.out.println(Arrays.toString(dobleArr)); //[1.1, 1.3, 2.4, 5.1]
		System.out.println(Arrays.toString(stringArr)); //[A, B, C, K, Z]
		
		//2. Compparator : primitive Ÿ���� �ƴ� Wrapper Ŭ������ ��� arr �ڿ� �߰��� Comparator�� ���ڷ� �����Ͽ� ������ �� ����
		Integer[] integerArr = new Integer[] {1,2,3,7,4};
		Arrays.sort(integerArr,Comparator.naturalOrder()); //��������
		Arrays.sort(integerArr,Comparator.reverseOrder()); //��������
		*/
		
		/*
		 ArrayList ����
		 ex)
		 ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(5,4,2,1,3);
		 System.out.println(arr); //[5,4,2,1,3]
		 
		 �������� ����
		 Collections.sort(arr); //[1,2,3,4,5]
		 
		 ��������
		 Collections.sort(arr, Collections.reverseOrder()); //[5,4,3,2,1]
		 */
		
		
		
	}

}
