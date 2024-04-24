package chapter07;

//추상메서드(미완성 메서드)를 갖고 있는 클래스
abstract class PlayerS16E1{ //추상클래스
	abstract void play(int pos); //추상 메서드(구현부가 없는 미완성 메서드)
	abstract void stop(); //추상 메서드
}

//상속을 통해 추상 메서드를 완성해야 인스턴스 생성가능
class AudioPlayerS16E1 extends PlayerS16E1{
	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
	}

}

public class Study16Ex1 {

}
