package chapter02;

public class Study9 {

	public static void main(String[] args) {
		
		//println()의 단점
		//1) 출력 형식을 지정할 수 없음 : 실수의 자리수를 조절할 수 없음 - 소수점 n자리만 출력하려면
		System.out.println(10.0/3);
		
		//2) 출력이 10진수로만 출력됨
		System.out.println(0x1A);
		
		//println의 단점을 보완 => printf() : 출력형식을 지정할 수 있음
		System.out.printf("%.2f", 10.0/3);
		//"%.2f" -> 소수점 둘째자리
		System.out.printf("%d", 0x1A);
		//"%d" -> 10진수
		System.out.printf("%X\n", 0x1A);
		//"%X" -> 16진수
		
		//printf() 지시자
		//%b : Boolean 형식으로 출력
		//%d : 10진(decimal) 정수의 형식으로 출력
		//%o : 8진(octal) 정수의 형식으로 출력
		//%x, %X : 16진(hexa-decimal) 정수의 형식으로 출력
		//%f : 부동 소수점(floating-point)의 형식으로 출력
		//%e, %E : 지수(exponent) 표현식의 형식으로 출력
		//%c : 문자(character)로 출력
		//%s : 문자열(string)로 출력
		System.out.printf("age:%d year:%d\n", 24, 2024);
		
		System.out.println();
		//정수를 10진수, 8진수, 16진수로 출력
		// %n == \n 개행문자 
		System.out.printf("%d%n", 15); //10진수
		System.out.printf("%o%n", 15); //8진수
		System.out.printf("%x%n", 15); //16진수
		System.out.printf("%X%n", 15); //16진수
		System.out.printf("%s%n", Integer.toBinaryString(15)); //2진수 ※2진수로출력하는 지시자는 없음
		
		System.out.println();
		
		//8진수와 16진수에 접두사 붙이기 #
		System.out.printf("%#o%n", 15);
		System.out.printf("%#x%n", 15);
		System.out.printf("%#X%n", 15);
		
		System.out.println();
		
		//실수 출력을 위한 지시자 %f, 지수형식 %e, 간략한 향식 %g
		float f = 123.4567890F;
		System.out.printf("%f%n", f); //소수점아래 6자리(정밀도에 의해서=>따라서 double을 자주 사용)
		System.out.printf("%e%n", f); //지수형식
		System.out.printf("%g%n", 123.456789); //간략한 형식
		System.out.printf("%g%n", 0.000000001); //간략한 형식
		
		System.out.println();
		
		System.out.printf("[%5d]%n",10);
		System.out.printf("[%-5d]%n",10); //왼쪽 정렬
		System.out.printf("[%05d]%n",10);
		
		System.out.println();
		
		//%전체자리.소수점 아래자리f
		double d = 123.12345;
		System.out.printf("%14.10f%n", d);
		
		System.out.println();
		
		System.out.printf("[%s]%n", "github.com/mystory001");
		System.out.printf("[%30s]%n", "github.com/mystory001");
		System.out.printf("[%-30s]%n", "github.com/mystory001");
		System.out.printf("[%.10s]%n", "github.com/mystory001");
//		System.out.printf("[%-.10s]%n", "github.com/mystory001"); 이건 오류남
		
		
		
	}
}
