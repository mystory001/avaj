package programmers;

public class N��°���Һ��� {
	
	public static void main(String[] args) {

		int[] num_list = {5, 2, 1, 7, 5};
		int n = 2;
		int[] answer = new int[num_list.length-n+1];
		 
		for(int i =0; i<answer.length;i++) {
			answer[i] = num_list[n-1+i];
		}
		
		for(int a : answer) {
			System.out.println(a);
		}
		
		//�ٸ�Ǯ��
//		int[] answer = Arrays.copyOfRange(num_list, n-1, num_list.length);
	}

}
