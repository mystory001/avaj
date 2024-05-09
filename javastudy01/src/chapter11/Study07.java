package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Study07 {

	public static void main(String[] args) {

		//Arrays 배열을 다루기 편리한 메서드(static) 제공
		//배열의 출력 toString()
		//배열의 복사 copyOf(), copyOfRange()
//		int[] arr = {0,1,2,3,4};
//		int[] arr2 = Arrays.copyOf(arr, arr.length); //arr2 = [0,1,2,3,4]
//		int[] arr3 = Arrays.copyOf(arr, 4); //arr3 = [0,1,2,3]
//		int[] arr4 = Arrays.copyOf(arr, 7); //arr4 = [0,1,2,3,4,0,0]
//		int[] arr5 = Arrays.copyOfRange(arr4, 1, 4); //arr5 = [1,2,3]
//		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); //arr6 = [0,1,2,3,4,0,0]

		//배열 채우기 fill(), setAll()
//		int[] arr = new int[5];
//		Arrays.fill(arr, 9); //arr=[9,9,9,9,9]
//		Arrays.setAll(arr, (i) -> (int)(Math.random()*5)+1); //람다식, arr=[1,4,5,3,1](임의의 1~5사이의 정수값)
		
		//배열의 정렬과 검색 sort(), binarySearch() 이진탐색
//		int[] arr = {3,2,1,0,4};
////		int idx = Arrays.binarySearch(arr, 2); //idx = -5 잘못된 결과, 이진 탐색은 정렬된 배열에만 가능
//		Arrays.sort(arr); //arr를 정렬
//		System.out.println(Arrays.toString(arr)); //[0,1,2,3,4]
//		int idx = Arrays.binarySearch(arr, 2); //idx = 2 올바른 결과
		//※순차 검색, 이진 검색
		//순차 검색 => 순서대로 처음부터 하나하나 찾고자하는 값을 탐색함.
		//이진 검색 => 정렬한 후 비교값을 반으로 나눔 => 반으로 나눔
		//이진(이분) 검색이 순차 검색보다 검색하는 것이 더 빠름

		//다차원 배열의 출력 deepToString()
//		int[] arr = {0,1,2,3,4};
//		int[][] arr2D = {{11,12},{21,22}};
//		System.out.println(Arrays.toString(arr)); //[0,1,2,3,4]
//		System.out.println(Arrays.deepToString(arr2D)); //[[11,12],[21,22]]
		
		//다차원 배열의 비교 deepEquals()
//		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
//		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
//		System.out.println(Arrays.equals(str2D, str2D2)); //false
//		System.out.println(Arrays.deepEquals(str2D, str2D2)); //true
		
		//배열을 List로 변환 asList(Object... a) //가변 매개변수(개수가 정해지지 않음)
//		List list = Arrays.asList(new Integer[] {1,2,3,4,5}); //list=[1,2,3,4,5]
//		List list = Arrays.asList(1,2,3,4,5);
//		list.add(6); //List는 읽기 전용 UnsupportedOperationException 예외 발생
//		List list = new ArrayList(Arrays.asList(1,2,3,4,5)); //새로운 ArrayList. 변경가능
		
		
	}

}
