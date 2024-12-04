package programmers;

import java.util.Map;
import java.util.function.BiFunction;

public class 조건문자열 {
	
	public static void main(String[] args) {

		String ineq = "<"; //">"
		String eq = "="; //"!"
		int n = 41;
		int m = 78;
		int answer = 0;
		
		if(ineq.equals(">")) {
			if(eq.equals("=")) {
				answer = n>=m? 1 : 0;
			} else {
				answer = n>m? 1 : 0;
			}
		} else {
			if(eq.equals("=")) {
				answer = n<=m? 1: 0;
			} else {
				answer = n<m? 1:0;
			}
		}
		System.out.println(answer);
		
		//다른 풀이 => 좀 이해가 어려움
//        Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
//                ">=", (a, b) -> a >= b,
//                "<=", (a, b) -> a <= b,
//                ">!", (a, b) -> a > b,
//                "<!", (a, b) -> a < b
//        );

//        return functions.get(ineq + eq).apply(n, m) ? 1 : 0;
		
		
	}

}
