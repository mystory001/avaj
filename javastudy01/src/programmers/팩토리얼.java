package programmers;

public class ���丮�� {

	public static void main(String[] args) {
		
		int n = 3628800;
		int answer = 0; //i! <= n
		int i = 1;
		while(n>0) {
			n/=i;
			i++;
			if(i>n) {
				answer = i;
				break;
			}
		}
		
		answer = answer - 1;
		System.out.println(answer);
		
		//�ٸ� Ǯ��
//		answer = 1;
//		for(int i = 1; i <= n; i++) {
//			answer *=i;
//			if(answer>n) {
//				answer = i -1;
//			}
//		}
		
	}

}
