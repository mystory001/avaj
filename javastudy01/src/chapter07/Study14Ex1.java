package chapter07;

class ProductS14E1{
	int price; //��ǰ����
	int saleRatio; //������
}

class TvS14E1 extends ProductS14E1{
	
}

class ComputerS14E1 extends ProductS14E1{
	
}

class AudioS14E1 extends ProductS14E1{
	
}

class BuyerS14E1{ //������
	int money = 1000000; //���� �ݾ�
	int saleRatio = 0;
	
	//�����ε�
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
	//������ : ��ǰ�� �þ���� �����ε��� �������. => ���ŷӰ� �ڵ��� �ߺ� �߻�
	
	//����Ÿ������ ���� ������ ������ �� ����
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
