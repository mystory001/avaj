package exercise.chapter03;

public class Ex03 {

	public static void main(String[] args) {
		
		//변수 num의 값에 따라 '양수','음수','0'을 출력
		int num = 10;
		System.out.println(((num>0)?"양수":((num<0)?"음수":'0')));

	}

}
