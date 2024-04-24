package chapter07;

abstract class TransS17E1{
	
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}

class CarS17E1 extends TransS17E1{
	void move(int x, int y) {
		System.out.println("Car [x = " + x + ", y = " + y + "]");
	}
	void accelerate() {
		System.out.println("�������� �̵�");
	}
}

class AirplaneS17E1 extends TransS17E1{
	void move(int x, int y) {
		System.out.println("Car [x = " + x + ", y = " + y + "]");
	}
	void fly() {
		System.out.println("�ϴ÷� �̵�");
	}
}

class BicycleS17E1 extends TransS17E1{
	void move(int x, int y) {
		System.out.println("Car [x = " + x + ", y = " + y + "]");
	}
	void pedal() {
		System.out.println("����� ��� �̵�");
	}
}

public class Study17Ex1 {
	
	public static void main(String[] args) {

		TransS17E1[] group = {new CarS17E1(), new AirplaneS17E1(), new BicycleS17E1()}; //�迭�� ������ �ʱ�ȭ�� �� ���� �� ����
		/* ==
		 * TransS17E1[] group = new TransS17E1[3]; //��ü �迭 : ���� ���� ����
		 * group[0] = new CarS17E1();
		 * group[1] = new AirplaneS17E1();
		 * group[2] = new BicycleS17E1();
		*/
		
		//group Ÿ���� TransS17E1[]�̰�,
		//group[0], group[1], group[2]�� Ÿ���� TransS17E1
		for(int i = 0; i<group.length; i++) {
			group[i].move(10, 20);
		}
		/* ==
		 * group[0].move(10,20); //CarS17E1 ��ü�� move(10,20)�� ȣ��
		 * group[1].move(10,20); //AirplaneS17E1 ��ü�� move(10,20)�� ȣ��
		 * group[2].move(10,20); //BicycleS17E1 ��ü�� move(10,20)�� ȣ��
		 */
		
	}

}
