package chapter07;

class PointS4E1{
	int x;
	int y;
	
	String getLocation() {
		return "x : " + x + ", y = " + y;
	}
}

class Point3DS4E1 extends PointS4E1{
	int z;
	
	//����(getLocation()) �������̵�
	String getLocation() {
		return "x : " + x + ", y = " + y + ", z = " + z;
	} //����� ���� �Ұ�. ����(������)�� ���� ���� 
	
}

public class Study04Ex1 {
	
	public static void main(String[] args) {

		Point3DS4E1 point3ds4e1 = new Point3DS4E1();
		point3ds4e1.x = 3;
		point3ds4e1.y = 4;
		point3ds4e1.z = 5;
		System.out.println(point3ds4e1.getLocation());
		
	}

}
