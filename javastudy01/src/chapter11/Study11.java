package chapter11;

public class Study11 {

	public static void main(String[] args) {
		
		//HashMap, Hashtable - ����X �ߺ�(ŰX, ��O)
		//Map �������̽��� ����. �����͸� Ű�� ���� ������ ����
		//HashMap(����ȭX), Hashtable(����ȭO)�� ���ο� ����
		
		//HashMap
		//Map�������̽��� ������ ��ǥ���� �÷��� Ŭ����
		//������ �����Ϸ���, LinkedHashMapŬ������ ����ϸ� ��
		
		//TreeMap��TreeSet
		//���� �˻��� ���Ŀ� ������ �÷��� Ŭ����
		//HashMap���� ������ �߰�, ������ �ð��� �� �ɸ�(�� ����)
		

		//HashMap�� Ű(key)�� ��(value)
		//�ؽ�(hashing)������� �����͸� ����. �����Ͱ� ���Ƶ� �˻��� ����
		//Map�������̽��� ����. �����͸� Ű�� ���� ������ ����
		//Ű(key) �÷��� ���� Ű(key) �߿��� ����(ex, id)
		//��(value) Ű(key)�� �޸� �������� �ߺ��� ���(ex, pw)
		/*
		 HashMap hashMap = new HashMap();
		 hashMap.put("id1","1234");
		 hashMap.put("id2","4567");
		 hashMap.put("id2","1234");
		 	Ű	��
		 	id1 1234
		 	id2 1234(���)
		 */
		
		//�ؽ�(hashing)
		//key���� ������ �迭�� index(������ġ => hashCode)�� �˷���. ��, �ؽ��Լ��� �̿��ؼ� �����ϰ� �о� ����
		//�ؽ��Լ�(hash function)�� �ؽ����̺�(hash table)�� �����͸� ����, �˻�
		//�ؽ����̺��� �迭�� ��ũ�� ����Ʈ�� ���յ� ����(2���� �迭, ��ũ�� ����Ʈ�� �迭�� ������(������ ����)). �ؽ����̺� : �迭�� ���� ���ټ�, ��ũ�� ����Ʈ ���� ����
		//�ؽ����̺� ����� �����͸� �������� ����
		//��Ű�� �ؽ��Լ��� ȣ���ؼ� �ؽ��ڵ带 ����
		//���ؽ��ڵ�(�ؽ��Լ��� ��ȯ��)�� �����ϴ� ��ũ�� ����Ʈ�� �迭���� ã��
		//�ϸ�ũ�帮��Ʈ���� Ű�� ��ġ�ϴ� �����͸� ã��
		//���ؽ��Լ��� ���� Ű�� ���� �׻� ���� �ؽ��ڵ带 ��ȯ(���� �� �о���� ��)�ؾ���. ���� �ٸ� Ű������ ���� ���� �ؽ��ڵ带 ��ȯ�� �� ����
		
		//HashMap �ֿ� �޼���
		//�ؽ����̺� = �迭 + ��ũ�帮��Ʈ
		//HashMap() : ������
		//HashMap(int initialCapacity) : �迭 �ʱ�뷮
		//HashMap(int initialCapacity, float loadFactor) : �迭 �ʱ�뷮
		//HashMap(Map m)
		//Object put(Object key, Object value)
		//void putAll(Map m)
		//Object remove(Object key)
		//Object replace(Object key, Object value)
		//boolean replace(Object key, Object oldValue, Object newValue)
		//Set entrySet()
		//Set keySet()
		//Collection values()
		//Object get(Object key)
		//Object getOrDefault(Object key, Object defaultValue)
		//boolean containsKey(Object key)
		//boolean containsValue(Object value)
		//int size()
		//boolean isEmpty()
		//void clear()
		//Object clone()
		

	}

}
