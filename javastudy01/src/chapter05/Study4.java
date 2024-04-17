package chapter05;

import java.util.Arrays;

public class Study4 {

	public static void main(String[] args) {

		//배열의 활용

		//총합과 평균 : 배열의 모든 요소를 더해 총합과 평균을 구함
		int sum = 0;
		float avg = 0F;
		
		int[] score = {100, 79, 88, 75, 70};
		
		for(int i = 0; i < score.length ; i++) {
			sum += score[i]; //반복문을 이용해서 배열에 저장되어 있는 값들을 모두 더함
		}
		
		avg = (float)sum/score.length; //계산 결과를 float타입으로 얻으려면 형변환(분모, 분자 중 한 곳만 형변환 해주면됨)
		System.out.println("총합 = " + sum);
		System.out.println("평균 = " + avg);
		
		System.out.println();
		
		//최솟값과 최댓값
		int[] score1 = {58,30,45,66,79,80,91,44};
		int max = score1[0]; //배열의 첫번째 값으로 최댓값을 초기화
		int min = score1[0]; //배열의 첫번째 값으로 최솟값을 초기화

		for(int i = 1; i < score1.length;i++) { //배열의 두 번째 요소부터 읽기 위해서 변수 i의 값을 1로 초기화
			if(score1[i]>max) {
				max = score1[i];
			} else if(score1[i]<min) {
				min = score1[i];
			}
		}
		System.out.println("최댓값 " + max);
		System.out.println("최솟값 " + min);
		
		System.out.println();
		
		//섞기 : 배열의 요소의 순서를 반복해서 바꿈(숫자 섞기)
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		System.out.println();
		for(int i = 0; i < numArr.length; i++) {
			int n = (int)(Math.random() * 10); //0~9 중 한 값을 임의로 얻음
			int temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp;
			System.out.print(numArr[i] + ", ");
		}
		System.out.println();
		System.out.println(Arrays.toString(numArr));
		
	}
}
