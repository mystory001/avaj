package programmers;

import java.util.Arrays;

public class ������ {
	
	public static void main(String[] args) {

		int[] array = {3,10,28};
		int n = 20;
		
		int answer = 0;
		
		// �׽�Ʈ 5, �׽�Ʈ 13 ���� ���� => ����� ��츦 ã�ƺôµ� n�� �迭 ����� �� �߾��� ���� �� ������ ����
//		int[] diff = new int[array.length];
//		int minDiff = Integer.MAX_VALUE;
//		int idx = -1;
//		
//		for(int i = 0; i < array.length; i++) {
//			diff[i] = array[i]-n;
//		} 
//		
//		System.out.println(Arrays.toString(diff)); // [-17, -10, 8]
//
//	      // diff �迭�� ���������� Ȯ���ϸ鼭 0�� ���� ����� ���� ã��
//        for (int i = 0; i < diff.length; i++) {
//            if (Math.abs(diff[i]) < minDiff) {  // ���̰� �� ������ ������Ʈ
//                minDiff = Math.abs(diff[i]);
//                idx = i;
//            }
//        }
//        
//        answer = array[idx];
//        System.out.println(answer);
		
		int minDiff = Math.abs(array[0]-n);
		answer = array[0];
		
		for(int i = 0; i < array.length; i++) {
			int diff = Math.abs(array[i] - n);
			if(diff < minDiff || (diff == minDiff && answer > array[i])) {
				minDiff = diff;
				answer = array[i];
			}
		}
		
		// �ٸ� Ǯ��
		answer = 0;
		Arrays.sort(array);
		
		for(int i = 1; i < array.length; i++) {
			if(Math.abs(n-array[0])>Math.abs(n-array[i])) {
				array[0] = array[i];
			}
		}
        answer = array[0];
        
		
	}

}
