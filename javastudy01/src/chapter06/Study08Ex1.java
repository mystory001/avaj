package chapter06;

class Card{
	//���� => iv
	String kind; //����
	int number; //����
	
	//���� => cv
	static int width = 100; //��
	static int height = 250; //����
}

public class Study08Ex1 {

	public static void main(String[] args) {
		
		Card card = new Card();
		//iv
		card.kind = "Clover"; 
		card.number = 7;
		//cv => ��������� cv�� Class.cv�� �����. ���������� ����ϴ� �͵� ������ ������ �������� ����
//		card.width = 200;
//		card.height = 300;
		Card.height = 200;
		Card.width = 300;
		
	}

}
