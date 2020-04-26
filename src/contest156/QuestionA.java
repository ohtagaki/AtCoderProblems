package contest156;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int R = Integer.parseInt(sc.next());
		sc.close();

		//参加回数による条件分岐
		if(N >= 10) {
			System.out.println(R);
		}else {
			//表示レーティングを用いて、内部レーティングを算出
			System.out.println(R + 100 * (10 - N));
		}
	}
}
