package chapter07;

public class Study23Ex2 {
	
	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner iv = new InstanceInner(); //�ν��Ͻ� ��������� ���� ���ٰ���
	static StaticInner cv = new StaticInner(); //static ��������� ���� ���� ����
	
	static void staticMethod() { //static����� �ν��Ͻ� ����� ���� ���� �Ұ�
//		InstanceInner obj1 = new StaticInner();
		StaticInner obj2 = new StaticInner();
	}
	
	void instanceMethod(){ //�ν��Ͻ� �޼��忡���� �ν��Ͻ� ����� static��� ��� ���� ����
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner iv = new LocalInner(); //���� ���� Ŭ������ �ܺο��� ������ �� ����
	}
	
	void method() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
	
}
