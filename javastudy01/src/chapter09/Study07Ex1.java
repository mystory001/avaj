package chapter09;

public class Study07Ex1 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("01");
		System.out.println(sb1); //01
		StringBuffer sb2 = sb1.append(23); 
		System.out.println(sb2); //0123
		sb1.append('4').append(56);
		System.out.println(sb1); //0123456
		
		StringBuffer sb3 = sb1.append(78);
		System.out.println(sb3); //012345678
		sb3.append(9.0);
		System.out.println(sb3); //0123456789.0
		
		System.out.println();
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		
		System.out.println();
		
		System.out.println(sb1.deleteCharAt(10)); //01234567890
		System.out.println(sb1.delete(3, 6)); //01267890
		System.out.println(sb1.insert(3, "abc")); //012abc67890
		System.out.println(sb1.replace(6, sb1.length(), "end")); ////012abcend
		
		System.out.println();
		
		System.out.println(sb1.capacity()); //18
		System.out.println(sb1.length()); //9
		
	}

}
