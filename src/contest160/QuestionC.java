package contest160;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionC {

	/*
	 * 方針
	湖の周りを家によって N 個の区間に分けます。セールスマンが全ての家を訪れるとき、
	N個の区間のうち通らないものは高々 1 つです。また、N 個の区間のうち最も長いものを通らず、
	かつ、それ以外の区間をちょうど 1 度だけ通るようにしてすべての家を訪ねることができます
	*/


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		Collections.sort(list);
		int distance = Integer.MIN_VALUE;
		for(int i = 1; i < list.size(); i++) {
			int start = list.get(i - 1);
			int end = list.get(i);
			int tmpDistance = end - start;
			distance = Math.max(distance, tmpDistance);
		}
		//始点と終点の差チェック
		distance = Math.max(distance, list.get(0) + (K - list.get(N - 1)));

		int ans = K - distance;
		System.out.println(ans);

	}

}
