package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class A로B만들기 {
	
	public static void main(String[] args) {

		String before = "olleh";
		String after = "hello";
		
		int answer = 0;
		
		//before에 있는 요소가 after와 같다면
		String[] beforeArr = before.split(""); // [o, l, l, e, h]
		String[] afterArr = after.split(""); // [h, e, l, l, o]
		
		Arrays.sort(beforeArr);
		Arrays.sort(afterArr);
		
		if(Arrays.equals(beforeArr, afterArr)) { //배열 간 값 비교 => Arrays.equals(Arr1, Arr2)
			answer = 1;
		} else {
			answer = 0;
		}
		System.out.println(answer);
		
		
		//다른 풀이
		 int index = 0;

        for(int i=0; i<before.length();i++){
            for(int j=0;j<after.length();j++){
                if(before.charAt(i) == after.charAt(j)){
                    after = after.substring(0,j) + after.substring(j+1,after.length());
                    index++;
                    break;
                }
            }
        }

        if(index == before.length()){
            answer = 1;
        }
        else {
            answer = 0;
        }
	
		
	}

}
