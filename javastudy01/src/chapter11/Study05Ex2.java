package chapter11;

import java.util.EmptyStackException;
import java.util.Stack;

public class Study05Ex2 {

	public static void main(String[] args) {

		Stack stack = new Stack();
		String expr = "(3+4)*5-2)";
		
		System.out.println("표현식 : " + expr);
		
		try {
			for(int i = 0; i< expr.length(); i++) {
				char ch = expr.charAt(i);
				
				if(ch=='(') {
					stack.push(ch+"");
				} else if(ch==')') {
					stack.pop();
				}
			}
			
			if(stack.isEmpty()) {
				System.out.println("괄호가 일치");
			} else {
				System.out.println("괄호 개수 일치 하지 않음");
			}
			
		} catch (EmptyStackException e) {
			System.out.println("괄호 개수가 일치 하지 않음");
		}

	}

}
