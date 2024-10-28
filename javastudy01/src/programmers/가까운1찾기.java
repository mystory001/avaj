package programmers;

public class 가까운1찾기 {
	
	public static void main(String[] args) {

		int[] arr = {1, 1, 1, 1, 0};
		int idx = 3;
		int answer = 0;
		
		//정수 배열 arr, 정수 idx. idx보다 크면서 배열의 값이 1인 가장 작은 인덱스를 찾아서 반환
		
		//idx보다 크면서 배열의 값이 1인 가장 작은 인덱스를 찾아서 반환
		//그러한 인텍스가 없으면 -1을 반환
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==1 && i>=idx) {
				answer = i;
				break;
			} else {
				answer = -1;
			}
		}
		System.out.println(answer);
		
		//다른 답변 => 전혀 생각지도 못하고 신박함.
//		StringBuilder sb = new StringBuilder();
//
//        for (int i : arr) {
//            sb.append(i);
//        }
//        
//        System.out.println(sb.toString().indexOf("1", idx));
		
	}

}
