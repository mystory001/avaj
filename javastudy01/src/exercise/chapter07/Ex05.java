package exercise.chapter07;

class P{
	int price;
	int bonusPoint;
	
	//수정
	P(){}
	
	P(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class C extends P{
	C(){} //Implicit super constructor P() is undefined. Must explicitly invoke another constructor
	//조상의 기본생성자가 정의되이 않았으므로 에러
	
	public String toString() {
		return "C";
	}
}


public class Ex05 {

	public static void main(String[] args) {
		
		C c = new C();

	}

}
