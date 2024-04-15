package chapter05;

public class Study2Ex1 {

	public static void main(String[] args) {

		//index 범위 : 0 ~ 9
		int[] arr = new int[10]; //길이가 10인 int 배열
		int tem = arr.length; //arr.length의 값은 10, tmp에 10이 저장
		System.out.println("arr.length = " + tem);
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println("arr["+ i + "] = " + arr[i]);
		}
		
		System.out.println();
		
		//배열의 초기화
		int[] score = new int[5]; //길이가 5인 int형 배열을 생성
//		score[0] = 50; //각 요소에 직접 값을 저장
//		score[1] = 60;
//		score[2] = 70;
//		score[3] = 80;
//		score[4] = 90;
		
		for(int i = 0; i < score.length; i++) {
			score[i] = i * 10 + 50;
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
	}
	
}
