package chapter14;

import java.util.function.Function;

/**
 * *�޼ҵ� ����(method reference)
 * -�ϳ��� �޼ҵ常 ȣ���ϴ� ���ٽ��� '�޼ҵ� ����'�� ������ �� �� ���� => Ŭ�����̸�::�޼ҵ��̸�
 * -static �޼ҵ� ����
 */

public class Study5_1 {

	public static void main(String[] args) {
		
//		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		Function<String, Integer> f = Integer::parseInt; //�޼ҵ� ����
		System.out.println(f.apply("100")+200);

	}

}
