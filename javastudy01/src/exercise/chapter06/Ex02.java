package exercise.chapter06;

//Ex1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가

class SutdaCard2{
	int num;
	boolean isKwang;
	
	public SutdaCard2() {
//		num = 1;
//		isKwang = true;
		this(1,true);
	}
	
	public SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() { //숫자를 문자열로 반환함. 광인 경우 K를 붙임
		return num + (isKwang?"K":"");
	}
	
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		SutdaCard2 s1 = new SutdaCard2(3, false);
		SutdaCard2 s2 = new SutdaCard2();
		
		System.out.println(s1.info());
		System.out.println(s2.info());

	}

}
