package chapter10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Study04Ex1 {
	
	public static void main(String[] args) throws ParseException {
		
		double number = 1234567.89;
		DecimalFormat df = new DecimalFormat("#.#E0"); //지수 형식 표현
		String dfString = df.format(number);
		System.out.println(dfString); //1.2E6
		
		System.out.println();
		
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		Number num = df1.parse("1,234,567.89");
		double d = num.doubleValue();
		System.out.println(d); //1234567.89
		
	}

}
