package chapter07;

abstract class UnitS19E1{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("정지");
	}
}

interface FightableS19E1{
	//인터페이스의 모든 메서드는 public abstract. 예외없이
	void move(int x, int y); //public abstract가 생략됨
	void attack(FightableS19E1 f); //public abstract가 생략됨 
}

class FighterS19E1 extends UnitS19E1 implements FightableS19E1{
	//오버라이딩 규칙 : 조상보다 접근제어가자 좁으면 안됨
	public void move(int x, int y) {  
		System.out.println(x + ", " + y + " 로 이동");
	}

	public void attack(FightableS19E1 f) {
		System.out.println(f+" 를 공격");
	}
	
}

public class Study19Ex1 {

	public static void main(String[] args) {
		
		FighterS19E1 f = new FighterS19E1(); //가능
		f.move(100, 200);
		f.attack(f);
		f.stop();
		
		System.out.println();
		
		UnitS19E1 u = new FighterS19E1();
		u.move(100, 200);
//		u.attack(u); Unit에는 attack() 메서드가 없어 호출 불가
		u.stop();
		
		FightableS19E1 fa = new FighterS19E1(); 
		fa.move(100, 200);
		fa.attack(fa);
//		fa.stop(); Fightable에 stop() 메서드가 없어 호출 불가
		
	}

}
