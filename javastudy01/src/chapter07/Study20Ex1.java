package chapter07;

class A {
	public void method(I i) { //인터페이스 I를 구현한 것만 
		i.method();
	}
}

//B 클래스의 선언과 구현을 분리
interface I{
	public void method(); //method()의 선언
}


class B implements I{
	public void method(){
		System.out.println("B클래스 method()"); //method()의 구현
	}
}

class C implements I{
	public void method() {
		System.out.println("C클래스 method()");
	}
}


public class Study20Ex1 {

	public static void main(String[] args) {
		
		A a = new A();
		a.method(new B());  
		a.method(new C()); //A가 C를 사용(의존)
		
	}
	
}
