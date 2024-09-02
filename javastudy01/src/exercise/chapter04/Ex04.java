package exercise.chapter04;

public class Ex04 {

	public static void main(String[] args) {
		
		//1+(-2)+3+(-4)+...과 같은 식으로 계속 더해갔을 때, 
		//몇까지 더해야 총합이 100이상 되는지?
		
		int sum = 0; //총합을 저장할 변수
		int buho = 1; //값의 부호를 바꿔주는데 사용할 변수
		int num = 0; //구하고자하는 변수(몇까지 더해야?)
		
		for(int i = 1; sum<100;i++,buho=-buho) { //매 반복마다 buho는 1,-1,1,-1 반복
			num = buho*i;
			sum += num;
		}
		
		System.out.println(num);

	}

}
