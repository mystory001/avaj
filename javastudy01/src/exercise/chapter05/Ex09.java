package exercise.chapter05;

public class Ex09 {
	
	public static void main(String[] args) {

		//�־��� �迭�� �ð�������� 90�� ȸ�����Ѽ� ����ϴ� ���α׷��� �ϼ�
		char[][] star= {
				{'*','*',' ', ' ',' '},
				{'*','*',' ', ' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		for(int i = 0; i<star.length;i++) {
			for(int j = 0; j<star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i<star.length;i++) {
			for(int j = 0; j <star[i].length;j++) {
				result[j][star.length-1-i] = star[i][j];
			}
		}
		
		System.out.println();
		
		for(int i = 0; i<result.length;i++) {
			for(int j = 0; j<result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
	}

}
