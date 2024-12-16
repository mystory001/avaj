package programmers;

import java.util.Arrays;

public class ��������������1 {
	
	public static void main(String[] args) {

		
		// ���� �迭 arr�� 2���� ���� �迭 queries�� �־����ϴ�. queries�� ���Ҵ� ���� �ϳ��� query�� ��Ÿ����, [s, e] ���Դϴ�.
		// �� query���� ������� s �� i �� e�� ��� i�� ���� arr[i]�� 1�� ���մϴ�.
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 1},{1, 2},{2, 3}};
		
		int[] answer = new int[arr.length];

//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < queries.length; j ++) { //3
//					
//					if(queries[j][0] <=arr[i] && arr[i] <= queries[j][1]) {
//						answer[i] += 1;
//				}
//				System.out.println("queries["+j+"][0]("+queries[j][0] +") <= " + arr[i] + " <= queries["+j+ "][1](" + queries[j][1] +")");
//			}
//		}
		
	
		//��� Ǯ���µ� answer�� ����� [1, 2, 2, 1, 0]���� ��Ÿ��.

		/*
		int[][] x = {{a}{b}{c}}
		int[] y = {d,e,f,g,h}
		=> a �������� d�� �ִ���, e�� �ִ��� f�� �ִ���, g�� �ִ���, h�� �ִ���?(����) ������ +1 ������ �״��(���)
		=> b �������� "
		=> c �������� "
		*/
		
		//����
		for(int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
		}
		
        for(int i=0;i<queries.length;i++){
            for(int j=0; j<queries[i].length; j++){
                int idx = queries[i][j];
                answer[idx]++;
            }
        }
		
		System.out.println(Arrays.toString(answer));
		
		// ���� �ڵ�� �Ѵٸ� ���ϴ� ������ ���� ������ Ʋ�� => ������ �ڵ�� �Ʒ��� ����
        for (int[] query : queries) { // queries �迭�� �� ���Ҹ� ���������� �ݺ�. queries�� 2���� �迭��, �� ���Ҵ� [s,e] ����
            int s = query[0], e = query[1]; //query[0]�� ������ ���۰�, query[1]�� ������ �� ��
            for (int i = s; i <= e; i++) // s���� e������ ������ ���� ���������� �ݺ�
                arr[i]++;
        }
		
		// �� �̷��� �Ǵ��� �� �𸣰���. �� ���� �� �ڵ�� �� ������ �ȵǴ���?
		
	}

}
