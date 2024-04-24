package chapter07;

abstract class TransS17E1{
	
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}

class CarS17E1 extends TransS17E1{
	void move(int x, int y) {
		System.out.println("Car [x = " + x + ", y = " + y + "]");
	}
	void accelerate() {
		System.out.println("지상으로 이동");
	}
}

class AirplaneS17E1 extends TransS17E1{
	void move(int x, int y) {
		System.out.println("Car [x = " + x + ", y = " + y + "]");
	}
	void fly() {
		System.out.println("하늘로 이동");
	}
}

class BicycleS17E1 extends TransS17E1{
	void move(int x, int y) {
		System.out.println("Car [x = " + x + ", y = " + y + "]");
	}
	void pedal() {
		System.out.println("페달을 밟아 이동");
	}
}

public class Study17Ex1 {
	
	public static void main(String[] args) {

		TransS17E1[] group = {new CarS17E1(), new AirplaneS17E1(), new BicycleS17E1()}; //배열의 생성과 초기화를 한 번에 한 문장
		/* ==
		 * TransS17E1[] group = new TransS17E1[3]; //객체 배열 : 참조 변수 묶음
		 * group[0] = new CarS17E1();
		 * group[1] = new AirplaneS17E1();
		 * group[2] = new BicycleS17E1();
		*/
		
		//group 타입은 TransS17E1[]이고,
		//group[0], group[1], group[2]의 타입은 TransS17E1
		for(int i = 0; i<group.length; i++) {
			group[i].move(10, 20);
		}
		/* ==
		 * group[0].move(10,20); //CarS17E1 객체의 move(10,20)을 호출
		 * group[1].move(10,20); //AirplaneS17E1 객체의 move(10,20)을 호출
		 * group[2].move(10,20); //BicycleS17E1 객체의 move(10,20)을 호출
		 */
		
	}

}
