package programmers;

public class �����ѳ����� {
	
	public static void main(String[] args) {

		boolean x1 = false;
		boolean x2 = true;
		boolean x3 = true;
		boolean x4 = true;
		
		boolean answer = true;
		
		// (x1 �� x2) �� (x3 �� x4)
		// x �� y => �� �� false�̸� false <-> �ϳ��� true�̸� true
		// x �� y => �� �� true�̸� true <-> �ϳ��� false�̸� false
		
		boolean aBoolean = (x1==false)&&(x2==false)? false : true;
		boolean bBoolean = (x3==false)&&(x4==false)? false : true;
		
		answer = aBoolean==true&& bBoolean ==true? true: false;
		
		System.out.println(answer);
		
		// �ٸ� Ǯ��
		answer = (x1||x2)&&(x3||x4);
		
		
	}

}
