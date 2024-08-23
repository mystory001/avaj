package chapter14;

/**
 * *�Լ��� �������̽� Ÿ���� �Ű�����, ��ȯŸ��
 * -�Լ��� �������̽� Ÿ���� �Ű�����
 * void exMethod(MyFunction f){
 * 	f.myMethod(); //MyFunction�� ���ǵ� �޼ҵ� ȣ��
 * }
 * @FunctionalInterface
 * interface MyFunction{
 * 	void myMethod();
 * }
 * MyFunction f = () -> System.out.println("myMethod()"));
 * exMethod(f);
 * //�� ���� �� ��������
 * exMethod(() -> System.out.println("myMethod()"));
 * -�Լ��� �������̽� Ÿ���� ��ȯŸ��
 * MyFunction myFunction(){
 * 	MyFunction f = ()->{};
 *     return f;
 *     }
 * ==>
 * MyFunction myMethod(){
 * 	return () -> {};
 * }
 */

@FunctionalInterface
interface MyFunction2_2{
	void run(); // == public abstract void run();
}

public class Study2_2 {
	
	static void execute(MyFunction2_2 f) { //�Ű����� Ÿ���� MyFunction2_2�� �޼ҵ�
		f.run();
	}
	
	static MyFunction2_2 getMyFunction2_2() { //��ȯŸ���� MyFunction2_2�� �޼ҵ�
//		MyFunction2_2 f = () -> System.out.println("f3.run()");
//		return f;
		return ()-> System.out.println("f3.run()");
		
	}

	public static void main(String[] args) {
		
		//���ٽ����� MyFunction2_2�� run()�� ����
		MyFunction2_2 f1 = () -> System.out.println("f1.run()");
		
		MyFunction2_2 f2 = new MyFunction2_2() { //�͸�Ŭ������ run()�� ����
			@Override
			public void run() { //�ݵ�� public�� �ٿ�����
				System.out.println("f2.run()");
				
			}
		};
		
		MyFunction2_2 f3 = getMyFunction2_2();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(f2);
		execute(f3);
		execute(()->System.out.println("run()"));
		
	}

}
