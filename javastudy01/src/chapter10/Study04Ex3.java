package chapter10;

import java.text.DecimalFormat;

public class Study04Ex3 {
	
	public static void main(String[] args){
		
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df1.parse("1,234,567.89");
			System.out.print("1,234,567.89 => "); //문자열
//			System.out.print(Double.parseDouble("1,234,567.89")); //오류 ,값이 들어있는 문자열은 변경 불가
			
			double d = num.doubleValue();
			System.out.print(d + " => "); //숫자
			
			System.out.println(df2.format(num)); //문자열
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
