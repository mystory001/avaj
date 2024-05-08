package chapter11;

import java.util.EmptyStackException;
import java.util.Stack;

public class Study05Ex2 {

	public static void main(String[] args) {

		Stack stack = new Stack();
		String expr = "(3+4)*5-2)";
		
		System.out.println("ǥ���� : " + expr);
		
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
				System.out.println("��ȣ�� ��ġ");
			} else {
				System.out.println("��ȣ ���� ��ġ ���� ����");
			}
			
		} catch (EmptyStackException e) {
			System.out.println("��ȣ ������ ��ġ ���� ����");
		}

	}

}
