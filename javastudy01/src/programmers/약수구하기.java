package programmers;

import java.util.Arrays;

public class 약수구하기 {
	
	public static void main(String[] args) {
		//나머지가 0일 경우 약수
		int n = 24;
		int[] answer = new int[n]; //임의로 배열의 길이를 지정(약수이기 때문에 n보다 약수의 개수가 클 수 없음 최대 크거나 같음)
		
		int idx = 0;
		
		for(int i = 1; i<=n; i++) { //n의 약수 구하기
			if(n%i==0) {
				answer[idx++] = i;
			}
		}
		
		System.out.println(Arrays.toString(answer)); //[1, 2, 3, 4, 6, 8, 12, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		
		Arrays.copyOf(answer, idx);
		
		//배열 복사 사용 안하기
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                //answer[cnt] = i;
                cnt++;
            }
        }

        answer = new int[cnt];

        cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[cnt] = i;
                cnt++;
            }
        }

	}

}
