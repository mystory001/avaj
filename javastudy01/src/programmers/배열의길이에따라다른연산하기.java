package programmers;

import java.util.Arrays;

public class �迭�Ǳ��̿�����ٸ������ϱ� {

	public static void main(String[] args) {
		
		int[] arr = {444, 555, 666, 777};
		int n = 100;
		
		//arr ���̰� Ȧ����� arr�� ��� ¦�� �ε��� ��ġ�� n�� ���� �迭�� ��ȯ
		//arr ���̰� ¦����� arr�� ��� Ȧ�� �ε��� ��ġ�� n�� ���� �迭�� ��ȯ
		
		int[] answer = new int[arr.length];
		
		if(arr.length%2!=0) {
			for(int i = 0; i<arr.length;i++) {
				if(i%2!=0) {
					answer[i] = arr[i];
				} else {
					answer[i]=arr[i]+n;
				}
			}
		} else {
			for(int i = 0 ; i<arr.length;i++) {
				if(i%2!=0) {
					answer[i] = arr[i]+n;
				} else {
					answer[i] = arr[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
		//�ٸ� Ǯ��
		for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0 && i % 2 != 0) {  
                answer[i] = arr[i] + n;
            } else if (arr.length % 2 != 0 && i % 2 == 0) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }
		 
		 //�ٸ� Ǯ��
	     for(int idx=arr.length%2==0?1:0; idx<arr.length; idx+=2) {
	            arr[idx]+=n;
	        }
	}

}
