package chapter11;

import java.util.Arrays;

public class Study07Ex1 {
	
	public static void main(String[] args) {

		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println("arr = " + Arrays.toString(arr)); //arr = [0,1,2,3,4]
		System.out.println("arr2D = " + Arrays.deepToString(arr2D)); //arr2D = [[11,12,13],[21,22,23]]
		
		int[] arr2 = Arrays.copyOf(arr, arr.length); 
		int[] arr3 = Arrays.copyOf(arr, 4); 
		int[] arr4 = Arrays.copyOf(arr, 7); 
		int[] arr5 = Arrays.copyOfRange(arr4, 1, 4);
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); 
		
		System.out.println("arr2 = " + Arrays.toString(arr2)); //arr2 = [0,1,2,3,4]
		System.out.println("arr3 = " + Arrays.toString(arr3)); //arr3 = [0,1,2,3]
		System.out.println("arr4 = " + Arrays.toString(arr4)); //arr4 = [0,1,2,3,4,0,0]
		System.out.println("arr5 = " + Arrays.toString(arr5)); //arr5 = [1,2,3]
		System.out.println("arr6 = " + Arrays.toString(arr6)); //arr6 = [0,1,2,3,4,0,0]
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); 
		System.out.println("fill(arr7) = " + Arrays.toString(arr7)); //arr=[9,9,9,9,9]
		Arrays.setAll(arr7, (i) -> (int)(Math.random()*5)+1); 
		System.out.println("setAll(arr7)" + Arrays.toString(arr7)); //arr=[임의의 1~5사이의 정수값 5개]
		
		for(int i : arr7) { //향상된 for문
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i);
		}
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		System.out.println(Arrays.equals(str2D, str2D2)); //false
		System.out.println(Arrays.deepEquals(str2D, str2D2)); //true
		
		char[] chArr = {'A','D','C','B','E'};
		System.out.println("chArr = " + Arrays.toString(chArr)); //chArr=[A,D,C,B,E]
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B')); //-2
		Arrays.sort(chArr);
		System.out.println("chArr = " + Arrays.toString(chArr)); //chArr=[A,B,C,D,E]
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B')); //1
		
	}

}
