package programmers;

public class �迭�������ڿ���ҹ��ں�ȯ�ϱ� {
	
	public static void main(String[] args) {

		String[] strArr = {"aBc","AbC"};
		String[] answer = new String[strArr.length];
		
		//a = 97, A = 65
		//32����
		
		
//			for (int j = 0; j < strArr[i].charAt(j); j++) {
//				if('a'<strArr[i].charAt(j) && strArr[i].charAt(j)<'z') {
//					answer[i] +=  strArr[i].charAt(j)-32;
//				} else {
//					answer[i] +=  strArr[i].charAt(j)+32;
//				}
//			}
		
		
		for (int i = 0; i < strArr.length; i++) {
			answer[i] = ""; //�� ���ڿ��� ���� �ʱ�ȭ
			if(i%2!=0) { //Ȧ����° �ε��� �� �빮�� - 32
				for(int j = 0; j < strArr[i].length(); j++) {
					char ch = strArr[i].charAt(j);
					if('a'<=ch && ch<='z') {
						answer[i] += (char)(ch-32);
					} else {
						answer[i] += ch;
					}
				}
			} else {
				for(int j = 0; j < strArr[i].length(); j++) {
					char ch = strArr[i].charAt(j);
					if('A'<=ch && ch<='Z') {
						answer[i] += (char)(ch+32);
					} else {
						answer[i] += ch;
					}
				}
			}
		}
		
		for(String a : answer) {
			System.out.println(a);
		}
	
		//�ٸ���� Ǯ�� => Lower() �ƴ� -> toLowerCase(), toUpperCase()
//        for(int i = 0; i < strArr.length; i++) {
//            strArr[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
//        }
		
		
	}

}
