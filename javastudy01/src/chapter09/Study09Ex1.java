package chapter09;

public class Study09Ex1 {
	
	public static void main(String[] args) {

		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i1==i2 ? " + (i1==i2));
		System.out.println("i1.equals(i2) ? " + i1.equals(i2)); //같으면 true, 다르면 false
		System.out.println("i1.compareTo(i2) ? "+i1.compareTo(i2)); //같으면 0, 작으면 양수, 크면 음수. 정렬에 사용
		System.out.println("i1.toString() = " + i1.toString());
		
		System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE + " bits");
		System.out.println("BYTES = " + Integer.BYTES + " bytes");
		System.out.println("TYPE = " + Integer.TYPE);
		
	}

}
