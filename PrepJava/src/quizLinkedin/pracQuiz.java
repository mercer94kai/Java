package quizLinkedin;

import java.util.HashMap;
import java.util.Map;

public class pracQuiz {

	public static void main(String[] args) {
			
		Map <String,Integer> map = new HashMap<>();
		map.put("Amazon", 3000);
		map.put("Apple", 3400);
		map.put("Google", 5400);
		map.put("Amazon", 9000);
		
		System.out.println(map.size());
	}

}
