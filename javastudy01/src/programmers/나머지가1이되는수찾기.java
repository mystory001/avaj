package programmers;

public class ��������1�̵Ǵ¼�ã�� {
	
	public static void main(String[] args) {

		int n = 10;
		int answer = 0;
		
		//���� �ۼ��� ��
		//i = 2 -> n = 0
		//i = 3 -> n = 1 break
		for(int i = 1; i<n ;i++) { 
			if(n%i==1) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
		
		//while������ �ٲ㺸��
		int a = 1;
		while(true) {
			if(n%a==1) { break;
			}
			a++;
		}
		
		System.out.println(a);
		
		
		
	}

}
