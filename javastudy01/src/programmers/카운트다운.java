package programmers;

public class ī��Ʈ�ٿ� {
	
	public static void main(String[] args) {

		int start_num = 10;
		int end_num = 3;
		int[] answer = new int[start_num-end_num+1];

		for(int i = 0; i<answer.length;i++) {
			answer[i]=start_num--;
		}
		
		for(int a : answer) {
			System.out.println(a);
		}
		
		//�ٸ� Ǯ��
//        for(int i=0; i<=start_num-end_num; i++) {
//            answer[i] = start_num - i;
//        }
		
	}

}
