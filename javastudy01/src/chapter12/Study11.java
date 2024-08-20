package chapter12;

import java.util.ArrayList;

/**
 * @Override
 * -�������̵��� �ùٸ��� �ߴ��� �����Ϸ��� üũ�ϰ� ��
 * -�������̵� �� �� �޼ҵ� �̸��� �� �� ���� �Ǽ��� �ϴ� ��찡 ����
 */

/**
 * @deprecated
 * -������ ������� ���� ���� �����ϴ� �ʵ峪 �޼ҵ忡 ����
 * -Date Ŭ������ getDate()
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

/**
 * @FunctionalInterface
 * -�Լ��� �������̽��� ���̸�, �����Ϸ��� �ùٸ��� �ۼ��ߴ��� üũ
 * -�Լ��� �������̽����� �ϳ��� �߻�޼ҵ常 ������ �Ѵٴ� ������ ����
 */

@FunctionalInterface //�Լ��� �������̽��� �ϳ��� �߻� �޼ҵ常 ����
interface Testable{
	void test();
//	void check();
}


/**
 * @SuppressWarnings
 * -�����Ϸ��� ���޽����� ��Ÿ���� �ʰ� ������
 * -��ȣ() �ȿ� �����ϰ����ϴ� ����� ������ ���ڿ��� ����
 */


public class Study11 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Child child = new Child();
		child.parentMethod(); //deprecated�� �޼ҵ� ���
		
	}

}
