package chapter08;

import java.io.File;

public class Study05Ex1 {

	static File createFile(String fileName) throws Exception{
		if(fileName == null || fileName.equals(""))
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		File file = new File(fileName); //File Ŭ������ ��ü�� ����
		//File ��ü�� createNewFile�޼��带 �̿��� ���� ������ ����
		file.createNewFile();
		return file; //������ ��ü�� ������ ��ȯ
	}
	
	public static void main(String[] args) {
		
		try {
			File file = createFile(args[0]);
			System.out.println(file.getName() + "������ ���������� ����");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " �ٽ� �Է����ֽñ� �ٶ��ϴ�.");
		}

	}

}
