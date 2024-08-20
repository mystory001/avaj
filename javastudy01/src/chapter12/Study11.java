package chapter12;

import java.util.ArrayList;

/**
 * @Override
 * -오버라이딩을 올바르게 했는지 컴퍼일러가 체크하게 함
 * -오버라이딩 할 때 메소드 이름을 잘 못 적는 실수를 하는 경우가 있음
 */

/**
 * @deprecated
 * -앞으로 사용하지 않을 것을 권장하는 필드나 메소드에 붙임
 * -Date 클래스의 getDate()
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

/**
 * @FunctionalInterface
 * -함수형 인터페이스에 붙이면, 컴파일러가 올바르게 작성했는지 체크
 * -함수형 인터페이스에는 하나의 추상메소드만 가져야 한다는 제약이 있음
 */

@FunctionalInterface //함수형 인터페이스는 하나의 추상 메소드만 가능
interface Testable{
	void test();
//	void check();
}


/**
 * @SuppressWarnings
 * -컴퍼일러의 경고메시지가 나타나지 않게 억제함
 * -괄호() 안에 억제하고자하는 경고의 종류를 문자열로 지정
 */


public class Study11 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Child child = new Child();
		child.parentMethod(); //deprecated된 메소드 사용
		
	}

}
