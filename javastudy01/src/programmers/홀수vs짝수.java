package programmers;

public class Ȧ��vs¦�� {
	
	public static void main(String[] args) {

		int[] num_list = {4, 2, 6, 1, 7, 6};
		int answer = 0;
		
		int odd = 0; //Ȧ�� ������ ��
		int even = 0; //¦�� ������ ��
		
		for(int i = 0; i < num_list.length ; i++) {
			//���Ұ� Ȧ���� ��
			if(i==0 || i%2==0) {
				odd += num_list[i];
			} else {
				even += num_list[i];
			}
		}
		
		answer = (odd>even)? odd:even;
		
		
		//�ٸ� ��� Ǯ��
//		answer = Math.max(odd, even);
	}

}
