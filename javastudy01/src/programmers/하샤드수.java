package programmers;

public class �ϻ���� {

	public static void main(String[] args) {

		int x = 10;
		boolean answer = true;
		
		int a = x;
		int b = 0;
		while(x>0) {
			b+=x%10;
			x/=10;
		}
		
		if(a%b==0) {
			answer = true;
		} else {
			answer = false;
		}
		
		//�ٸ� Ǯ��
//		String[] tmp = String.valueOf(x).split("");
//		int sum = 0;
//		for(String s: tmp) {
//			sum+=Integer.parseInt(s);
//		}

	}

}
