package exercise.chapter06;

class 마린{
	int x = 0, y = 0; //위치좌표
	int hp = 60; //현재 체력
	static int weapon = 6; //공격력
	static int armor = 6; //방어력
	
	void weaponUp() {
		weapon++;
	}
	
	void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
