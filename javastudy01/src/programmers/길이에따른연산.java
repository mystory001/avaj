package programmers;

public class 길이에따른연산 {
	
	public static void main(String[] args) {

		int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
//		int[] num_list = {2, 3, 4, 5};
		int answer = 0;
		
		if(num_list.length>=11 && num_list.length<=20) {
			answer = 0;
			for(int i = 0;i<num_list.length;i++) {
				answer += num_list[i];
			}
		} else{
			answer = 1;
			for(int i = 0;i<num_list.length;i++) {
				answer = answer * num_list[i];
			}
		}
		
		System.out.println(answer);
		
		//다른 풀이
//		int answer = (num_list.length < 11 ? 1 : 0);
//
//        for(int i=0; i<num_list.length; i++){
//
//            if(num_list.length < 11) {
//                answer *= num_list[i];
//            }else{
//                answer += num_list[i];
//            }
//
//        }
		
//	    IntStream stream = IntStream.of(num_list);
//        return num_list.length>10?stream.sum():stream.reduce(1, (a, b) -> a * b);
		
	}

}
