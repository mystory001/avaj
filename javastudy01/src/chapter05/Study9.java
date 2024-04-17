package chapter05;

import java.util.Arrays;

public class Study9 {
	
	public static void main(String[] args) {

		//ArraysŬ����
		//�迭�� �񱳿� ��� equals(), toString()
		
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = { {11,12}, {21,22}};
		
		//1���� �迭�� ���� toString(), ������ �迭�϶��� deepToString()
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2D));
		System.out.println(Arrays.deepToString(arr2D));
		
		System.out.println();
		
		String[][] str2D1 = {{"aaa","aaa"},{"AAA", "AAA"}};
		String[][] str2D2 = {{"aaa","aaa"},{"AAA", "AAA"}};
		
		//1���� �迭�� ���� equals(), ������ �迭�� ���� deepEquals()
		//System.out.println(str2D1 == str2D2); //������� ����
		System.out.println(Arrays.equals(str2D1, str2D2));
		System.out.println(Arrays.deepEquals(str2D1, str2D2));
		
		//�迭�� ���� copyOf(), copyOfRange()
		
		System.out.println();
		
		//�迭�� ���� sort()
		int[] arr1 = {3,4,2,1,0,-1};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		
		
	}

}
