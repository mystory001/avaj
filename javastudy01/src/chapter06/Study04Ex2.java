package chapter06;

public class Study04Ex2 {

	public static void main(String[] args) {
		Tv tv1 = new Tv(); //Tv �ν��Ͻ��� �����ϱ� ���� ���� t�� Tv�ν��Ͻ��� ����
		Tv tv2 = new Tv();
		System.out.println("tv1�� channel ���� " + tv1.channel); //0
		System.out.println("tv2�� channel ���� " + tv2.channel); //0
		
		tv1.channel = 7; //tv1�� channel ���� 7�� ����
		
		System.out.println("tv1�� channel ���� " + tv1.channel); //7
		System.out.println("tv2�� channel ���� " + tv2.channel); //0

		tv2 = tv1;
		System.out.println("tv1�� channel ���� " + tv1.channel); //7
		System.out.println("tv2�� channel ���� " + tv2.channel); //0
	}

}
