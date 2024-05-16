package chapter12;

import java.util.ArrayList;

class TvS2T1{
	
}

class AudioS2T1{
	
}

public class Study02Test1 {
	
	public static void main(String[] args) {

		ArrayList<TvS2T1> list = new ArrayList<TvS2T1>(); //Tv 타입의 객체만 저장 가능
		list.add(new TvS2T1());
//		list.add(new AudioS2T1());
		
		TvS2T1 tvS2T1 = list.get(0);
		
	}

}
