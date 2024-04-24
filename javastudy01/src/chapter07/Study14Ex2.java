package chapter07;

class ProductS14Ex2{
	int price; //��ǰ����
	int bonusPoint; //��ǰ���Ž� �����ϴ� ���ʽ�����
	
	ProductS14Ex2(int price){
		this.price = price;
		bonusPoint = (int)(price/10); //���ʽ������� ��ǰ ������ 10%
	}
}

class TvS14E2 extends ProductS14Ex2{
	TvS14E2(){
		//�θ�(����)Ŭ������ ������ Product(int price)�� ȣ��
		super(100); // Tv�� ������ 100���� ��
	}
	
	public String toString() { //Object Ŭ������ toString()�� �������̵�
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

class BuyerS14E2{ //��
	int money = 300; //���� ������ �ִ� �ݾ�
	int bounsPoint = 0; //���ʽ�����Ʈ
	
	void buy(ProductS14Ex2 p) {
		if(money < p.price) {
			System.out.println("���� �����Ͻ� �ݾ����δ� �����Ͻ� �� �����ϴ�.");
			return;
		} 
		money -= p.price;
		bounsPoint += p.bonusPoint;
		System.out.println(p + "�� �����Ͽ����ϴ�.");
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
		//== ProductS14E2 p = new TvS14E2; buyer.buy(p);�� ��ģ ��
		//��, int i = 10; System.out.println(i); == System.out.println(10);
		buyer.buy(new ComputerS14E2());
		
		System.out.println("���� ���� ���� " + buyer.money);
		System.out.println("���� ���ʽ� ������ " + buyer.bounsPoint);
	}

}
