package programmers;

import java.util.Scanner;

public class �����ﰢ������ϱ� {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.print("*");
			
			for(int j = 0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//�ٸ� Ǯ��
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //�ٸ� Ǯ��
        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
		
	}

}
