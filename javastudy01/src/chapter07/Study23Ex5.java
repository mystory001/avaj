package chapter07;

class OuterS23E5{
	int value = 10; //OuterS23E5.this.value. 외부클래스의 iv

	class Inner{
		int value = 20; //this.value. 내부클래스 iv
		
		void method1() {
			int value = 30; //lv
			System.out.println("value : " + value);
			System.out.println("this.value : " + this.value);
			System.out.println("OuterS23E5.this.value : " + OuterS23E5.this.value);
		}
	}
}

public class Study23Ex5 {

	public static void main(String[] args) {
		
		OuterS23E5 outer = new OuterS23E5();
		OuterS23E5.Inner inner = outer.new Inner();
		inner.method1();

	}

}
