package programmers;

public class ��0���� {

	public static void main(String[] args) {
		
		String n_str = "0010";
		String result = "";
		
		
		//replace�� 0�� ""�������� ��ü�ϰ� trim���� �Ϸ��� ������ �ڿ� 0�� ������ �Բ� ���Ű� ��
		//���ڿ� �յ� ���� ���� �� java.lang.String Ŭ������ trim(), strip() �޼ҵ尡 ����
		//trim() �޼ҵ�� �յ� ������ ������ ���ڿ��� ���纻�� ����
		//strip() �޼ҵ�� �ڹ� 11���� �������� ��밡���ϸ�, trim()�� ����
		//stripLeading() ���ڿ� ���� ������ ����
		//stripTrailing() ���ڿ� ���� ������ ����
		
		//���ǹ��� �̿��ؼ� charAt(i)�� 0�� �ƴϸ� result�� ��� �׷��� ������ ~~ �̷������� �ڵ� �ۼ��� �ؾ��� �� ������
		
		//���ڿ� ã��, Ư�� ���� ���� �Ǵ� ���
		//StringBuilder Ư�� ���ڿ��� ã�ų� �����ϴ� ���
//		StringBuilder sb = new StringBuilder(n_str);
//		int idx = sb.indexOf("0");
//		if(idx!=-1) {
//			sb.deleteCharAt(idx);
//		}
		
		//���� ������ ����� �־���
		result = Integer.toString(Integer.parseInt(n_str));
		System.out.println(result);
		
		//�ٸ� ����� Ǯ��1
		result = String.valueOf(Integer.parseInt(n_str));
		
		//�ٸ� ����� Ǯ��2 (���� ó�� �Ϸ��� �ߴ� ��)
		int idx = -1;
		for(int i = 0; i< n_str.length();i++) {
			if(n_str.charAt(i)>='1') {
				idx=i;
				break;
			}
			result = n_str.substring(idx);
		}

	}

}
