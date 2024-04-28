package chapter07;

public class Study23Ex1 {
	
	//인스턴스 내부클래스
	class InstanceInner{
		int iv = 100;
//		static int cv = 100; //static 변수 선언 불가
		final static int CONST = 100; //final static은 상수이므로 허용
	}
	
	//static 내부클래스
	static class StaticInner{
		int iv = 200;
		static int cv = 200; //static 클래스만 static멤버를 정의할 수 있음
	}
	
	void method() {
		//지역 내부클래스
		class LocalInner{
			int iv = 300;
//			static int cv = 300; //static 변수 선언 불가
			final static int CONST = 300; //final static은 상수이므로 허용
		}
		
		int i = LocalInner.CONST; //가능
		
	}
	
	public static void main(String[] args) {

		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
//		System.out.println(LocalInner.CONST); //에러. 지역 내부클래스는 메서드 내에서만
		
		
		
	}
	

}
