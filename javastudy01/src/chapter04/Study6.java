package chapter04;

public class Study6 {

	public static void main(String[] args) {

		//while문
		//조건을 만족시키는 동안 블록 {}을 반복 - 반복횟수를 모를 때 사용
		// while(조건식){
		//	조건식의 연산결과가 true인 동안, 반복될 문장
		//}
		
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		
		int sum = 0;
		int i1 = 0;
		//i를 1씩 증가시켜 sum에 계속 더해나감
		while (sum<=100) {
			System.out.println(i1 + ", " + sum);
			sum += ++i1;
		}
		
		//do-while문
		//블럭 {}을 최소한 한 번 이상 반복 - 사용자 입력받을 때 유용
		//do{
		//		//조건식의 연산결과가 참일 때 수행될 문장(처음 한 번은 무조건 실행)
		//} while(조건식);
		
		
	}
}
