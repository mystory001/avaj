package programmers;

public class ���� {
	
	public static void main(String[] args) {

		//a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
		
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		int answer = 0;
		
		//answer = 0�� �ƴ϶� 1234567890? => �������� ���� ������ ������ ���ϰ��� long�ϼ��� ������ �����ؾ߰���?
		for(int i =0; i < a.length; i++) {
			answer += a[i]*b[i];
		}
		System.out.println(answer);
		
	}

}
