package chapter09;

public class Study02 {
	
	public static void main(String[] args) {

		//Object 클래스
		//모든 클래스의 최고 조상. 오직 11개의 메서드만을 가지고 있음
		//protected Object clone() : 객체 자신의 복사본을 반환
		//public boolean equals(Object obj) : 객체 자신과 객체 obj가 같은 객체인지 확인. 같다면 true
		//protected void finalize() : 객체가 소멸될 때 가비지 컬렉터에 의해 자동적으로 호출. 이 때 수행되어야하는 코드가 있을 때 오버라이딩함(거의 사용 ㄴ)
		//public Class getClass() : 객체 자신의 클래스 정보를 담고 있는 Class 인스턴스를 반환. 설계도 객체 => 객체 생성, 객체 정보
		//public int hashCode() : 객체 자신의 해시코드를 반환
		//public String toString() : 객체 자신의 정보를 문자열로 반환
		//public void notify() : 객체 자신이 사용하려고 기다리는 쓰레드를 하나만 깨움
		//public void notifyAll() : 객체 자신을 사용하려고 기다리는 모든 쓰레드를 깨움
		//public void wait(), public void wait(long timeout), public void wait(long timeout, int nanos) : 다른 쓰레드가 notify()나 notifyAll()을 호출할 때 까지 현재 쓰레드를 무한히 또는 지정된 시간동안 기다리게 함. 
		//※protected => 오버라이딩 public으로 변경해야함
		
		//equals() (Study02Ex1)
		//객체 자신(this)과 주어진 객체(obj)를 비교 같으면 true, 다르면 false
		//Object클래스의 equals()는 객체의 주소를 비교(참조변수값 비교)
		//public boolean equals(Object obj){
		// return (this==obj); //주소가 같아야 true
		//}
		
		//equals(Object obj)의 오버라이딩 (Study02Ex2)
		//인스턴스 변수(iv)의 값을 비교하도록 equals()를 오버라이딩해야함
		
		
	}

}
