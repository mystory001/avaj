package chapter07;

class Outer{
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv; //외부 클래스의 private 멤버도 가능(같은 클래스 안)
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
//		int siv = outerIv; //static 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없음
		static int scv = outerCv;
	}
	
	void method() {
		int lv = 0; //값이 바뀌지 않는 변수는 상수로 간주
		final int LV = 0; //JDK1.8부터 final 생략 가능
		
		class LocalInner{ //지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용 가능
			int liv = outerIv;
			int liv2 = outerCv;
			//외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근 가능
			int liv3 = lv; //JDK 1.8부터 에러 X
			int liv4 = LV;
		}
	}
	
}

public class Study23Ex3 {

}
