package programmers;

public class ����ǰ����͵��� {
	
	public static void main(String[] args) {

		int left = 24;
		int right = 27;
		
		int answer = 0;
		
		//����� ���� ���ϱ�?
		int count = 0;
//		for(int i = 1; i <= left; i++) {
//			if(left%i==0) {
//				count++;
//			}
//		}
		
		//left~right����
		for(int i = left; i <=right; i++) {
			for(int j = 1; j <= i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count%2==0) {
				answer+=i;
			} else {
				answer-=i;
			}
			count=0;
		}
		System.out.println(answer);
		
		//�ٸ� Ǯ��
		for (int i=left;i<=right;i++) {
            //�������� ��� ����� ������ Ȧ��
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //�������� �ƴ� ��� ����� ������ ¦��
            else {
                answer += i;
            }
        }
		
		
	}

}
