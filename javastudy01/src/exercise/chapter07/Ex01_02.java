package exercise.chapter07;

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	//Ex01
	SutdaDeck() {
		for(int i = 0; i <cards.length;i++) {
			int num = i%10+1;
//			boolean isKwang = (num==1)||(num==3)||(num==8); //1K, 2, 3K, 4, 5, 6, 7, 8K, 9, 10, 1K, 2, 3K, 4, 5, 6, 7, 8K, 9, 10,
			boolean isKwang = (i<10)&&((num==1)||(num==3)||(num==8)); //1K, 2, 3K, 4, 5, 6, 7, 8K, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	//Ex2 - cards에 담긴 카드의 위치를 뒤섞음
	void shuffle() {
		for(int i = 0; i<cards.length;i++) {
			int j = (int)(Math.random()*CARD_NUM);
			
			//스왑 알고리즘을 이용하여 값을 서로 바꿈
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	//Ex2 - 배열 cards에서 지정된 위치의 SutdaCard를 반환
	SutdaCard pick(int index){
		if(index<0 || index>=CARD_NUM) //index의 유효성 검사
			return null;
		return cards[index];
	}
	
	//Ex3 - 배열 cards에서 임의의 위치의 SutdaCard를 반환
	SutdaCard pick() {
		int index = (int)(Math.random()*cards.length);
		return pick(index);
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return num + (isKwang? "K":"");
	}
	
}

public class Ex01_02 {

	public static void main(String[] args) {
		
		SutdaDeck d = new SutdaDeck();
		System.out.println(d.pick(0));
		System.out.println(d.pick());
		d.shuffle();
		for(int i = 0; i < d.cards.length;i++) {
			System.out.print(d.cards[i]+", ");
		}
		System.out.println();
		System.out.println(d.pick(0));

	}

}
