package exercise.chapter05;

public class Ex04 {
	
	public static void main(String[] args) {

		//2���� �迭 arr�� ��� ���� ���հ� ����� ���ϴ� ���α׷�
		int[][] arr= { {5,5,5,5,5},{10,10,10,10,10},{20,20,20,20,20},{30,30,30,30,30}};
		
		int total = 0;
		float average = 0;
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				total += arr[i][j];
				average = (float)total/(arr.length*arr[i].length);
			}
		}
		System.out.println("total = " + total);
		System.out.println("average = " + average);
		
	}

}
