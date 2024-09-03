package exercise.chapter06;

public class Ex19 {

	public static void change(String str) {
		str+="456";
	}
	
	public static void main(String[] args) {

		String str = "ABC123";
		System.out.println(str); //ABC123
		change(str); //ABC123456
		System.out.println("After change : " + str); //ABC123
		
	}

}
