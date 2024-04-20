package chapter06;

class Calc{
	//메서드는 클래스 영역에만 정의 가능
	long add(long a, long b) {
		return a + b;
	}
	
	long substract(long a, long b) {
		return a - b;
	}
	
	long multiply(long a, long b) {
		return a * b;
	}
	
	double divide(double a, double b) {
		return a / b;
	}
}

public class Study10Ex1 {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		
		long add = calc.add(10, 20);
		long substract = calc.substract(20, 10);
		long multiply = calc.multiply(add, substract);
		double divide = calc.divide(3, 2);
		
		System.out.println("add(10,20) = " + add);
		System.out.println("substract(10,20) = " + substract);
		System.out.println("multiply(10,20) = " + multiply);
		System.out.println("divide(10,20) = " + divide);

	}

}
