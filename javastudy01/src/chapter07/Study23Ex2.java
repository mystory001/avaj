package chapter07;

public class Study23Ex2 {
	
	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner iv = new InstanceInner(); //인스턴스 멤버끼리는 직접 접근가능
	static StaticInner cv = new StaticInner(); //static 멤버끼리는 직접 접근 가능
	
	static void staticMethod() { //static멤버는 인스턴스 멤버에 직접 접근 불가
//		InstanceInner obj1 = new StaticInner();
		StaticInner obj2 = new StaticInner();
	}
	
	void instanceMethod(){ //인스턴스 메서드에서는 인스턴스 멤버와 static멤버 모두 접근 가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner iv = new LocalInner(); //지역 내부 클래스는 외부에서 접근할 수 없음
	}
	
	void method() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
	
}
