package chapter06;

//(메서드) 오버로딩의 올바른 예
//매개변수는 다르지만 같은 의미의 기능 수행
//※ 메서드 이름의 원칙 : 메서드는 작업을 하는 것이므로 이름을 붙일 때 동사

class AddOverloading{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) = ");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, longb) = ");
		return a + b;
	}
	
	//3번 add
	long add(int a, long b) {
		System.out.print("long add(int a, long b) = ");
		return a + b;
	}

	//4번 add
	long add(long a, int b) {
		System.out.print("long add(long a, int b) = ");
		return a + b;
	}
	
	int add(int[] a) { //배열의 모든 요소의 합으로 결과를 돌려줌
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
