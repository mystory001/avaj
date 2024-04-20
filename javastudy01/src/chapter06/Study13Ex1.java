package chapter06;

class Data{
	int x;
}

public class Study13Ex1 {
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}

	public static void main(String[] args) {
		
		Data data = new Data();
		data.x = 10;
		System.out.println("main() : x = " + data.x);
		
		change(data.x);
		System.out.println("After change(data.x)");
		System.out.println("main() : x = " + data.x);

	}

}
