package chapter12;

/**
 * @Override
 * �������̵��� �ٸ��� �ߴ��� �����Ϸ��� üũ
 * 
 * @Deprecated
 * ������� ���� ���� �����ϴ� �޼ҵ峪 �ʵ忡 ���
 */


class Parent{
	void parentMethod() {}
}

class Child extends Parent{
	@Override
	@Deprecated
//	void parentmethod() {} //���� �޼ҵ��� �̸� ��Ÿ
	void parentMethod() {} 
}

public class Study10 {
	
	public static void main(String[] args) {

		Child child = new Child();
		child.parentMethod(); //deprecated�� �޼ҵ� ���
		
		
	}
	
}
