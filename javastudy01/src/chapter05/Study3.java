package chapter05;

import java.util.Arrays;

public class Study3 {
	
	public static void main(String[] args) {
		
		//배열의 출력
		int[] iArr = {100,90,80,70,60,50};
		System.out.println(iArr);//배열을 가리키는 참조 변수 iArr값을 출력. 주소가 출력
		//단, char 배열의 경우는 주소가 나타나지 않음
		char[] chArr = {'a','b','c','d'};
		System.out.println(chArr);
		
		System.out.println();
		
		//배열 요소를 순서대로 하나씩 출력
		for(int i = 0; i<iArr.length;i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println();
		
		//배열 iArr의 모든 요소를 출력
		System.out.println(Arrays.toString(iArr));

		System.out.println();
		
		//향상된 for문
		for(int a : iArr) {
			System.out.println(a);
		}
		
	}
}
