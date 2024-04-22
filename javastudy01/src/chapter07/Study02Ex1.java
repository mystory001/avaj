package chapter07;

class Point{
	int x;
	int y;
}

class Circle{
	int x; //원점의 x좌표
	int y; //원점의 y좌표
	int r; //반지름
}

class CircleInheritance extends Point{
	int r;
}

class CircleComposite{
	Point c = new Point(); //원점
	int r;
}

public class Study02Ex1 {

	public static void main(String[] args) {
		
		//상속
		CircleInheritance circleInheritance = new CircleInheritance();
		circleInheritance.x = 1;
		circleInheritance.y = 2;
		circleInheritance.r = 3;
		System.out.println("circleInheritance.x = " + circleInheritance.x);
		System.out.println("circleInheritance.y = " + circleInheritance.y);
		System.out.println("circleInheritance.r = " + circleInheritance.r);
		System.out.println();
		
		//포함
		CircleComposite circleComposite = new CircleComposite();
		circleComposite.c.x = 10;
		circleComposite.c.y = 20;
		circleComposite.r = 30;
		System.out.println("circleComposite.c.x = "+circleComposite.c.x);
		System.out.println("circleComposite.c.y = "+circleComposite.c.y);
		System.out.println("circleComposite.r = "+circleComposite.r);
		
		
	}

}
