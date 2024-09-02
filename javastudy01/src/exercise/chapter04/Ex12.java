package exercise.chapter04;

public class Ex12 {

	public static void main(String[] args) {
		
		//구구단 일부 2단부터 9단까지 3까지만
		for(int i =2; i<=9;i++) {
			for(int j = 1; j<=3;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}

	}

}
