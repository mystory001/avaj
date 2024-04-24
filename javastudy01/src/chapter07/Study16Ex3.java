package chapter07;

//�߻� �޼��� ȣ�� ����(ȣ���� ���� ����θ� �ʿ�)

abstract class PlayerS16E3{
	
	boolean pause; //�Ͻ����� ���¸� �����ϱ� ���� ����
	int currentPos; //���� Play�ǰ� �ִ� ��ġ�� �����ϱ� ���� ����
	
	//�߻� Ŭ������ �����ڰ� �־����
	PlayerS16E3(){
		pause = false;
		currentPos = 0;
	}
	
	//������ ��ġ(pos)���� ����� �����ϴ� ����� �����ϵ��� �ۼ��Ǿ�� ��
	abstract void play(int pos); //�߻�޼���
	
	//����� ��� ���ߴ� ����� �����ϵ��� �ۼ��Ǿ�� ��
	abstract void stop();
	
	//�ν��Ͻ� �޼��� => ��ü ���� �� ��� ����
	void play() {
		play(currentPos); //�޼���� ����θ� �˸� ȣ�� �����ϹǷ� �߻� �޼��带 ����� �� ����.
	}
}

//�߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ���� ����
class AudioS16E3 extends PlayerS16E3{
	void play(int pos) {
		System.out.println(pos + "�� ���� play�մϴ�.");
	}
	void stop() {
		System.out.println("����� ����ϴ�.");
	}
}

public class Study16Ex3 {

	public static void main(String[] args) {

//		PlayerS16E3 playerS16E3 = new PlayerS16E3(); �߻� Ŭ������ ��ü ���� => X
		AudioS16E3 audio = new AudioS16E3();
		PlayerS16E3 audio1 = new AudioS16E3(); //���������� ����
		
		audio.play(100);
		audio.stop();
		
		System.out.println();
		
		audio1.play(200);
		audio1.stop();
		
	}
	
}
