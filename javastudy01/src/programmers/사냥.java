package programmers;

public class ��� {

	public static void main(String[] args) {

		//�屺 ���� ���ݷ� : 5, ���� ���� ���ݷ� : 3, �� ���� ���ݷ� : 1
		//�ּ��� ���� ����
		int hp = 23;
		int a = hp/5;
		int b = hp%5/3;
		int c = hp%5%3/1;
		int answer = a+b+c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(answer);
	
		//�ٸ� Ǯ��
		while (hp>0) {
			if(hp>=5) {
				answer++;
				hp -= 5;
			} else if(hp>=3) {
				answer++;
				hp -= 3;
			} else {
				answer ++;
				hp -= 1;
			}
		}
		
		//�ٸ� Ǯ��
		int[] x = {5,3,1};
		int i = 0;
		while (hp!=0) {
			if(hp<x[i]) {
				i++;
			} else {
				hp = hp-x[i];
				answer++;
			}
		}
		
		
	}
	
}
