package exercise.chapter04;

public class Ex11 {

	public static void main(String[] args) {
		
		//피보나치 수열(앞 두 수를 더해 다음 수를 만들어 나아가는 수열)
		//1과 1부터 시작하는 피보나치 수열의 10번째 수는 무엇인지 계산하는 프로그램
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; //세번째 값
		System.out.print(num1+", "+num2);
		
		num3 = num1 + num2; //2
		num1 = num3;
		num3 = num1+ num2;//3
		num2 = num3;
		num3 = num1+num2;//5
		
		for(int i = 0; i < 8; i++) {
			num3 = num1+num2;
			System.out.print(", " + num3);
			num1 = num2;
			num2 = num3;
		}

	}

}
