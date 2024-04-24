package chapter07;

class ProductS15E1{
	int price; //��ǰ ����
	int bonusPoint; //��ǰ ���� �� ���ʽ�����Ʈ
	
	ProductS15E1(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
	
	ProductS15E1() {} //�⺻ ������

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

class BuyerS15E1{ //��
	int money = 500; //���� ������ �ݾ�
	int bonusPoint = 0; //���� ���ʽ�����Ʈ
	ProductS15E1[] cart = new ProductS15E1[10]; //������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0;
	
	void buy(ProductS15E1 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
		}
		
		money -= p.price; //���� ������ ������ ��ǰ�� ������ ��
		bonusPoint += p.bonusPoint; //��ǰ�� ���ʽ� ����Ʈ�� �߰�
		cart[i++] = p; //��ǰ�� Product[] cart�� ����
		System.out.println(p+" ��ǰ�� �����Ͽ����ϴ�.");
	}
	
	void summary() { //������ ��ǰ�� ���� ������ ���
		int sum = 0;  //������ ��ǰ�� �հ�
		String itemList = ""; //������ ��ǰ���
		
		//�ݺ����� �̿��� ������ ��ǰ�� �� ���ݰ� ����� ����
		for(int i = 0; i<cart.length;i++) {
			if(cart[i]==null) {
				break;
			} else {
				sum += cart[i].price;
				itemList += cart[i] + " ";
			}
			
			System.out.println("�����Ͻ� ��ǰ�� �Ѿ��� " + sum + "�Դϴ�.");
			System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
			System.out.println("���Բ��� �����Ͻ� ���� \"" + Math.abs(money - sum)+"\" �Դϴ�." );
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
