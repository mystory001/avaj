package programmers;

public class ���ǿ��°Լ�����ȯ3 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,100,99,98};
		int k = 3;
		
		int[] answer = new int[arr.length];
		
		if(k%2==0) {
			for(int i =0 ;  i<answer.length;i++) {
				answer[i] = arr[i] + k;
			}
		} else {
			for(int i = 0; i<answer.length;i++) {
				answer[i] = arr[i] * k;
			}
		}
		
		for(int a : answer) {
			System.out.println(a);
		}

	}

}
