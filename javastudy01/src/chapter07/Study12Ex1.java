package chapter07;

class CarS12E1{
	String color;
	int door;
	
	void drive() {
		System.out.println("�����ϴ� ���");
	}
	
	void stop() {
		System.out.println("�����ϴ� ���");
	}
}

//		�ڽ�					�θ�
class FireTruckS12E1 extends CarS12E1{
	void water() {
		System.out.println("���� �Ѹ��� ���");
	}
}

class AmbulanceS12E1 extends CarS12E1{
	void siren() {
		System.out.println("���̷� �︮�� ���");
	}
}

public class Study12Ex1 {
	
	public static void main(String[] args) {

		FireTruckS12E1 fireTruck = new FireTruckS12E1();
		CarS12E1 car = (CarS12E1)fireTruck; //����(�θ�) Ÿ������ ����ȯ(���� ����)
		FireTruckS12E1 fireTruck2 = (FireTruckS12E1)car; //�ڼ�(�ڽ�) Ÿ������ ����ȯ(���� �Ұ�)
//		AmbulanceS12E1 ambulance = (AmbulanceS12E1)fireTruck; //��Ӱ��谡 �ƴ� Ŭ���� ���� ����ȯ �Ұ�
		
	}

}
