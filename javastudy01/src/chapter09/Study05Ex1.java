package chapter09;

public class Study05Ex1 {
	
	public static void main(String[] args) {

		String animals = "dog,cat,pig";
		String[] arr = animals.split(","); //문자열을 "," 구분자로 나눠서 배열에 저장
		String str = String.join("-", arr); //"dog"+"-"+"cat"+"-"+"pig". 배열의 문자열을 '-'로 구분해서 결합
		System.out.println(str); //dog-cat-pig

	}

}
