package chapter09;

public class Study06Ex2 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("123");
		
		StringBuffer sb2 = sb.append("aa");
		
		System.out.println(sb);
		System.out.println(sb2);
		
		//==> sb.append("123").append("aa");
		//		 sb
	}

}
