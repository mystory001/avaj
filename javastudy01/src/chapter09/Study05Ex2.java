package chapter09;

public class Study05Ex2 {
	
	public static void main(String[] args) {

		//���� -> ���ڿ� 
		int i = 100;
		//��� 1 ���� + ""(���ڿ�)
		String str1 = i + ""; 
		//���2
		String str2 = String.valueOf(i); 
		//��� 1�� ��, ��� 2�� �ӵ��� ����
		
		//���ڿ��� ����
		//��� 1
		int i1 = Integer.parseInt("100"); //"100"�� 100���� ��ȯ
		//��� 2
		int i2 = Integer.valueOf("100");
		//��� 3. ������ ��ȯ Ÿ���� Integer
//		Integer i2 = Integer.valueOf("100");
		//��byte, short�� ���ڿ��� ������ ���� String valueOf(int i)�� ����ϸ� ��

		System.out.println("=================");
		
		int iVal = 100;
//		String strVal = String.valueOf(iVal); //int�� String���� ��ȯ
		String strVal = iVal + "";
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; //int�� String���� ��ȯ
		
		double sum = Integer.parseInt(strVal)+Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
		
	}

}
