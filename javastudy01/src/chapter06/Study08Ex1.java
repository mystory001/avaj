package chapter06;

class Card{
	//개별 => iv
	String kind; //무늬
	int number; //숫자
	
	//공통 => cv
	static int width = 100; //폭
	static int height = 250; //높이
}

public class Study08Ex1 {

	public static void main(String[] args) {
		
		Card card = new Card();
		//iv
		card.kind = "Clover"; 
		card.number = 7;
		//cv => 통상적으로 cv는 Class.cv로 써야함. 참조변수를 사용하는 것도 가능은 하지만 권장하지 않음
//		card.width = 200;
//		card.height = 300;
		Card.height = 200;
		Card.width = 300;
		
	}

}
