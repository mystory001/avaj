package programmers;

import java.util.Scanner;

public class ���簢������� {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 0; i < b; i++) {
			System.out.print("*");
			for(int j = 1; j <a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("=================");
		
		//�ٸ� Ǯ��
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("=================");
        
        //�ٸ� Ǯ��
        String star = "";
        for(int i=1; i<=a; i++){
            star += "*";
        }
        for(int i=1; i<=b; i++){
            System.out.println(star);
        }
        
        
		
	}

}
