package chapter07;

class ParentS5E1{
	int x = 10; //super.x
}

class ChildS5E1 extends ParentS5E1{
	int x = 20; //this.x
	
	void showInfo() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class Study05Ex1 {

	public static void main(String[] args) {

		ChildS5E1 childS5E1 = new ChildS5E1();
		childS5E1.showInfo();
		
	}
	
}
