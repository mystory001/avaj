package chapter05;

public class Study3Ex1 {
	
	public static void main(String[] args) {

		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		
		for(int i = 0; i < iArr1.length;i++) {
			iArr1[i] = i + 1; //1~10의 숫자를 순서대로 배열에 넣음
			System.out.print(iArr1[i]+ ", ");
		}
		
		System.out.println();
		
		for(int i = 0; i < iArr2.length;i++) {
			iArr2[i] = (int)(Math.random()*10)+1; //1~10사이의 숫자를 임의로 배열에 넣음
			System.out.print(iArr2[i] + ", ");
		}
		
		
	}

}
