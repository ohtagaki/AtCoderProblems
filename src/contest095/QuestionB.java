package contest095;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionB {
	/*
	方針:まずすべての種類のドーナツを 1 個ずつ作り、
		 残ったお菓子の素で最も『安い』ドーナツを作れるだけ作る
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		for(int i = 0; i< N; i++) {
			list.add(Integer.parseInt(sc.next()));
			//全種類のドーナツを作るのに必要な素の量を算出
			sum += list.get(i);
		}
		sc.close();

		//リストを昇順にソート
		Collections.sort(list);

		//余った量を一番安いドーナツの素の量で割る
		int plus = (X - sum) / list.get(0);
		int ans = N + plus;
		System.out.println(ans);

	}

}
