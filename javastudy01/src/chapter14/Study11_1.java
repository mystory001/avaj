package chapter14;

import java.util.Optional;

/**
 * *Optional<T>
 * -T Ÿ�� ��ü�� ����Ŭ����
 * ����Ŭ���� : Integer, Long,...
 * null�� ���� �ٷ�� ���� ���� �� ���������� null �ٷ��
 * null üũ(if �� �ʼ�) �� �ڵ尡 �����
 * =>Optional ��ü�� null�� ����
 * public final class Optional<T>{
 * 	private final T value; //TŸ���� ���� ����. ��� ������ ��ü ���� ����(null ����)
 *  ...
 * } 
 */

/**
 * *Optional<T> ��ü �����ϱ�
 * -Optional<T>��ü�� �����ϴ� �پ��� ���
 * String str = "abc";
 * Optional<String> optVal = Optional.of(str);
 * Optional<String> optVal = Optional.of("abc");
 * //Optional<String> optVal = Optional.of(null); //NullPointerException �߻�
 * Optional<String> optVal = Optional.ofNullable(null); //����
 * -null ��� �� Optional<T> ��ü�� ���
 * Optional<String> optVal = null; //null�� �ʱ�ȭ. �ٶ������� ����
 * Optional<String> optVal = Optional.<String>empty(); //�� ��ü�� �ʱ�ȭ
 */

/**
 * *Optional<T> ��ü�� �� ��������
 * -Optional ��ü�� �� �������� - get(), orElse(), orElseGet(), orElseThrow()
 * Optional<String> optVal = Optional.of("abc");
 * String str1 = optVal.get(); //optVal�� ����� �� ��ȯ. null�̸� ���ܹ߻�
 * String str2 = optVal.orElse(""); //optVal�� ����� ���� null�� ���� ""�� ��ȯ
 * String str3 = optVal.orElseGet(String::new); //���ٽ� ��밡�� () -> new String()
 * String str4 = optVal.orElseThrow(NullPointerException::new); //null�̸� ���ܹ߻�
 * -Optional��ü�� ���� null�̸� false, �ƴϸ� true�� ��ȯ - isPresent()
 * if(Optional.ofNullable(str).isPresent(){ //if(str!=null){
 * 	System.out.println(str);
 * }
 */

public class Study11_1 {

	public static void main(String[] args) {
		int[] arr = {};
		int[] arr1 = new int[0];
//		int[] arr2 = null;
		System.out.println("arr.length = " + arr.length);
		System.out.println("arr1.length = " + arr1.length);
//		System.out.println("arr2.length = " + arr2.length); //NullPointerException �߻�
		
		Optional<String> opt = null; //������ ������, �ٶ������� ����
		Optional<String> opt1 = Optional.empty();
		System.out.println("opt = " + opt);
		System.out.println("opt1 = " + opt1);
//		System.out.println("opt.get() = " + opt.get()); //NoSuchElementException �߻�
//		System.out.println("opt1.get() = " + opt1.get()); NoSuchElementException �߻�
		
		String str = "";
//		str = opt1.get(); //���ܹ߻� �� try-catch�� �̿�
		
		try {
			str = opt1.get();
		} catch (Exception e) {
			str = ""; //���ܰ� �߻��ϸ� �� ���ڿ�("")�� �ʱ�ȭ
		}
		System.out.println("str = " + str);
		
		//try-catch���� �̿��ϱ� ���ٴ� orElse() �޼ҵ� ���
		 str = opt1.orElse("�������"); //Optional�� ����� ���� null�̸� ""��ȯ
		 System.out.println("str = " + str);
		 
		 str = opt1.orElseGet(String::new);
		 System.out.println("str = " + str);

	}

}
