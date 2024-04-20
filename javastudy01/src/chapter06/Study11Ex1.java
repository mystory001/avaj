package chapter06;

class Calc1{
	void GuGuDan(int dan) {
		System.out.println(dan+"단");
		for(int i = 1; i<=9;i++) {
			System.out.println(dan +" * " + i +" = " +  dan*i);
		}
	}
	
	void GuGuDanif(int dan) {
		if(!(2<=dan && dan<=9)) {
			System.out.println("2부터 9단까지만 가능합니다.");
			return;
		} else {
			System.out.println(dan+"단");
			for(int i = 1; i<=9;i++) {
				System.out.println(dan +" * " + i +" = " +  dan*i);
			}
//			return;
		}
	}

}

public class Study11Ex1 {

	public static void main(String[] args) {
		
		Calc1 calc1 = new Calc1();
		calc1.GuGuDan(3);
		System.out.println();
		calc1.GuGuDanif(5);
		System.out.println();
		calc1.GuGuDanif(12);

	}

}
