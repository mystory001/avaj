package chapter12;

/**
 * @Override
 * 오버라이딩을 바르게 했는지 컴파일러가 체크
 * 
 * @Deprecated
 * 사용하지 않을 것을 권장하는 메소드나 필드에 사용
 */


class Parent{
	void parentMethod() {}
}

class Child extends Parent{
	@Override
	@Deprecated
//	void parentmethod() {} //조상 메소드의 이름 오타
	void parentMethod() {} 
}

public class Study10 {
	
	public static void main(String[] args) {

		Child child = new Child();
		child.parentMethod(); //deprecated된 메소드 사용
		
		
	}
	
}
