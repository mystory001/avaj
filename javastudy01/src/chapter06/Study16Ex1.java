package chapter06;

//(�޼���) �����ε��� �ùٸ� ��
//�Ű������� �ٸ����� ���� �ǹ��� ��� ����
//�� �޼��� �̸��� ��Ģ : �޼���� �۾��� �ϴ� ���̹Ƿ� �̸��� ���� �� ����

class AddOverloading{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) = ");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, longb) = ");
		return a + b;
	}
	
	//3�� add
	long add(int a, long b) {
		System.out.print("long add(int a, long b) = ");
		return a + b;
	}

	//4�� add
	long add(long a, int b) {
		System.out.print("long add(long a, int b) = ");
		return a + b;
	}
	
	int add(int[] a) { //�迭�� ��� ����� ������ ����� ������
		System.out.print("int add(int[] a) = ");
		int result = 0;
		for(int i = 0; i< a.length ;i++) {
			result += a[i];
		}
		return result;
	}
	
}

public class Study16Ex1 {

	public static void main(String[] args) {
		
		AddOverloading addOverloading = new AddOverloading();
		System.out.println(addOverloading.add(3, 4)); 
		System.out.println(addOverloading.add(3, 4L));
		System.out.println(addOverloading.add(3L, 4));
		System.out.println(addOverloading.add(3L, 4L));
		int[] a = {3,4,5,6};
		System.out.println(addOverloading.add(a));

	}

}
