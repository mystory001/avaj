package exercise.chapter06;

class ����{
	int x = 0, y = 0; //��ġ��ǥ
	int hp = 60; //���� ü��
	static int weapon = 6; //���ݷ�
	static int armor = 6; //����
	
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
