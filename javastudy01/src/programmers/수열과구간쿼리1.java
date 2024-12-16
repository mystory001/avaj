package programmers;

import java.util.Arrays;

public class 수열과구간쿼리1 {
	
	public static void main(String[] args) {

		
		// 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e] 꼴입니다.
		// 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.
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
		
	
		//라고 풀었는데 answer의 결과는 [1, 2, 2, 1, 0]으로 나타남.

		/*
		int[][] x = {{a}{b}{c}}
		int[] y = {d,e,f,g,h}
		=> a 범위에서 d가 있는지, e가 있는지 f가 있는지, g가 있는지, h가 있는지?(조건) 있으면 +1 없으면 그대로(결과)
		=> b 범위에서 "
		=> c 범위에서 "
		*/
		
		//복사
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
		
		// 위의 코드로 한다면 원하는 결과대로 나옴 하지만 틀림 => 정답인 코드는 아래와 같음
        for (int[] query : queries) { // queries 배열의 각 원소를 순차적으로 반복. queries는 2차원 배열로, 각 원소는 [s,e] 형태
            int s = query[0], e = query[1]; //query[0]은 범위의 시작값, query[1]은 범위의 끝 값
            for (int i = s; i <= e; i++) // s부터 e까지의 범위에 대해 순차적으로 반복
                arr[i]++;
        }
		
		// 왜 이렇게 되는지 잘 모르겠음. 또 내가 한 코드는 왜 정답이 안되는지?
		
	}

}
