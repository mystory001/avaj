package programmers;

public class k�ǰ��� {
	
	public static void main(String[] args) {

		int i = 1;
		int j = 13;
		int k = 1;
		
		int answer = 0;
		
		//���ٹ��? => ����ȯ�ؼ�?
		String kString = k+"";
		String tmp = "";
		
//		for(int a = i; a<=j; a++) {
//			tmp = a+"";
//			if(tmp.contains(kString)) {
//				answer++;
//			}
//			
//			tmp="";
//		}
		//���� for���� �� Ʋ�ȴ°�? 11�϶��� 1�� 2�� ���µ�?
//		if(tmp.equals(kString+kString)) {
//			answer++;
//		}
		//�̰͵� �ȵ� 999�϶� k=9�� �ݷʰ� ����
		
		//String[] split(String regex)
		//�Է¹��� ����ǥ���� �Ǵ� Ư�����ڸ� �������� ���ڿ��� ������ �迭(Array)�� �����Ͽ� ����
		for(int a = i; a<=j; a++) {
			tmp = a+"";
			String[] arr = tmp.split("");
			
			for(String arrString : arr) {
				if(arrString.contains(kString)) {
					answer++;
				}
			}
			
		}
		
		System.out.println(answer);
		
		//�ٸ���� Ǯ��
		for(int a = i; a<=j; i++) {
			int x = a;
			while(x!=0) {
				if(x%10==k) {
					answer++;
				}
				x/=10;
			}
		}
		
		
		
	}

}
