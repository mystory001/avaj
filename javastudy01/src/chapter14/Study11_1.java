package chapter14;

import java.util.Optional;

/**
 * *Optional<T>
 * -T 타입 객체의 래퍼클래스
 * 래퍼클래스 : Integer, Long,...
 * null을 직접 다루는 것은 위험 → 간접적으로 null 다루기
 * null 체크(if 문 필수) → 코드가 길어짐
 * =>Optional 객체에 null을 넣음
 * public final class Optional<T>{
 * 	private final T value; //T타입의 참조 변수. 모든 종류의 객체 저장 가능(null 가능)
 *  ...
 * } 
 */

/**
 * *Optional<T> 객체 생성하기
 * -Optional<T>객체를 생성하는 다양한 방법
 * String str = "abc";
 * Optional<String> optVal = Optional.of(str);
 * Optional<String> optVal = Optional.of("abc");
 * //Optional<String> optVal = Optional.of(null); //NullPointerException 발생
 * Optional<String> optVal = Optional.ofNullable(null); //가능
 * -null 대신 빈 Optional<T> 객체를 사용
 * Optional<String> optVal = null; //null로 초기화. 바람직하지 않음
 * Optional<String> optVal = Optional.<String>empty(); //빈 객체로 초기화
 */

/**
 * *Optional<T> 객체의 값 가져오기
 * -Optional 객체의 값 가져오기 - get(), orElse(), orElseGet(), orElseThrow()
 * Optional<String> optVal = Optional.of("abc");
 * String str1 = optVal.get(); //optVal에 저장된 값 반환. null이면 예외발생
 * String str2 = optVal.orElse(""); //optVal에 저장된 값이 null일 때는 ""를 반환
 * String str3 = optVal.orElseGet(String::new); //람다식 사용가능 () -> new String()
 * String str4 = optVal.orElseThrow(NullPointerException::new); //null이면 예외발생
 * -Optional객체의 값이 null이면 false, 아니면 true를 반환 - isPresent()
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
//		System.out.println("arr2.length = " + arr2.length); //NullPointerException 발생
		
		Optional<String> opt = null; //가능은 하지만, 바람직하지 않음
		Optional<String> opt1 = Optional.empty();
		System.out.println("opt = " + opt);
		System.out.println("opt1 = " + opt1);
//		System.out.println("opt.get() = " + opt.get()); //NoSuchElementException 발생
//		System.out.println("opt1.get() = " + opt1.get()); NoSuchElementException 발생
		
		String str = "";
//		str = opt1.get(); //예외발생 → try-catch문 이용
		
		try {
			str = opt1.get();
		} catch (Exception e) {
			str = ""; //예외가 발생하면 빈 문자열("")로 초기화
		}
		System.out.println("str = " + str);
		
		//try-catch문을 이용하기 보다는 orElse() 메소드 사용
		 str = opt1.orElse("비어있음"); //Optional에 저장된 값이 null이면 ""반환
		 System.out.println("str = " + str);
		 
		 str = opt1.orElseGet(String::new);
		 System.out.println("str = " + str);

	}

}
