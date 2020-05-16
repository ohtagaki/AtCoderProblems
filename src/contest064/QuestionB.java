package contest064;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		//数値型のコレクションを降順にソート
		Collections.sort(list, Collections.reverseOrder());
		int ans = list.get(0) - list.get(list.size() - 1);
		System.out.println(ans);
	}

}
