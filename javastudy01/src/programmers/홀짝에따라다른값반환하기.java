package programmers;

public class Ȧ¦������ٸ�����ȯ�ϱ� {
	
	public static void main(String[] args) {

		int n = 7;
		int answer = 0;
		if(n%2==0){
			for(int i = 2; i<=n; i+=2){
				answer += Math.pow(i,2);
			}
		} else{
			for(int i =1; i<=n;i+=2){
				answer += i;
			}
		}

		//�ٸ� Ǯ��
//	  for(int i = n; i >= 0; i -= 2)
//	                answer += (n % 2 == 0) ? i * i : i;

		
		
	}

}
