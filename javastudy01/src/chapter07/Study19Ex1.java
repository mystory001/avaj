package chapter07;

abstract class UnitS19E1{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("����");
	}
}

interface FightableS19E1{
	//�������̽��� ��� �޼���� public abstract. ���ܾ���
	void move(int x, int y); //public abstract�� ������
	void attack(FightableS19E1 f); //public abstract�� ������ 
}

class FighterS19E1 extends UnitS19E1 implements FightableS19E1{
	//�������̵� ��Ģ : ���󺸴� ��������� ������ �ȵ�
	public void move(int x, int y) {  
		System.out.println(x + ", " + y + " �� �̵�");
	}

	public void attack(FightableS19E1 f) {
		System.out.println(f+" �� ����");
	}
	
}

public class Study19Ex1 {

	public static void main(String[] args) {
		
		FighterS19E1 f = new FighterS19E1(); //����
		f.move(100, 200);
		f.attack(f);
		f.stop();
		
		System.out.println();
		
		UnitS19E1 u = new FighterS19E1();
		u.move(100, 200);
//		u.attack(u); Unit���� attack() �޼��尡 ���� ȣ�� �Ұ�
		u.stop();
		
		FightableS19E1 fa = new FighterS19E1(); 
		fa.move(100, 200);
		fa.attack(fa);
//		fa.stop(); Fightable�� stop() �޼��尡 ���� ȣ�� �Ұ�
		
	}

}
