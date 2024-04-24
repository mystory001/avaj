package chapter07;

class ProductS14Ex2{
	int price; //제품가격
	int bonusPoint; //제품구매시 제공하는 보너스점수
	
	ProductS14Ex2(int price){
		this.price = price;
		bonusPoint = (int)(price/10); //보너스점수는 제품 가격의 10%
	}
}

class TvS14E2 extends ProductS14Ex2{
	TvS14E2(){
		//부모(조상)클래스의 생성자 Product(int price)를 호출
		super(100); // Tv의 가격을 100으로 함
	}
	
	public String toString() { //Object 클래스의 toString()을 오버라이딩
		return "Tv";
	}
}

class ComputerS14E2 extends ProductS14Ex2{
	ComputerS14E2(){
		super(150);
	}
	
	public String toString() {
		return "Computer";
	}
}

class BuyerS14E2{ //고객
	int money = 300; //고객이 가지고 있는 금액
	int bounsPoint = 0; //보너스포인트
	
	void buy(ProductS14Ex2 p) {
		if(money < p.price) {
			System.out.println("현재 보유하신 금액으로는 구매하실 수 없습니다.");
			return;
		} 
		money -= p.price;
		bounsPoint += p.bonusPoint;
		System.out.println(p + "를 구매하였습니다.");
	}
}

public class Study14Ex2 {
	
	public static void main(String[] args) {

		BuyerS14E2 buyer = new BuyerS14E2();

		//1
		TvS14E2 tv = new TvS14E2();
		ComputerS14E2 com = new ComputerS14E2();
		
//		buyer.buy(tv);
//		buyer.buy(com);
		
		//2
		buyer.buy(new TvS14E2()); 
		//== ProductS14E2 p = new TvS14E2; buyer.buy(p);를 합친 것
		//즉, int i = 10; System.out.println(i); == System.out.println(10);
		buyer.buy(new ComputerS14E2());
		
		System.out.println("현재 남은 돈은 " + buyer.money);
		System.out.println("현재 보너스 점수는 " + buyer.bounsPoint);
	}

}
