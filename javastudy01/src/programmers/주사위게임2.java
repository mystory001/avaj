package programmers;

public class 주사위게임2 {
	
	public static void main(String[] args) {

		int a = 5, b = 3, c = 3;
		int answer = 0;
		
		if((a!=b)&&(a!=c)&&(b!=c)) {
			answer = a + b + c;
		} else if(((a==b)&&(a!=c))||(a==c)&&(a!=b)||(b==c)&&(b!=a)) {
			answer = (a+b+c) * (int)(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2));
		} else {
			answer = (a+b+c) * (int)(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2)) * (int)(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3));
		}
		System.out.println(answer);
		
		//Math.pow() 를 사용하지 않고 (a*a)+(b*b)+(c*c) 이런식으로 가능
		
	}

}
