package chapter07;

public class Study15 {
	
	public static void main(String[] args) {
		
		//다형성 장점
		//1. 다형적 매개변수
		//2. 하나의 배열에 여러 종류 객체 저장
		//배열은 하나의 타입으로만 할 수 있지만 다형성을 이요하면 여러 종류의 객체를 저장할 수 있음
		
		//여러 종류의 객체를 배열로 다루기
		//조상타입의 배열에 자손들의 객체를 담을 수 있음
		//Product p1 = new Tv(); Product p2 = new Computer(); Product p3 = new Audio();
		//==> Product p[] = new Product[3]; p[0] = new Tv(); p[1] = new Computer(); p[3] = new Audio();
		
	}

}
