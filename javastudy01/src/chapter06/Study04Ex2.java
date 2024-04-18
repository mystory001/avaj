package chapter06;

public class Study04Ex2 {

	public static void main(String[] args) {
		Tv tv1 = new Tv(); //Tv 인스턴스를 참조하기 위한 변수 t에 Tv인스턴스를 대입
		Tv tv2 = new Tv();
		System.out.println("tv1의 channel 값은 " + tv1.channel); //0
		System.out.println("tv2의 channel 값은 " + tv2.channel); //0
		
		tv1.channel = 7; //tv1의 channel 값을 7로 변경
		
		System.out.println("tv1의 channel 값은 " + tv1.channel); //7
		System.out.println("tv2의 channel 값은 " + tv2.channel); //0

		tv2 = tv1;
		System.out.println("tv1의 channel 값은 " + tv1.channel); //7
		System.out.println("tv2의 channel 값은 " + tv2.channel); //0
	}

}
