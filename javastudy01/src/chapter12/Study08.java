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
		System.out.println("c1.equals(c3) ? " + c1.equals(c3)); //enum�� ����� ��ü�̱� ������ ����
//		System.out.println("c1>c2 ? " + (c1>c2)); //����. �񱳿����� ��� �Ұ�
		System.out.println("c1.compareTo(c3) ? " + c1.compareTo(c3)); //compareTo() : ������ ũ�� ���, �������� ũ�� ����, ������ 0�� ��ȯ
		System.out.println("c1.compareTo(c2) ? " + c1.compareTo(c2));
		
		System.out.println("==============");
		
		switch(c1) {
		case EAST : //Direction.EAST��� �� �� ����
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
		
		Compass[] cArr = Compass.values(); //�������� ��� ����� �迭�� ��ȯ
		for(Compass c : cArr)
			System.out.printf("%s=%d%n", c.name(), c.ordinal()); //c.ordinal() ����
		
	}

}
