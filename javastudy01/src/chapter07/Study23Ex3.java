package chapter07;

class Outer{
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv; //�ܺ� Ŭ������ private ����� ����(���� Ŭ���� ��)
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
//		int siv = outerIv; //static Ŭ������ �ܺ� Ŭ������ �ν��Ͻ� ����� ������ �� ����
		static int scv = outerCv;
	}
	
	void method() {
		int lv = 0; //���� �ٲ��� �ʴ� ������ ����� ����
		final int LV = 0; //JDK1.8���� final ���� ����
		
		class LocalInner{ //���� ���� Ŭ������ ���ΰ� �ִ� �޼����� ����� ��� ����
			int liv = outerIv;
			int liv2 = outerCv;
			//�ܺ� Ŭ������ ���������� final�� ���� ����(���)�� ���� ����
			int liv3 = lv; //JDK 1.8���� ���� X
			int liv4 = LV;
		}
	}
	
}

public class Study23Ex3 {

}
