package programmers;

import java.util.Stack;

public class 올바른괄호 { // Lv.2

	public static void main(String[] args) {

		String s = "()()";
//		boolean answer = true;

		int open = 0; // ( 개수
		int close = 0; // ) 개수

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

		// 틀린 이유는 s의 시작은 (로 시작해야하고 )로 마무리 되어야함
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

		// 위의 코드에서 테스트 5와 11에서 실패 => ()())(() 이 경우 false가 되어야한다고 한다.

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

		// 이번엔 5, 11에서 런타임 에러

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
        
        // 다른 풀이
        Stack<Character> stack = new Stack<>();

        // 문자열의 각 문자를 순회
        for (int i = 0; i < s.length(); i++) {

            // 여는 괄호를 만나면 스택에 추가
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            // 닫는 괄호를 만나면 스택에서 여는 괄호를 제거
            else if (s.charAt(i) == ')') {
                // 스택이 비어 있으면 짝이 맞지 않음
                if (stack.isEmpty()) {
                    answer = false;
                }
                stack.pop(); // 가장 최근의 여는 괄호 제거
            }
        }


	}
}
