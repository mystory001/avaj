package chapter05;

import java.util.Arrays;

public class Study9 {
	
	public static void main(String[] args) {

		//Arrays클래스
		//배열의 비교와 출력 equals(), toString()
		
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = { {11,12}, {21,22}};
		
		//1차원 배열일 때는 toString(), 다차원 배열일때는 deepToString()
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2D));
		System.out.println(Arrays.deepToString(arr2D));
		
		System.out.println();
		
		String[][] str2D1 = {{"aaa","aaa"},{"AAA", "AAA"}};
		String[][] str2D2 = {{"aaa","aaa"},{"AAA", "AAA"}};
		
		//1차원 배열일 때는 equals(), 다차원 배열일 때는 deepEquals()
		//System.out.println(str2D1 == str2D2); //사용하지 않음
		System.out.println(Arrays.equals(str2D1, str2D2));
		System.out.println(Arrays.deepEquals(str2D1, str2D2));
		
		//배열의 복사 copyOf(), copyOfRange()
		
		System.out.println();
		
		//배열의 정렬 sort()
		int[] arr1 = {3,4,2,1,0,-1};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		
		
	}

}
