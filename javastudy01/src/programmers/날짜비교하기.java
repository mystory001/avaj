package programmers;

import java.time.LocalDate;
import java.util.Arrays;

public class 날짜비교하기 {
	
	public static void main(String[] args) {

		int[] date1 = {1999,12,31};
		int[] date2 = {2000,1,1};
		
		//date 1이 date 2보다 앞서는 날짜라면 1 아니라면 0
		//d1 < d2, 1
		int answer = 0;
		
		//년이 앞서는 경우 : 우선순위 1
		//년월이 앞서는 경우 : 우선순위 2
		//년월일이 앞서는 경우 : 우선순위 3
		
		System.out.println(2011+12+5);
		System.out.println(2021+1+1);
		//이런 경우가 있기 때문에 요소의 합으로 하면 안됨
		
//		if(date1[0]<date2[0]) {
//			answer = 1;
//		} else if(date1[0]<=date2[0] && date1[1] < date2[2]) {
//			answer = 1;
//		} else if(date1[0]<=date2[0] && date1[1] <= date2[2] && date1[2] < date2[2]) {
//			answer = 1;
//		} else {
//			answer = 0;
//		}
//		System.out.println(answer);
		//실패함
		
//		if(date1[0]<date2[0] || date1[0]==date2[0]) {
//			if(date1[1]<date2[1] || date1[1]==date2[1]) {
//				if(date1[2]!=date2[2]) {
//					answer = 1;
//				}
//			}
//		}  else {
//			answer = 0;
//		}
		//또 실패함
//		System.out.println(answer);
		
//		if(date1[0]<date2[0] || date1[0]==date2[0]) {
//			if(date1[1]<date2[1] || date1[1]==date2[1]) {
//				if(date1[2]!=date2[2] && date1[2]<date2[2]) {
//					answer = 1;
//				}
//			}
//		}  else {
//			answer = 0;
//		}
		System.out.println(answer);
		//이것도 실패함 => break예약어를 작성했는데 안됨. if문이라 반복문을 사용해야겠다고 느낌
		
		for(int i = 0; i < date1.length; i++) {
			if(date1[i]< date2[i]) {
				answer = 1;
				break;
			} else if(date1[i]>date2[i]) {
				answer = 0;
				break;
			}
		}
		//정답 if문을 주구장창 늘리는 것보다 가독성이나 아마 속도도 빠를것같음

		//다른 풀이 => 날짜가 나오면 LocalDate
		LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
		LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);
		
		if(dateA.isBefore(dateB)) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		//다른 풀이 => 자바 9버전이상
		answer = Arrays.compare(date1, date2) < 0 ? 1:0;
		
		//다른 풀이 => 내가 처음 하려고했던 if문
        if(date1[0] > date2[0]) {
            answer = 0;
        }
        else if(date1[0] < date2[0]) {
            answer = 1;
        }


        if(date1[1] > date2[1]) {
            answer = 0;
        }
        else if(date1[1] < date2[1]) {
            answer = 1;
        }


        if(date1[2] > date2[2]) {
            answer = 0;
        }
        else if(date1[2] < date2[2]) {
            answer = 1;
        }
		
		
	}

}
