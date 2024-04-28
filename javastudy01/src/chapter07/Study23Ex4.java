package chapter07;

class OuterS23E4{
	
	class InstanceInner{
		int iv = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	
	void method() {
		class LocalInner{
			int iv = 400;
		}
	}
	
}

public class Study23Ex4 {

	public static void main(String[] args) {

		//1. 외부 클래스의 인스턴스를 생성
		//2. 내부 클래스의 객체 생성
		OuterS23E4 oc = new OuterS23E4();  
		OuterS23E4.InstanceInner ii = oc.new InstanceInner(); //인스턴스를 생성 가능
		
		//외부 클래스의 객체 생성 없이 사용가능
		System.out.println("ii.iv : " + ii.iv);
		System.out.println("OuterS23E4.StaticInner.cv : " + OuterS23E4.StaticInner.cv);
		
		//static 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 됨
		OuterS23E4.StaticInner si = new OuterS23E4.StaticInner();
		System.out.println("si.iv : " + si.iv);
		
	}

}
