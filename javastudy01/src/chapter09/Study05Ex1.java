package chapter09;

public class Study05Ex1 {
	
	public static void main(String[] args) {

		String animals = "dog,cat,pig";
		String[] arr = animals.split(","); //���ڿ��� "," �����ڷ� ������ �迭�� ����
		String str = String.join("-", arr); //"dog"+"-"+"cat"+"-"+"pig". �迭�� ���ڿ��� '-'�� �����ؼ� ����
		System.out.println(str); //dog-cat-pig

	}

}
