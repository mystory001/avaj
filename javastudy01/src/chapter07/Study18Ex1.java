package chapter07;

interface PlayingCardS18E1{
	//상수
	public static final int SPADE = 4;
	final int DIAMOND = 3; //== (public static final) int DIAMOND = 3;
	static int HEART = 2;  //== (public static final) int HEART = 2;
	int CLOVER = 1;		   //== (public static final) int CLOVER = 1;
	
	//추상 메서드
	public abstract String getCardNumber();
	String getCardKind(); //== (public abstract) String getCardKind();
}


public class Study18Ex1 {

}
