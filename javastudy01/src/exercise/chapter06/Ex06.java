package exercise.chapter06;

public class Ex06 {
	
	//�� ���� �Ÿ��� ����ϴ� getDistance()�� �ϼ�
	//��Ÿ��� ���� (x-x1)^2+(y-y1)^2�� ��Ʈ��
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt(Math.abs(x-x1)*Math.abs(x-x1)+Math.abs(y-y1)*Math.abs(y-y1));
	}
	
	public static void main(String[] args) {
		
		System.out.println(getDistance(1, 1, 2, 2));

	}

}
