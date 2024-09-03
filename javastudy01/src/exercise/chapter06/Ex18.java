package exercise.chapter06;

class MemberCall{
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv; //Cannot make a static reference to the non-static field iv
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); //Cannot make a static reference to the non-static field iv
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); //Cannot make a static reference to the non-static method instanceMethod1() from the type MemberCall
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
	
}

//인스턴스 변수가 생성되기 전, 프로그램이 실행될 때 static이 실행됨
//따라서 static이 붙은 변수나 메소드는 인스턴스 변수나 메소드를 가질 수 없게 됨

public class Ex18 {

	public static void main(String[] args) {

	}

}
