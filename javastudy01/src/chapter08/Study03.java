package chapter08;

public class Study03 {
	
	public static void main(String[] args) {

		//예외가 발생하면 예외 객체가 생성되고 그 객체에는 예외 정보가 있음

		//printStackTrace(), getMessage()
		//printStackTrace() : 예외 발생 당시 호출 스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력
		//getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있음. String으로 반환
		
		//멀티 catch블럭
		//내용이 같은 catch 블럭을 하나로 합친 것(JDK1.7~)
		//멀티 catch 블록에 쓰이는 클래스가 부모-자식 관계면 안됨.
		//Exception1 과 Exception2의 공통 메서드만 구현부에 올 수 있음
	}

}
