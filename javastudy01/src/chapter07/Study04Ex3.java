package chapter07;

class ParentS4E3{
	void parentMethod() {}
}

class ChildS4E3 extends ParentS4E3{
	void parentMethod() {} //�������̵�
	void parentMethod(int i) {} //�����ε�
	
	void childMethod() {} //�޼ҵ� ����
	void childMethod(int i ) {} //�����ε�
//	void childMethod() {} //�ߺ�����. ����
}

public class Study04Ex3 {

}
