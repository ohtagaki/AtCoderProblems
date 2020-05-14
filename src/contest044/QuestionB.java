package contest044;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		sc.close();
		Map<String, Integer> map = new HashMap<String, Integer> ();
		for(int i = 0; i < w.length(); i++) {
			String tmp = w.substring(i, i + 1);
			if(map.containsKey(tmp)) {
				//登場回数を1増やす
				int count = map.get(tmp) + 1;
				map.put(tmp, Integer.valueOf(count));
			}else {
				//初期化
				map.put(tmp, 1);
			}
		}
		boolean check = true;
		for(String key : map.keySet()) {
			if(map.get(key) % 2 != 0) {
				check = false;
			}
		}
		System.out.println(check ? "Yes" : "No");

	}
}
