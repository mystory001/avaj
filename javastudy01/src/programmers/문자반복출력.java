package programmers;

public class 문자반복출력 {
	
	public static void main(String[] args) {

		String my_string = "hello";
		int n = 3;
		
		String answer = "";
		
		StringBuffer sb = new StringBuffer(my_string.length()*n);
		for(int i = 0; i <my_string.length();i++) {
			for(int j = 1; j<=n;j++) {
				sb.append(my_string.charAt(i));
			}
		}
		
		String result = sb.toString();
		System.out.println(result);
		
		//다른 풀이
        //for(int i=0; i<my_string.length(); i++){
            //for(int j=0; j<n; j++){
                //answer+=my_string.charAt(i);
			//}
        //}
	
//        StringBuilder sb = new StringBuilder();
//        for(char c : my_string.toCharArray()){
//            sb.append((c + "").repeat(n));
//        }
		
		
	}

}
