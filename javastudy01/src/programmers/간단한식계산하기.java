package programmers;

public class �����ѽİ���ϱ� {
	
	public static void main(String[] args) {

		String binomial = "43 * 12";
		int answer = 0;
		String op = "";
		
		
		//String - String ������ �������� ���� => Ư�� �κ��� �����ϰ� ������ replace()�� replaceAll()�� �̿�
		
		for(int i = 0; i < binomial.length(); i++) {
			if(binomial.charAt(i)=='+'||binomial.charAt(i)=='-'||binomial.charAt(i)=='*') {
				op += binomial.charAt(i);
			}
		}
		System.out.println("������ op : " + op);
		
		//+,-,*�� �������� ������ split()
		//���� �����ڸ� ó���ϴ� ��� => ���� ǥ���� ���
		String[] part = binomial.split("[\\+\\-\\*]"); //+,-,*�� �������� �и�
		String a = part[0].trim();
		String b = part[1].trim();
		
		int n1 = Integer.parseInt(a);
		int n2 = Integer.parseInt(b);
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		switch(op) {
		case "+" :
			answer = n1 + n2;
			break;
		case "-" :
			answer = n1 - n2;
			break;
		default : answer = n1 * n2;
			break;
		}
		
		
		System.out.println(answer);
		
		//���⸦ ���������Ѵٸ�
		String[] str = binomial.split(" "); //"43 * 12"
		String op1 = str[1];
		//str[0] = 43, str[1] = *, str[2] = 12
		System.out.println(op1);
		
	}

}
