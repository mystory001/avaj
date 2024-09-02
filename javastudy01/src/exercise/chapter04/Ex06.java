package exercise.chapter04;

public class Ex06 {

	public static void main(String[] args) {
		
		//두 개의 주사위를 던졌을 때, 눈의 합이 6이되는 모든 경우의 수를 출력
		//주사위 A, 주사위 B
		//1-5,2-4,3-3,4-2,5-1 5가지의 경우의 수가 있음
		for(int i = 1; i<=6;i++) {
			for(int j = 1; j<=6;j++) {
				if(i+j==6) {
					System.out.println("i = " + i + " j = "+ j +" 합이 6이 되는 경우 " + i +", " +j);
				}
			}
		}
		
		
	}

}
