package programmers;

public class 간단한논리연산 {
	
	public static void main(String[] args) {

		boolean x1 = false;
		boolean x2 = true;
		boolean x3 = true;
		boolean x4 = true;
		
		boolean answer = true;
		
		// (x1 ∨ x2) ∧ (x3 ∨ x4)
		// x ∨ y => 둘 다 false이면 false <-> 하나만 true이면 true
		// x ∧ y => 둘 다 true이면 true <-> 하나만 false이면 false
		
		boolean aBoolean = (x1==false)&&(x2==false)? false : true;
		boolean bBoolean = (x3==false)&&(x4==false)? false : true;
		
		answer = aBoolean==true&& bBoolean ==true? true: false;
		
		System.out.println(answer);
		
		// 다른 풀이
		answer = (x1||x2)&&(x3||x4);
		
		
	}

}
