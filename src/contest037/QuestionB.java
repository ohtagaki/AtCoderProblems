package contest037;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		ArrayList<Integer> left = new ArrayList<>();
		ArrayList<Integer> right = new ArrayList<>();
		ArrayList<Integer> T = new ArrayList<>();
		int[] answer = new int[N];
		for(int i = 0; i < Q; i++) {
			left.add(Integer.parseInt(sc.next()));
			right.add(Integer.parseInt(sc.next()));
			T.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		/*
		1 次元配列のある範囲に値を代入することでこの問題を解くことができる．
		まず，長さ N の１次元配列 a[] を用意する．最初，全ての要素に 0 を代入する
		 (配列を用意しただけで最初に 0 が代入されるプログラミング言語もある)．
		 Q 個の操作を順に処理していく．それぞれの処理においては，
		 配列のLi 番目から Ri 番目に for 文でループを回すことで，Ti を代入する．
		 最後に全ての要素を順に出力する．
		*/
		for(int i = 0; i < Q; i++) {
			int start = left.get(i);
			int end = right.get(i);
			for(int j = start - 1; j < end; j++) {
				answer[j] = T.get(i);
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.println(answer[i]);
		}
	}
}
