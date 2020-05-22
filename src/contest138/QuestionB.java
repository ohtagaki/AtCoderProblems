package contest138;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = Double.parseDouble(sc.next());
		ArrayList<Double> list = new ArrayList<>();
		for(int i = 0; i< N; i++) {
			list.add(Double.parseDouble(sc.next()));
		}
		sc.close();

		/*
		浮動小数点型を使って計算するのが簡単でしょう。
		あとは、for 文やその他の何らかの繰り返し処理を行う機構を用いて実装を行う
		*/

		double sum = 0;
		for(int i = 0; i< N; i++) {
			sum += 1 / list.get(i);
		}
		double ans = 1 / sum;
		System.out.println(ans);
	}

}
