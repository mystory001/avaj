package chapter07;

class PointS5E3{
	int x, y;
	
	PointS5E3(int x, int y) {
		//iv �ʱ�ȭ
		this.x = x;
		this.y = y;
	}
}

class Point3DS5E3 extends PointS5E3{
	int z;
	
//	��� �����ڴ� ù �ٿ� �ٸ� �����ڸ� ȣ��. ���� �⺻ ������ �ۼ��� �ʼ�
//	Point3DS5E3(int x, int y, int z){
//		this.x = x; //���� ��� �ʱ�ȭ
//		this.y = y; //���� ��� �ʱ�ȭ
//		this.z = z;
//	}
	
	//�ڼ��� ������
	Point3DS5E3(int x, int y,int z){
		super(x, y); //����Ŭ������ ������ PointS5E3(int x, int y)�� ȣ��
		this.z = z; //�ڽ��� ����� �ʱ�ȭ
	}
}




public class Study05Ex3 {

}
