package chapter09;

public class Study08 {
	
	public static void main(String[] args) {

		//StringBuilder(≒StringBuffer)
		//StringBuffer는 동기화 되어 있지만, StringBuilder는 동기화 되어 있지 않음. 멀티 쓰레드에 안전(thread-safe)
		//※쓰레드(작업 처리) - 싱글 쓰레드(한번에 1개 작업), 멀티 쓰레드(한번에 여러 작업)
		//멀티 쓰레드 프로그램이 아닌 경우, 동기화는 불필요한 성능 저하, 이럴 때(싱글 쓰레드 프로그램) StringBuilder를 사용하면 성능 향상
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		//== ↔
		StringBuilder sb1 = new StringBuilder();
		sb1.append("abc");
		
		
		//Math 클래스
		//수학 관련 static 메서드의 집합
		//static double||flolat||int||long abs(double||flolat||int||long a) 주어진 값의 절대값을 반환
		int i = Math.abs(-10); //10
		double d = Math.abs(-10.3); //10.3
		
		//static double ceil(double a) 주어진 값을 올림하며 반환. 무조건 올림
		double d1 = Math.ceil(10.1); //11
		double d2 = Math.ceil(-10.1); //-10.0
		double d3 = Math.ceil(10.0001); //11
		
		//static double floor(double a) 주어진 값을 버림하여 반환. 무조건 내림
		double d4 = Math.floor(10.9); //10
		double d5 = Math.floor(-10.9); //11
		
		//static double||flolat||int||long max(x, y) 주어진 두 값을 비교하여 큰 쪽을 반환
		int i1 = Math.max(10, 9); //10
		
		//static double||flolat||int||long min(x, y) 주어진 두 값을 비교하여 작은 쪽을 반환
		float f = Math.min(3.14F, 3.141F); //3.14
		
		//static double random() 0.0~1.0 범위의 임의의 double값을 반환(1.0은 범위에 포함되지 않음)
		double random = Math.random();
		
		//static double rint(double a) 주어진 double값과 가장 가까운 정수값을 double형으로 반환. 단, 두 정수의 정 가운데 있는 값(0.5 => 0.0, 1.5, 2.5 => 2.0 등)은 짝수를 반환
		double d6 = Math.rint(1.2); //1.0
		double d7 = Math.rint(2.6); //3.0
		double d8 = Math.rint(3.5); //4.0
		double d9 = Math.rint(4.5); //4.0
		
		//static long round(double a || float a) 소수점 첫째자리에 반올림한 정수값(long)을 반환. 두 정수의 정가운데 있는 값은 항상 큰 정수를 반환
		long l = Math.round(1.2); //1
		long l2 = Math.round(2.6); //3
		long l3 = Math.round(3.5); //4
		double dd = 90.5678;
		double dd1 = Math.round(dd*100)/100.0; //90.57
	}

}
