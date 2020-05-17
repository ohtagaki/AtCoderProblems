package contest031;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = Integer.parseInt(sc.next());
		int H = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		for(int i = 0; i < N; i++) {
			if(list.get(i) < L) {
				int shortTime = L - list.get(i);
				System.out.println(shortTime);
			}else if(L <= list.get(i) & list.get(i) <= H) {
				System.out.println(0);
			}else {
				System.out.println(-1);
			}
		}
	}

}
