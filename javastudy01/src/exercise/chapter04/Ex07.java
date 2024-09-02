package exercise.chapter04;

public class Ex07 {

	public static void main(String[] args) {
		
		//Math.random()을 이용해서 1부터 6사이의 임의의 정수를
		//변수 value에 저장하는 코드를 완성
		int value = (int)(Math.random()*6)+1;
		//6을 곱한 후 int형으로 변환 => 0부터 5사이의 정수
		//+1을 더하면 1부터 6사이의 정수가 나옴
		System.out.println("value = " + value);

	}

}
