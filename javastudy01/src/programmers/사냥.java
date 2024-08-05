package programmers;

public class 사냥 {

	public static void main(String[] args) {

		//장군 개미 공격력 : 5, 병정 개미 공격력 : 3, 일 개미 공격력 : 1
		//최소의 병력 구성
		int hp = 23;
		int a = hp/5;
		int b = hp%5/3;
		int c = hp%5%3/1;
		int answer = a+b+c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(answer);
	
		//다른 풀이
		while (hp>0) {
			if(hp>=5) {
				answer++;
				hp -= 5;
			} else if(hp>=3) {
				answer++;
				hp -= 3;
			} else {
				answer ++;
				hp -= 1;
			}
		}
		
		//다른 풀이
		int[] x = {5,3,1};
		int i = 0;
		while (hp!=0) {
			if(hp<x[i]) {
				i++;
			} else {
				hp = hp-x[i];
				answer++;
			}
		}
		
		
	}
	
}
