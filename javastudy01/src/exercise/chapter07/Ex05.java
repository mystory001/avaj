package exercise.chapter07;

class P{
	int price;
	int bonusPoint;
	
	//����
	P(){}
	
	P(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class C extends P{
	C(){} //Implicit super constructor P() is undefined. Must explicitly invoke another constructor
	//������ �⺻�����ڰ� ���ǵ��� �ʾ����Ƿ� ����
	
	public String toString() {
		return "C";
	}
}


public class Ex05 {

	public static void main(String[] args) {
		
		C c = new C();

	}

}
