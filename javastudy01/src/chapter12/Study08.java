package chapter12;

enum Compass{EAST, SOUTH, WEST, NORTH}
//			  0,	1,	   2,	 3
public class Study08 {

	public static void main(String[] args) {
		
		Compass c1 = Compass.EAST;
		Compass c2 = Compass.valueOf("WEST");
		Compass c3 = Enum.valueOf(Compass.class, "EAST");
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		System.out.println("==============");
		
		System.out.println("c1==c2 ? " + (c1==c2));
		System.out.println("c1==c3 ? " + (c1==c3));
		System.out.println("c1.equals(c3) ? " + c1.equals(c3)); //enum의 상수는 객체이기 때문에 가능
//		System.out.println("c1>c2 ? " + (c1>c2)); //에러. 비교연산자 사용 불가
		System.out.println("c1.compareTo(c3) ? " + c1.compareTo(c3)); //compareTo() : 왼쪽이 크면 양수, 오른쪽이 크면 음수, 같으면 0을 반환
		System.out.println("c1.compareTo(c2) ? " + c1.compareTo(c2));
		
		System.out.println("==============");
		
		switch(c1) {
		case EAST : //Direction.EAST라고 쓸 수 없음
			System.out.println("The Compass is EAST");
			break;
		case SOUTH :
			System.out.println("The Compass is SOUTH");
			break;
		case WEST : 
			System.out.println("The Compass is WEST");
			break;
		case NORTH :
			System.out.println("The Compass is NORTH");
			break;
		default : 
				System.out.println("Invalid compass");
				break;
		}
		
		System.out.println("==============");
		
		Compass[] cArr = Compass.values(); //열거형의 모든 상수를 배열로 반환
		for(Compass c : cArr)
			System.out.printf("%s=%d%n", c.name(), c.ordinal()); //c.ordinal() 순서
		
	}

}
