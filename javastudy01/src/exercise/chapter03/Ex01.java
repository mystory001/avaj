package exercise.chapter03;

public class Ex01 {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		char c = 'A'; //65
		
		System.out.println(y>=5||x<0&&x>2); //true
		System.out.println(y+=10-x++); //15-2=13, x=3; y=15
		System.out.println(x+=2); //5, x=5
		System.out.println(!('A'<=c&&c<='Z')); //false
		System.out.println('C'-c); //2
		System.out.println('5'-'0'); //5(����)
		System.out.println(c+1); //66
		System.out.println(++c); //'B'
		System.out.println(c++); //'B' c='C'
		System.out.println(c); //'C'
	}

}
