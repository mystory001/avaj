package chapter07;

class ProductS15E1{
	int price; //제품 가격
	int bonusPoint; //제품 구매 시 보너스포인트
	
	ProductS15E1(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
	
	ProductS15E1() {} //기본 생성자

}

class TvS15E1 extends ProductS15E1{
	TvS15E1() {
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class ComputerS15E1 extends ProductS15E1{
	ComputerS15E1(){
		super(150);
	}
	
	public String toString() {
		return "Computer";
	}
}

class AudioS15E1 extends ProductS15E1{
	AudioS15E1(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class BuyerS15E1{ //고객
	int money = 500; //고객이 소유한 금액
	int bonusPoint = 0; //고객의 보너스포인트
	ProductS15E1[] cart = new ProductS15E1[10]; //구입한 제품을 저장하기 위한 배열
	int i = 0;
	
	void buy(ProductS15E1 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 구매할 수 없습니다.");
		}
		
		money -= p.price; //가진 돈에서 구입한 제품의 가격을 뺌
		bonusPoint += p.bonusPoint; //제품의 보너스 포인트를 추가
		cart[i++] = p; //제품을 Product[] cart에 저장
		System.out.println(p+" 제품을 구매하였습니다.");
	}
	
	void summary() { //구매한 물품에 대한 정보를 요약
		int sum = 0;  //구입한 물품의 합계
		String itemList = ""; //구입한 물품목록
		
		//반복문을 이용해 구입한 물품의 총 가격과 목록을 만듦
		for(int i = 0; i<cart.length;i++) {
			if(cart[i]==null) {
				break;
			} else {
				sum += cart[i].price;
				itemList += cart[i] + " ";
			}
			
			System.out.println("구입하신 물품의 총액은 " + sum + "입니다.");
			System.out.println("구입하신 제품은 " + itemList + "입니다.");
			System.out.println("고객님께서 소지하신 돈은 \"" + Math.abs(money - sum)+"\" 입니다." );
		}
		
	}
}

public class Study15Ex1 {
	
	public static void main(String[] args) {

		BuyerS15E1 b = new BuyerS15E1();
		b.buy(new TvS15E1());
		b.buy(new ComputerS15E1());
		b.buy(new AudioS15E1());
		b.summary();
		
		
	}

}
