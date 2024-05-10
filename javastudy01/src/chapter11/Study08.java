package chapter11;

public class Study08 {
	
	public static void main(String[] args) {

		//Comparator, Comparable
		//객체 정렬에 필요한 메서드(정렬기준 제공)를 정의한 인터페이스
		//Comparable : 기본 정렬기준을 구현하는데 사용(defaule)
		//Comparator : 기본 정렬기준 외 다른 기준으로 정렬하고자 할 때 사용
		//정렬(오름차순, 내림차순) => 두 대상을 비교하고 자리 바꿈
//		//Comparator
//		public interface Comparator{
//			int compare(Object o1, Object o2); //o1, o2 두 객체를 비교. 0이면 같음, 양수 o1>o2, 음수 o1<o2
//		    boolean equals(Object obj); //equals를 오버라이딩해야함
//		}    
//		//Comparable
//		public interface Comparable{
//			int compareTo(Object o); //주어진 객체(o)를 자신(this)과 비교
//		}
		
		//compare()와 compareTo()는 두 객체의 비교결과를 반환하도록 작성
//		public final class Integer extends Number implements Comparable{
//			(...생략...)
//		    public int compareTo(Integer anotherInteger){
//		    	int v1 = this.value;
//		        int v2 = anotherInteger.value;
//		        return (v1 < v2 ? -1 : (v1==v2? 0 : 1)); //같으면 0, 오른쪽 값이 크면 -1, 작으면 1을 반환
//		    }
//		    (...생략...)
//		}
		
		//Integer와 Comparable
//		public final class Integer extends Number implements Comparable{
//			(...생략...)
//		    public int compareTo(Integer anotherInteger){
//		    	int v1 = this.value;
//		        int v2 = anotherInteger.value;
//		        return (v1 < v2 ? -1 : (v1==v2? 0 : 1)); //같으면 0, 오른쪽 값이 크면 -1, 작으면 1을 반환
//		    }
//		    (...생략...)
//		}
		
//		public final class Integer extends Number implements Comparable{
//		(...생략...)
//	    public int compareTo(Integer anotherInteger){
//	    	int v1 = this.value;
//	        int v2 = anotherInteger.value;
//			return thisVal - anotherVal; //내림차순의 경우 반대로 뺄셈
//	    }
//	    (...생략...)
//	}		
		
		//버블정렬
//		static void sort(int[] inArr){ //불변
//			for(int i=0;i<inArr.length-1;i++){
//		    	for(int j=0;j<intArr.length-1-i;j++){
//		        	int tmp = 0;
//		            
//		            if(intArr[j]>intArr[j+1]){ //가변
//		            	tmp = intArr[j];
//		                intArr[j] = intArr[j+1];
//		                intArr[j+1] = tmp;
//		            }
//		       }
//		   }
//		}   
		//정렬 기준만 바꾸면 됨
		
		
	}

}
