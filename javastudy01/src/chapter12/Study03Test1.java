package chapter12;

import java.util.ArrayList;
import java.util.List;

class ProductS3T1{}
class TvS3T1 extends ProductS3T1{}
class AudioS3T1 extends ProductS3T1{}

public class Study03Test1 {
	
	public static void printAll(ArrayList<ProductS3T1> list) {
		for(ProductS3T1 productS3T1 : list) {
			System.out.print(productS3T1);
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<ProductS3T1> productList = new ArrayList<ProductS3T1>();
		ArrayList<TvS3T1> tvList = new ArrayList<TvS3T1>();
//		ArrayList<ProductS3T1> tvList = new ArrayList<TvS3T1>(); //에러
//		List<TvS3T1> tvList = new ArrayList<TvS3T1>(); //가능. 다형성

		productList.add(new TvS3T1());
		productList.add(new AudioS3T1());
		
		tvList.add(new TvS3T1());
		tvList.add(new TvS3T1());
		
		printAll(productList);
//		printAll(tvList); //컴파일 오류 발생
		
		
	}

}
