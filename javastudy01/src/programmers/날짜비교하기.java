package programmers;

import java.time.LocalDate;
import java.util.Arrays;

public class ��¥���ϱ� {
	
	public static void main(String[] args) {

		int[] date1 = {1999,12,31};
		int[] date2 = {2000,1,1};
		
		//date 1�� date 2���� �ռ��� ��¥��� 1 �ƴ϶�� 0
		//d1 < d2, 1
		int answer = 0;
		
		//���� �ռ��� ��� : �켱���� 1
		//����� �ռ��� ��� : �켱���� 2
		//������� �ռ��� ��� : �켱���� 3
		
		System.out.println(2011+12+5);
		System.out.println(2021+1+1);
		//�̷� ��찡 �ֱ� ������ ����� ������ �ϸ� �ȵ�
		
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
		//������
		
//		if(date1[0]<date2[0] || date1[0]==date2[0]) {
//			if(date1[1]<date2[1] || date1[1]==date2[1]) {
//				if(date1[2]!=date2[2]) {
//					answer = 1;
//				}
//			}
//		}  else {
//			answer = 0;
//		}
		//�� ������
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
		//�̰͵� ������ => break���� �ۼ��ߴµ� �ȵ�. if���̶� �ݺ����� ����ؾ߰ڴٰ� ����
		
		for(int i = 0; i < date1.length; i++) {
			if(date1[i]< date2[i]) {
				answer = 1;
				break;
			} else if(date1[i]>date2[i]) {
				answer = 0;
				break;
			}
		}
		//���� if���� �ֱ���â �ø��� �ͺ��� �������̳� �Ƹ� �ӵ��� �����Ͱ���

		//�ٸ� Ǯ�� => ��¥�� ������ LocalDate
		LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
		LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);
		
		if(dateA.isBefore(dateB)) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		//�ٸ� Ǯ�� => �ڹ� 9�����̻�
		answer = Arrays.compare(date1, date2) < 0 ? 1:0;
		
		//�ٸ� Ǯ�� => ���� ó�� �Ϸ����ߴ� if��
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
