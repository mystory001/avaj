package chapter07;

class OuterS23E4{
	
	class InstanceInner{
		int iv = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	
	void method() {
		class LocalInner{
			int iv = 400;
		}
	}
	
}

public class Study23Ex4 {

	public static void main(String[] args) {

		//1. �ܺ� Ŭ������ �ν��Ͻ��� ����
		//2. ���� Ŭ������ ��ü ����
		OuterS23E4 oc = new OuterS23E4();  
		OuterS23E4.InstanceInner ii = oc.new InstanceInner(); //�ν��Ͻ��� ���� ����
		
		//�ܺ� Ŭ������ ��ü ���� ���� ��밡��
		System.out.println("ii.iv : " + ii.iv);
		System.out.println("OuterS23E4.StaticInner.cv : " + OuterS23E4.StaticInner.cv);
		
		//static ���� Ŭ������ �ν��Ͻ��� �ܺ� Ŭ������ ���� �������� �ʾƵ� ��
		OuterS23E4.StaticInner si = new OuterS23E4.StaticInner();
		System.out.println("si.iv : " + si.iv);
		
	}

}
