package chapter08;

import java.io.File;

public class Study05Ex1 {

	static File createFile(String fileName) throws Exception{
		if(fileName == null || fileName.equals(""))
			throw new Exception("파일이름이 유효하지 않습니다.");
		File file = new File(fileName); //File 클래스의 객체를 만듦
		//File 객체의 createNewFile메서드를 이용해 실제 파일을 생성
		file.createNewFile();
		return file; //생성된 객체의 참조를 반환
	}
	
	public static void main(String[] args) {
		
		try {
			File file = createFile(args[0]);
			System.out.println(file.getName() + "파일이 성공적으로 생성");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해주시기 바랍니다.");
		}

	}

}
