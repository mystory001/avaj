package chapter11;

public class Study08 {
	
	public static void main(String[] args) {

		//Comparator, Comparable
		//��ü ���Ŀ� �ʿ��� �޼���(���ı��� ����)�� ������ �������̽�
		//Comparable : �⺻ ���ı����� �����ϴµ� ���(defaule)
		//Comparator : �⺻ ���ı��� �� �ٸ� �������� �����ϰ��� �� �� ���
		//����(��������, ��������) => �� ����� ���ϰ� �ڸ� �ٲ�
//		//Comparator
//		public interface Comparator{
//			int compare(Object o1, Object o2); //o1, o2 �� ��ü�� ��. 0�̸� ����, ��� o1>o2, ���� o1<o2
//		    boolean equals(Object obj); //equals�� �������̵��ؾ���
//		}    
//		//Comparable
//		public interface Comparable{
//			int compareTo(Object o); //�־��� ��ü(o)�� �ڽ�(this)�� ��
//		}
		
		//compare()�� compareTo()�� �� ��ü�� �񱳰���� ��ȯ�ϵ��� �ۼ�
//		public final class Integer extends Number implements Comparable{
//			(...����...)
//		    public int compareTo(Integer anotherInteger){
//		    	int v1 = this.value;
//		        int v2 = anotherInteger.value;
//		        return (v1 < v2 ? -1 : (v1==v2? 0 : 1)); //������ 0, ������ ���� ũ�� -1, ������ 1�� ��ȯ
//		    }
//		    (...����...)
//		}
		
		//Integer�� Comparable
//		public final class Integer extends Number implements Comparable{
//			(...����...)
//		    public int compareTo(Integer anotherInteger){
//		    	int v1 = this.value;
//		        int v2 = anotherInteger.value;
//		        return (v1 < v2 ? -1 : (v1==v2? 0 : 1)); //������ 0, ������ ���� ũ�� -1, ������ 1�� ��ȯ
//		    }
//		    (...����...)
//		}
		
//		public final class Integer extends Number implements Comparable{
//		(...����...)
//	    public int compareTo(Integer anotherInteger){
//	    	int v1 = this.value;
//	        int v2 = anotherInteger.value;
//			return thisVal - anotherVal; //���������� ��� �ݴ�� ����
//	    }
//	    (...����...)
//	}		
		
		//��������
//		static void sort(int[] inArr){ //�Һ�
//			for(int i=0;i<inArr.length-1;i++){
//		    	for(int j=0;j<intArr.length-1-i;j++){
//		        	int tmp = 0;
//		            
//		            if(intArr[j]>intArr[j+1]){ //����
//		            	tmp = intArr[j];
//		                intArr[j] = intArr[j+1];
//		                intArr[j+1] = tmp;
//		            }
//		       }
//		   }
//		}   
		//���� ���ظ� �ٲٸ� ��
		
		
	}

}
