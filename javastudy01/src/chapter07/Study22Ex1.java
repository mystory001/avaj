package chapter07;

class AAA{ //AAA는 BBB의 외부 클래스
	int a = 100;
	BBB bbb = new BBB();

	class BBB{ //BBB는 AAA의 내부 클래스
		void method() {
//			AAA aaa = new AAA();
//			System.out.println(aaa.a);
			System.out.println(a); //객체 생성없이 외부 클래스의 맴버 접근 가능
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
