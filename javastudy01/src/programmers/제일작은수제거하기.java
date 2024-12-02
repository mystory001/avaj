package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 제일작은수제거하기 {

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
		
		//모든 테스트에서 실패 => 정렬을 하지 않고 순서대로?
		//최소값을 담을 변수 선언 및 초기화
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
		//배열 정렬하기
		//1. Array.sort() : java.utl.Arrays 클래스를 활용하면 배열을 간단히 정렬할 수 있음
		int[] intArr = new int[] {1,3,2,6,4};
		double[] dobleArr = new double[] {1.1,1.3,2.4,5.1};
		String[] stringArr = new String[] {"A","C","B","Z","K"};
		
		System.out.println(Arrays.toString(intArr)); //[1, 3, 2, 6, 4]
		System.out.println(Arrays.toString(dobleArr)); //[1.1, 1.3, 2.4, 5.1]
		System.out.println(Arrays.toString(stringArr)); //[A, C, B, Z, K]

		Arrays.sort(intArr); 
		Arrays.sort(dobleArr);
		Arrays.sort(stringArr);
		System.out.println("Arrays.sort() 정렬 후");
		System.out.println(Arrays.toString(intArr)); //[1, 2, 3, 4, 6]
		System.out.println(Arrays.toString(dobleArr)); //[1.1, 1.3, 2.4, 5.1]
		System.out.println(Arrays.toString(stringArr)); //[A, B, C, K, Z]
		
		//2. Compparator : primitive 타입이 아닌 Wrapper 클래스일 경우 arr 뒤에 추가로 Comparator를 인자로 전달하여 정렬할 수 있음
		Integer[] integerArr = new Integer[] {1,2,3,7,4};
		Arrays.sort(integerArr,Comparator.naturalOrder()); //오름차순
		Arrays.sort(integerArr,Comparator.reverseOrder()); //내림차순
		*/
		
		/*
		 ArrayList 정렬
		 ex)
		 ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(5,4,2,1,3);
		 System.out.println(arr); //[5,4,2,1,3]
		 
		 오름차순 정렬
		 Collections.sort(arr); //[1,2,3,4,5]
		 
		 내림차순
		 Collections.sort(arr, Collections.reverseOrder()); //[5,4,3,2,1]
		 */
		
		
		
	}

}
