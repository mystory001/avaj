package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class �ΰ��̾Ƽ����ϱ� {
	
	public static void main(String[] args) {

		//���� �迭 numbers�� �־����ϴ�. 
		//numbers���� ���� �ٸ� �ε����� �ִ� �� ���� ���� �̾� ���ؼ� ���� �� �ִ� ��� ���� �迭�� ������������ ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.
		
		int[] numbers = { 5,0,2,7 }; // [2,3,4,5,6,7]
//		int[] answer = {};
		
		Arrays.sort(numbers); // [1, 1, 2, 3, 4]
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		
		int[] answer = new int[set.size()];
		
		int idx = 0;
		for(Integer i : set) {
			answer[idx++] = i;
		}
		Arrays.sort(answer); // Set�� ������ ������� �����Ƿ� �־������
		
		// �ٸ� Ǯ�� (Iterator ���)
		HashSet<Integer> set2 = new HashSet<Integer>();
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				set2.add(numbers[i] + numbers[j]);
			}
		}
		int idx2 = 0;
		Iterator<Integer> it = set2.iterator();
		while(it.hasNext()) {
			answer[idx2] = (int)it.next();
			idx2++;
		}
		
		
	}

}
