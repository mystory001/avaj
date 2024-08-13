package chapter12;

enum Compass1{
	EAST(1, ">"), SOUTH(2,"V"), WEST(3, "<"), NORTH(4,"^");
	
	private static final Compass1[] CP_ARR = Compass1.values();
	private final int i;
	private final String string;

	Compass1(int i, String string) { //private Compass(int i)
		this.i = i;
		this.string = string;
	}
	
	public int getI() {return i;}
	public String getString() {return string;}
	
	public static Compass1 of(int dir) {
		if(dir<1 || dir >4) {
			throw new IllegalArgumentException("Invalid : " + dir);
		}
		return CP_ARR[dir-1];
	}
	
	public Compass1 rotate(int num) {
		num = num %4;
		if(num<0) num +=4; //num이; 음수일 때는 시계반대 방향으로 회전
		return CP_ARR[(i-1+num)%4];
	}
	
	public String toString() {
		return name() + " "+ getString();
	}
	
}

public class Study09 {

	public static void main(String[] args) {
		
		for(Compass1 c : Compass1.values())
			System.out.printf("%s=%d%n", c.name(), c.getI());
		
		Compass1 c1 = Compass1.EAST;
		Compass1 c2 = Compass1.of(1);
		
		System.out.printf("c1=%s, %d%n", c1.name(),c1.getI());
		System.out.printf("c2=%s, %d%n", c2.name(),c2.getI());
		
		System.out.println(Compass1.EAST.rotate(1));
		System.out.println(Compass1.EAST.rotate(-2));

	}

}
