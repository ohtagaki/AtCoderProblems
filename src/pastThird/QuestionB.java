package pastThird;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		sc.nextLine();
		Map<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		String[] query = new String[Q];
		for(int i = 0; i < Q; i++) {
			query[i] = sc.nextLine();
		}
		sc.close();

		for(int i = 0; i < Q; i++) {
			String[] tmp = query[i].split(" ");
			int person = Integer.parseInt(tmp[1]) - 1;
			if(tmp.length == 3) {
				int que = Integer.parseInt(tmp[2]) - 1;
				if(map.get(que) == null) {
					ArrayList<Integer> list = new ArrayList<>();
					list.add(person);
					map.put(que, list);
				}else {
					map.get(que).add(person);
				}
			}else {
				int score = 0;
				for(int key : map.keySet()) {
					if(map.get(key).contains(person)) {
						score += N - map.get(key).size();
					}
				}
				System.out.println(score);
			}
		}
	}
}