package contest102;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i< N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		/*
		 数列の最大値を最小値を求め、その差を答えればよい
		*/
		//リストを降順にソート
		Collections.sort(list, Collections.reverseOrder());
		int diff = list.get(0) - list.get(N - 1);
		System.out.println(diff);
	}

}
