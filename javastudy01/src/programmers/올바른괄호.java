package programmers;

import java.util.Stack;

public class �ùٸ���ȣ { // Lv.2

	public static void main(String[] args) {

		String s = "()()";
//		boolean answer = true;

		int open = 0; // ( ����
		int close = 0; // ) ����

//		for(int i = 0; i < s.length(); i++) {
//			if(s.charAt(i)=='(') {
//				open++;
//			} else {
//				close++;
//			}
//		}
//		
//		if(open==close) {
//			answer = true;
//		} else {
//			answer = false;
//		}

		// Ʋ�� ������ s�� ������ (�� �����ؾ��ϰ� )�� ������ �Ǿ����
//		if (!(s.startsWith("(") && s.endsWith(")"))) {
//			answer = false;
//		} else {
//			for(int i = 0 ; i < s.length(); i++) {
//				if(s.charAt(i)=='(') {
//					open++;
//				} else {
//					close++;
//				}
//			}
//			if(open==close) {
//				answer = true;
//			} else {
//				answer = false;
//			}
//		}

//		System.out.println(answer);

		// ���� �ڵ忡�� �׽�Ʈ 5�� 11���� ���� => ()())(() �� ��� false�� �Ǿ���Ѵٰ� �Ѵ�.

//		Stack<Character> stack = new Stack<Character>();
//		
//		if (!(s.startsWith("(") && s.endsWith(")"))) {
//			answer = false;
//		} else {
//			for(int i = 0; i < s.length(); i++) {
//				if(s.charAt(i)=='(') {
//					stack.push('(');
//				} else {
//					stack.pop();
//				}
//			}
//			if(stack.isEmpty()) {
//				answer = true;
//			} else {
//				answer = false;
//			}
//		}
//		System.out.println(answer);

		// �̹��� 5, 11���� ��Ÿ�� ����

//		Stack<Character> stack = new Stack<Character>();
//
//		if (!(s.startsWith("(") && s.endsWith(")"))) {
//			answer = false;
//		} else {
//			for (int i = 0; i < s.length(); i++) {
//				if (s.charAt(i) == '(') {
//					stack.push(s.charAt(i));
//				} else if(s.charAt(i)==')') {
//					if(stack.isEmpty()) {
//						answer = false;
//					}
//					stack.pop();
//				}
//			}
//			
//		}
//		System.out.println(answer);

        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }
        
        // �ٸ� Ǯ��
        Stack<Character> stack = new Stack<>();

        // ���ڿ��� �� ���ڸ� ��ȸ
        for (int i = 0; i < s.length(); i++) {

            // ���� ��ȣ�� ������ ���ÿ� �߰�
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            // �ݴ� ��ȣ�� ������ ���ÿ��� ���� ��ȣ�� ����
            else if (s.charAt(i) == ')') {
                // ������ ��� ������ ¦�� ���� ����
                if (stack.isEmpty()) {
                    answer = false;
                }
                stack.pop(); // ���� �ֱ��� ���� ��ȣ ����
            }
        }


	}
}
