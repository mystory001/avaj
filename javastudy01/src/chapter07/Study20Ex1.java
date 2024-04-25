package chapter07;

class A {
	public void method(I i) { //�������̽� I�� ������ �͸� 
		i.method();
	}
}

//B Ŭ������ ����� ������ �и�
interface I{
	public void method(); //method()�� ����
}


class B implements I{
	public void method(){
		System.out.println("BŬ���� method()"); //method()�� ����
	}
}

class C implements I{
	public void method() {
		System.out.println("CŬ���� method()");
	}
}


public class Study20Ex1 {

	public static void main(String[] args) {
		
		A a = new A();
		a.method(new B());  
		a.method(new C()); //A�� C�� ���(����)
		
	}
	
}
