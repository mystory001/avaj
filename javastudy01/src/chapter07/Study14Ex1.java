package chapter07;

class ProductS14E1{
	int price; //제품가격
	int saleRatio; //할인율
}

class TvS14E1 extends ProductS14E1{
	
}

class ComputerS14E1 extends ProductS14E1{
	
}

class AudioS14E1 extends ProductS14E1{
	
}

class BuyerS14E1{ //구매자
	int money = 1000000; //소유 금액
	int saleRatio = 0;
	
	//오버로딩
//	void buy(TvS14E1 t) {
//		money -= t.price;
//		saleRatio += t.saleRatio;
//	}
//	
//	void buy(ComputerS14E1 c) {
//		money -= c.price;
//		saleRatio += c.saleRatio;
//	}
//
//	void buy(AudioS14E1 a) {
//		money -= a.price;
//		saleRatio += a.saleRatio;
//	}
	//문제점 : 제품이 늘어날수록 오버로딩을 해줘야함. => 번거롭고 코드의 중복 발생
	
	//조상타입으로 여러 물건을 구매할 수 있음
	void buy(ProductS14E1 p){
		money -= p.price;
		saleRatio = p.saleRatio;
	}
	
}

public class Study14Ex1 {

	public static void main(String[] args) {

		BuyerS14E1 buyer = new BuyerS14E1();
		
		TvS14E1 tv = new TvS14E1();
		ComputerS14E1 com = new ComputerS14E1();
		AudioS14E1 audio = new AudioS14E1();
		
		buyer.buy(tv);
		buyer.buy(com);
		buyer.buy(audio);
		
	}
	
}
