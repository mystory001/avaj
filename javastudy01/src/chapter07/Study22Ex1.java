package chapter07;

class AAA{ //AAA�� BBB�� �ܺ� Ŭ����
	int a = 100;
	BBB bbb = new BBB();

	class BBB{ //BBB�� AAA�� ���� Ŭ����
		void method() {
//			AAA aaa = new AAA();
//			System.out.println(aaa.a);
			System.out.println(a); //��ü �������� �ܺ� Ŭ������ �ɹ� ���� ����
		}
		
	}
	
}

//class CCC{
//	BBB bbb = new BBB();
//	
//}

public class Study22Ex1 {

	public static void main(String[] args) {

//		BBB bbb = new BBB();
//		bbb.method();
		
	}
	
}
