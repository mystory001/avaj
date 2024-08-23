package chapter14;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * * �������� �޼ҵ� ����
 * -�����ڿ� �޼ҵ� ����
 * Supplier<MyClass> s = () -> new MyClass();
 * Supplier<MyClass> s = MyClass::new;
 * Function<Integer, MyClass> s = (i) -> new MyClass(i);
 * Function<Integer, MyClass> s = MyClass::new;
 * -�迭�� �޼ҵ� ����
 * Function<Integer, int[]> f = x -> new int[x]; //���ٽ�
 * Function<Integer, int[]> f2 = int[]::new //�޼ҵ� ����. �迭Ÿ��[]::new
 */

class MyClass5_2{
	int iv;
	
	public MyClass5_2(int iv) {
		this.iv = iv;
	}
}

public class Study5_2 {
	
	public static void main(String[] args) {
		//Supplier �Է� X, ��� O
//		Supplier<MyClass5_2> s = () -> new MyClass5_2();
//		Supplier<MyClass5_2> s = MyClass5_2::new;

//		MyClass5_2 mc = s.get(); //MyClass5_2 ��ü ��ȯ
//		System.out.println(mc);
//		System.out.println(s.get()); //�Ǵٸ� ��ü
		
		//�����ڰ� �����Ѵٸ�, �Է°� ����� ����Ƿ� Function���� �ٲ�����
//		Function<Integer,MyClass5_2> f = (i) -> new MyClass5_2(i);
		Function<Integer,MyClass5_2> f = MyClass5_2::new;
		MyClass5_2 mc = f.apply(100);
		System.out.println(mc.iv);
		System.out.println(f.apply(100).iv);
		
		Function<Integer, int[]> f2 = (i)-> new int[i];
		Function<Integer, int[]> f3 = int[]::new;
		System.out.println(f2.apply(200).length);
		System.out.println(f3.apply(300).length);
		
	}

}
