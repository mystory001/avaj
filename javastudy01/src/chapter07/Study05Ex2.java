package chapter07;

class ParentS5E2{
	int x = 10; //super.x와 this.x 둘 다 가능
}

class ChildS5E2 extends ParentS5E2{
	void showInfo() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class Study05Ex2 {

	public static void main(String[] args) {

		ChildS5E2 childS5E2 = new ChildS5E2();
		childS5E2.showInfo();
		
	}
	
}
