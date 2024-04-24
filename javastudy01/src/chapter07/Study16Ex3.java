package chapter07;

//추상 메서드 호출 가능(호출할 때는 선언부만 필요)

abstract class PlayerS16E3{
	
	boolean pause; //일시정지 상태를 저장하기 위한 변수
	int currentPos; //현재 Play되고 있는 위치를 저장하기 위한 변수
	
	//추상 클래스도 생성자가 있어야함
	PlayerS16E3(){
		pause = false;
		currentPos = 0;
	}
	
	//지정된 위치(pos)에서 재생을 시작하는 기능이 수행하도록 작성되어야 함
	abstract void play(int pos); //추상메서드
	
	//재생을 즉시 멈추는 기능을 수행하도록 작성되어야 함
	abstract void stop();
	
	//인스턴스 메서드 => 객체 생성 후 사용 가능
	void play() {
		play(currentPos); //메서드는 선언부만 알면 호출 가능하므로 추상 메서드를 사용할 수 있음.
	}
}

//추상 클래스는 상속을 통해 완성해야 객체 생성 가능
class AudioS16E3 extends PlayerS16E3{
	void play(int pos) {
		System.out.println(pos + "번 부터 play합니다.");
	}
	void stop() {
		System.out.println("재생을 멈춥니다.");
	}
}

public class Study16Ex3 {

	public static void main(String[] args) {

//		PlayerS16E3 playerS16E3 = new PlayerS16E3(); 추상 클래스의 객체 생성 => X
		AudioS16E3 audio = new AudioS16E3();
		PlayerS16E3 audio1 = new AudioS16E3(); //다형성으로 가능
		
		audio.play(100);
		audio.stop();
		
		System.out.println();
		
		audio1.play(200);
		audio1.stop();
		
	}
	
}
