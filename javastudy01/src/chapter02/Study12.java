package chapter02;

public class Study12 {

	public static void main(String[] args) {
		
		//Ÿ�԰��� ��ȯ
		//1) ���ڿ� ���ڰ��� ��ȯ(���� '0'�� ���ϰų� ����)
		//3(����) +'0'(����) -> '3'(����)
		//cf) ���� -> ����
		//'3'-'0' -> 3
		
		//2) ���ڿ����� ��ȯ
		//3(����) -> "3"(���ڿ�)
		//3 + ""(���ڿ�) -> "3"
		//'3'(����) -> "3"
		//'3' + ""(���ڿ�) -> "3"
		
		//3) ���ڿ��� ���ڷ� ��ȯ
		//"3"(���ڿ�) -> 3(����)
		//Integer.parseInt("3") -> 3
		
		//"3.14" -> 3.14
		//Double.parseDouble("3.14") -> 3.14
		
		//"3" -> '3'
		//"3".charAt(0) -> '3'
		
		String str = "3";
		System.out.println(str.charAt(0) - '0'); //����
		// == System.out.println(3.charAt(0) - '0');
		System.out.println('3' - '0' + 1);
		System.out.println(Integer.parseInt("3")+1);
		System.out.println("3" + 1);
		System.out.println(3 + '0');
		
	}

}
