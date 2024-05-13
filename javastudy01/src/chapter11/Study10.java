package chapter11;

public class Study10 {

	public static void main(String[] args) {

		//TreeSet 범위 탐색, 정렬
		//이진 탐색 트리(binary search tree)로 구현. 범위 탐색(from ~ to)과 정렬에 유리
		//이진 트리는 모든 노드가 최대 2개의 하위 노드를 갖음
		//각 요소(node)가 나무(tree)형태로 연결(LinkedList의 변형)
		/*
		 class TreeNode{
		 	TreeNode left; //왼쪽 자식노드
		 	Object element; //저장할 객체
		 	TreeNode right; //오른쪽 자식노드
		 }
		 */
		
		//이진탐색트리(binary search tree)
		//부모보다 작은 값은 왼쪽, 큰 값은 오른쪽에 저장
		//데이터가 많아질수록 추가, 삭제에 시간이 더 걸림(비교 횟수 증가)
		
		//TreeSet 데이터 저장과정 boolean add(Object o)
		//HashSet은 equals() hashCode()로 비교, TreeSet은 compare()를 호출해서 비교
		
		//TreeSet 주소 생성자와 메서드
		//TreeSet() : 기본 생성자
		//TreeSet(Collection c) : 주어진 컬렉션을 저장하는 TreeSet을 생성
		//TreeSet(Comparator comp) : 주어진 정렬기준으로 정렬하는 TreeSet을 생성
		//Object first() : 정렬된 순서에서 첫 번째 객체를 반환
		//Object last() : 정렬된 순서에서 마지막 객체를 반환
		//Object ceiling(Object o) : 지정된 객체와 같은 객체 반환. 없으면 큰 값을 가진 객체 중 가장 가까운 값을 반환. 없으면 null
		//Object floor(Object o) : 지정된 객체와 같은 객체를 반환. 없으면 작은 값을 가진 객체 중 가까운 값의 객체를 반환. 없으면 null
		//Object higher(Object o) : 지정된 객체보다 큰 값을 가진 객체 중 가까운 값의 객체를 반환. 없으면 null
		//Object lower(Object o) : 지정된 객체보다 작은 값을 가진 객체 중 가까운 값의 객체를 반환. 없으면 null
		//SortedSet subSet(Object fromElement, Object toElement) : 범위 검색(from~to 사이)의 결과를 반환
		//SortedSet headSet(Object toElement) : 지정된 객체보다 작은 값의 객체들을 반환
		//SortedSet tailSet(Object fromElement): 지정된 객체보다 큰 값의 객체들을 반환
		//+ add(), size(), remove(), isEmpty(), iterator()
		
		//트리 순회(tree traversal)
		//이진 트리의 모든 노드를 한 번씩 읽는 것
		//전위 순회, 중위 순회, 후위 순회가 있으며, 중위 순회를 하면 오름차순으로 정렬
		//레벨 순회
		
	}
	
}
