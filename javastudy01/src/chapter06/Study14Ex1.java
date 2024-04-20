package chapter06;

class Data2{
	int x;
}

public class Study14Ex1 {
	
	static void change(Data2 d) { //참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

	public static void main(String[] args) {
		
		Data2 data = new Data2();
		data.x = 10;
		System.out.println("main() : x = " + data.x);
		
		change(data);
		System.out.println("After change(data.x)");
		System.out.println("main() : x = " + data.x);

	}

}
