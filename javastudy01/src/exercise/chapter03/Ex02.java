package exercise.chapter03;

public class Ex02 {

	public static void main(String[] args) {
		
		int numOfApples = 147; //사과의 개수
		int sizeOfBucket = 10; //바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = ((numOfApples%sizeOfBucket==0)?numOfApples/sizeOfBucket:numOfApples/sizeOfBucket+1); //모든 사과를 담는데 필요한 바구니의 수
		
		//모범답안
		int numOfBucketCor = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket>0?1:0);
		
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
		System.out.println("필요한 바구니의 수 : " + numOfBucketCor);
		
		//나의 풀이 : 사과의 개수에 바구니의 크기를 나눈 값이 0이면 사과의 개수는 바구니의 크기의 배수임을 이용함 → 코드가 길어짐...
		
	}

}
