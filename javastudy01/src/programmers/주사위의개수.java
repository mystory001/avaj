package programmers;

public class �ֻ����ǰ��� {

	public static void main(String[] args) {
		
		int[] box = {6,6,6};
		int n = 3;
		int answer = 0;
		
		answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
		
		System.out.println(answer);
		
		//�ٸ� Ǯ��
		for(int size : box) {
			answer *= size/n;
		}
		
	}

}
