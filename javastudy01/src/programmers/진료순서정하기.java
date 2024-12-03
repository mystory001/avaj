package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ����������ϱ� {

	public static void main(String[] args) {
		
		int[] emergency = {30, 10, 23, 6, 100}; //��Ұ� Ŭ���� �켱������ ����
		int[] answer = new int[emergency.length];
		
		//�迭���� �ּڰ�, �ִ� ã��
//		int max = emergency[0];
//		int min = emergency[0];
//		
//		for(int i = 1; i < emergency.length; i++) {
//			if(emergency[i]>max) {
//				max = emergency[i];
//			}
//			if(emergency[i]<min) {
//				min = emergency[i];
//			}
//		}
//		System.out.println("emergency�� �ּڰ� : " + min + " emergency�� �ִ� : " + max);
//		for(int i = 0; i < answer.length; i++) {
//			if(emergency[i]==max) {
//				answer[i] = 1;
//			}
//			if(emergency[i]==min) {
//				answer[i] = answer.length;
//			}
//		}
//		int score = answer.length;
//		for(int i = 0; i < answer.length; i++) {
//			for(int j = i+1; j < answer.length; j++) {
//				if(emergency[i]>emergency[j]) {
//					score--; 
//					answer[i] = score;
//				}
//			}
//			score = answer.length-i;
//		}
		
		//���� ���� �ߴµ� �κ������� �ᱣ���� ����� �ٸ�
		//���� �ڵ带 ���� ���� => ���� score�� ���������� ��������
		for(int i = 0; i < emergency.length; i++) {
			int score = emergency.length;
			for(int j = 0; j < emergency.length; j++) {
				if(emergency[i]>emergency[j]) {
					score--;
				}
			}
			answer[i] = score;
		}
		
		System.out.println(Arrays.toString(answer));
		
		//�ٸ� Ǯ��
		//Map �̿� 1
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] emergencySort = Arrays.copyOfRange(emergency, 0, emergency.length);
		Arrays.sort(emergencySort);
		int size = emergency.length;
		for(int i = 0; i < emergencySort.length; i++) {
			int e = emergencySort[i];
			map.put(e, size-i);
		}
		for(int i = 0; i < emergency.length; i++) {
			emergency[i] = map.get(emergency[i]);
		}
		
		//Map �̿� 2
        Map<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < emergency.length; i++) {
            map1.put(emergency[i], i);
        }

        Arrays.sort(emergency);

        for (int i = emergency.length-1; i >= 0; i--) {
            answer[map1.get(emergency[i])] = emergency.length - i;
        }

	}

}
