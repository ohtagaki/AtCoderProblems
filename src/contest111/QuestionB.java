package contest111;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		//N 以上の最小の 111 の倍数を求める
		int div = N / 111;
		for(int i = 0; i < 3; i++) {
			if(N % 111 == 0) {
				System.out.print(div);
			}else {
				System.out.print(div + 1);
			}
		}

	}
}
