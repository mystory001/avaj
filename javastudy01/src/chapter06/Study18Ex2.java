package chapter06;

public class Study18Ex2 {

	long a, b; //iv�� ��¥ �̸� this.a, this.b
	
	public Study18Ex2(int a, int b) { //������
		this.a = a; 
		this.b = b;
		
		//this.a, this.b => iv. this�����Ұ� 
		//a, b => lv
		//lv�� iv ������ ���� this ���
	}
	
	long add() { //�ν��Ͻ� �޼���
		return a + b; //== return this.a + this.b;
	}
	
	static long add(long a, long b) { //Ŭ���� �޼���(static �޼���) => iv ���Ұ�, this ���Ұ�
		return a + b;
	}
	
}
