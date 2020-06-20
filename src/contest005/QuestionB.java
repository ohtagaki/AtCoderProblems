package contest005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int N = Integer.parseInt(sc.next());
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		Collections.sort(list);

		System.out.println(list.get(0));
	}

}
