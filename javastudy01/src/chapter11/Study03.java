package chapter11;

public class Study03 {

	public static void main(String[] args) {
		
		//ArrayList
		//기존의 Vector를 개선한 것으로 구현원리와 기능적으로 동일
		//ArrayList 동기화처리가 되어 있지 않고, Vector는 동기화 처리가되어 있음
		//List 인터페이스를 구현하므로, 저장순서가 유지되고 중복을 허용
		//데이터의 저장공간으로 배열을 사용(배열 기반)

		//ArrayList 메서드
		//생성자
		//ArrayList() //기본생성자
		//ArrayList(Collection c)
		//ArrayList(int initialCapacity) //배열의 길이
		//※길이를 처음부터 넉넉히 잡아두는 것이 추후에 배열을 다시 만드는 것을 방지해 줄 수 있기 때문에 편리함
		//추가
		//boolean add(Object o) 
		//void add(int index, Object element)
		//boolean addAll(Collection c)
		//boolean addAll(int index, Collection c)
		//삭제
		//boolean remove(Object o)
		//Object remove(int index)
		//boolean removeAll(Collection c)
		//void clear()
		//검색
		//int indexOf(obejct o)
		//int lastIndexOf(Object o)
		//boolean contains(Object o)
		//Object get(int index)
		//Object set(int index, Object element)
		
		//List subList(int fromIndex, int toIndex)
		//Object[] toArray()
		//Object[] toArray(Object[] a)
		//boolean isEmpty()
		//void trimToSize()
		//int size()
		
		//==============================
		
		//ArrayList에 저장된 객체 삭제 과정
		//1. 삭제할 데이터 아래의 데이터를 한 칸씩 위로 복사해서 삭제할 데이터를 덮어씀
		//data[n]을 지우면 data[n+1]에서 data[n]으로 복사하고 덮어씀
		//2. 데이터가 모두 한 칸씩 이동했으므로 마지막 데이터는 null로 반환
		//data[size-1] = null
		//3. 데이터가 삭제되어 데이터의 개수가 줄었으므로 size의 값을 감소
		//size--;
		//※마지막 데이터를 삭제하는 경우에는 1의 과정(배열의 복사)은 생략
		
		//ArrayList에 저장된 첫 번째 객체부터 삭제하는 경우 => 배열 복사 발생
		//list에 있는 객체를 삭제하는 반복문
//		for(int i = 0; i< list.size(); i++){
//			list.remove(i);
//		}
		//=> 배열 복사가 일어나기 때문에 전체 객체가 삭제 안됨.
		
		//ArrayList에 저장된 마지막 객체부터 삭제하는 경우 => 배열 복사 발생 안함
//		for(int i = list.size()-1; i >= 0; i--){
//			list.remove(i);
//		}
		
	}

}
