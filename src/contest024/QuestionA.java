package contest024;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int S = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());
		sc.close();

		int sumMem = S + T;
		if(sumMem < K) {
			int ans = A * S + B * T;
			System.out.println(ans);
		}else {
			int ans  = (A - C) * S + (B - C) * T;
			System.out.println(ans);
		}
	}
}
