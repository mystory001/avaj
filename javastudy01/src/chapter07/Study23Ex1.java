package chapter07;

public class Study23Ex1 {
	
	//�ν��Ͻ� ����Ŭ����
	class InstanceInner{
		int iv = 100;
//		static int cv = 100; //static ���� ���� �Ұ�
		final static int CONST = 100; //final static�� ����̹Ƿ� ���
	}
	
	//static ����Ŭ����
	static class StaticInner{
		int iv = 200;
		static int cv = 200; //static Ŭ������ static����� ������ �� ����
	}
	
	void method() {
		//���� ����Ŭ����
		class LocalInner{
			int iv = 300;
//			static int cv = 300; //static ���� ���� �Ұ�
			final static int CONST = 300; //final static�� ����̹Ƿ� ���
		}
		
		int i = LocalInner.CONST; //����
		
	}
	
	public static void main(String[] args) {

		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
//		System.out.println(LocalInner.CONST); //����. ���� ����Ŭ������ �޼��� ��������
		
		
		
	}
	

}
