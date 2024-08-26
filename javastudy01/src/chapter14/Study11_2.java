package chapter14;

import java.util.Optional;
import java.util.OptionalInt;

/**
 * *OptionalInt, OptionalLong, OptionalDouble
 * -�⺻�� ���� ���δ� ����Ŭ���� �� ���� ������ ���
 * public final class OptionalInt{
	...
    private final boolean isPresent; //���� ����Ǿ� ������ true
    private final int value; //intŸ���� ����
 * -OptionalInt�� �� ��������
 * Optional<T> T get()
 * OptionalInt int getAsInt()
 * OptionalLong long getAsLong()
 * OptionalDouble double getAsDouble()
 * -�� Optional��ü���� ��
 * OptionalInt opt = OptionalInt.of(0); //OptionalInt�� 0�� ����
 * OptionalInt opt2 = OptionalInt.empty(); //OptionalInt�� 0�� ����
 */
public class Study11_2 {

	public static void main(String[] args) {
		
		Optional<String> optStr = Optional.of("abcde");
		Optional<Integer> optInt = optStr.map(String::length);
		System.out.println("optStr = " + optStr.get());
		System.out.println("optInt = " + optInt.get());
		
		int result1 = Optional.of("123")
					.filter(x->x.length()>0)
					.map(Integer::parseInt).get();
		int result2 = Optional.of("")
					.filter(x->x.length()>0)
					.map(Integer::parseInt).orElse(-1);
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		Optional.of("456").map(Integer::parseInt)
						.ifPresent(x->System.out.printf("result3 = %d%n", x));
		
		OptionalInt optInt1 = OptionalInt.of(0); //0�� ����
		OptionalInt optInt2 = OptionalInt.empty(); //�� ��ü�� ����
		
		System.out.println("optInt1.isPresent() = "+optInt1.isPresent());
		System.out.println("optInt2.isPresent() = "+optInt2.isPresent());

		System.out.println("optInt1.getAsInt() = "+optInt1.getAsInt());
//		System.out.println("optInt2.getAsInt() = "+optInt2.getAsInt()); //NoSuchElementException
		System.out.println("optInt1 = " + optInt1);
		System.out.println("optInt2 = " + optInt2);
		System.out.println("optInt1.equals(optInt2) = "+optInt1.equals(optInt2));
		
	}

}
