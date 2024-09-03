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

//�ν��Ͻ� ������ �����Ǳ� ��, ���α׷��� ����� �� static�� �����
//���� static�� ���� ������ �޼ҵ�� �ν��Ͻ� ������ �޼ҵ带 ���� �� ���� ��

public class Ex18 {

	public static void main(String[] args) {

	}

}
