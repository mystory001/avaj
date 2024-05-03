package chapter09;

public class Study05Ex2 {
	
	public static void main(String[] args) {

		//숫자 -> 문자열 
		int i = 100;
		//방법 1 숫자 + ""(빈문자열)
		String str1 = i + ""; 
		//방법2
		String str2 = String.valueOf(i); 
		//방법 1은 편리, 방법 2는 속도가 빠름
		
		//문자열을 숫자
		//방법 1
		int i1 = Integer.parseInt("100"); //"100"을 100으로 변환
		//방법 2
		int i2 = Integer.valueOf("100");
		//방법 3. 원래는 반환 타입이 Integer
//		Integer i2 = Integer.valueOf("100");
		//※byte, short를 문자열로 변경할 때는 String valueOf(int i)를 사용하면 됨

		System.out.println("=================");
		
		int iVal = 100;
//		String strVal = String.valueOf(iVal); //int를 String으로 변환
		String strVal = iVal + "";
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; //int를 String으로 변환
		
		double sum = Integer.parseInt(strVal)+Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
		
	}

}
