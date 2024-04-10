package chapter02;

public class Study12 {

	public static void main(String[] args) {
		
		//타입간의 변환
		//1) 문자와 숫자간의 변환(문자 '0'을 더하거나 빼줌)
		//3(숫자) +'0'(문자) -> '3'(문자)
		//cf) 문자 -> 숫자
		//'3'-'0' -> 3
		
		//2) 문자열로의 변환
		//3(숫자) -> "3"(문자열)
		//3 + ""(빈문자열) -> "3"
		//'3'(문자) -> "3"
		//'3' + ""(빈문자열) -> "3"
		
		//3) 문자열을 숫자로 변환
		//"3"(문자열) -> 3(숫자)
		//Integer.parseInt("3") -> 3
		
		//"3.14" -> 3.14
		//Double.parseDouble("3.14") -> 3.14
		
		//"3" -> '3'
		//"3".charAt(0) -> '3'
		
		String str = "3";
		System.out.println(str.charAt(0) - '0'); //숫자
		// == System.out.println(3.charAt(0) - '0');
		System.out.println('3' - '0' + 1);
		System.out.println(Integer.parseInt("3")+1);
		System.out.println("3" + 1);
		System.out.println(3 + '0');
		
	}

}
