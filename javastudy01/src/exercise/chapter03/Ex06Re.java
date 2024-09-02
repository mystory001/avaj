package exercise.chapter03;

public class Ex06Re {

	public static void main(String[] args) {
		
		//num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지
		int num = 24;
		//num의 값보다 크면서도 가장 가까운 10의 배수 만들기(이게 핵심)
		//(num%10+1)*10
		System.out.println((num/10+1)*10-num);

	}

}
