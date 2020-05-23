package contest112;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionB {

	/*
	解き方の方針
	アルゴリズム 1
	1. ans := ∞ とする
	2. i = 1, 2, ..., N と順に、ti ≤ T かつ ci < ans なら ans := ci とする
	3. ans = ∞ なら条件を満たす i は存在しないので TLE と出力し、そうでなければ ans を出力する

	アルゴリズム 2
	1. ti ≤ T であるような i について ci を集めた配列を cとする
	2. cが空なら TLE と出力し、そうでなければcの最小値を求めて出力する
	*/


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());
		ArrayList<Integer> cost = new ArrayList<>();
		ArrayList<Integer> time = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			cost.add(Integer.parseInt(sc.next()));
			time.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		int ansCost = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			if(time.get(i) <= T) {
				ansCost = Math.min(ansCost, cost.get(i));
			}
		}
		if(ansCost == Integer.MAX_VALUE) {
			System.out.println("TLE");
		}else {
			System.out.println(ansCost);
		}

	}
}
