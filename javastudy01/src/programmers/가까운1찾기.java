package programmers;

public class �����1ã�� {
	
	public static void main(String[] args) {

		int[] arr = {1, 1, 1, 1, 0};
		int idx = 3;
		int answer = 0;
		
		//���� �迭 arr, ���� idx. idx���� ũ�鼭 �迭�� ���� 1�� ���� ���� �ε����� ã�Ƽ� ��ȯ
		
		//idx���� ũ�鼭 �迭�� ���� 1�� ���� ���� �ε����� ã�Ƽ� ��ȯ
		//�׷��� ���ؽ��� ������ -1�� ��ȯ
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==1 && i>=idx) {
				answer = i;
				break;
			} else {
				answer = -1;
			}
		}
		System.out.println(answer);
		
		//�ٸ� �亯 => ���� �������� ���ϰ� �Ź���.
//		StringBuilder sb = new StringBuilder();
//
//        for (int i : arr) {
//            sb.append(i);
//        }
//        
//        System.out.println(sb.toString().indexOf("1", idx));
		
	}

}
