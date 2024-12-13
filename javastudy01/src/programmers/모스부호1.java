package programmers;

import java.util.HashMap;
import java.util.Map;

public class 모스부호1 {

	public static void main(String[] args) {

		String letter = ".... . .-.. .-.. ---";
		String answer = "";
		Map<String, Character> map = new HashMap();

		// a = 97, z = 122

		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
						   "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		char ch = 97;
		for (int i = 0; i < morse.length; i++, ch++) {
			map.put(morse[i], ch);
		}

		String[] letterArr = letter.split(" "); // [...., ., .-.., .-.., ---]

		for (int i = 0; i < letterArr.length; i++) {
			answer += map.get(letterArr[i]);
		}

		System.out.println(answer);
	}

}
