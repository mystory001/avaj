package chapter06;
//������ ��ȯŸ��


class Data3{
	int x;
}

public class Study14Ex2 {
	
	static Data3 copy(Data3 d) { 
		Data3 temp = new Data3(); //���ο� ��ü temp�� ����
		temp.x =  d.x; //d.x�� ���� temp.x�� ����
		return temp; //������ ��ü�� �ּҸ� ��ȯ
	}

	public static void main(String[] args) {
		
		Data3 d = new Data3();
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);

	}

}
