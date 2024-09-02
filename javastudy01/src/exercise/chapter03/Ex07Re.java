package exercise.chapter03;

public class Ex07Re {

	public static void main(String[] args) {
		
		//화씨(F)에서 섭씨(C) 변환공식 = 'C = 5/9 *(F-32)
		//변환 결과값은 소수점 셋째자리에서 반올림, 단, Math.round()를 사용하지 않고 처리
		
		int fahrenheit = 100;
		float celcius = (int)(5/9f * (fahrenheit-32)*1000+0.5)/1000f;
		//(5/9f * (fahrenheit-32)); //37.77778
		//(5/9f * (fahrenheit-32)*1000); //37777.777
		//(int)(5/9f * (fahrenheit-32)*1000+0.5); //37778.0
		//(int)(5/9f * (fahrenheit-32)*1000+0.5)/1000f; //37.778
		System.out.println("Fahrenheit : "+fahrenheit);
		System.out.println("Celcius : " + celcius);

	}

}
