package contest129;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		sc.close();

		int halfResult = Math.min(P + Q, Q + R);
		int result = Math.min(halfResult, R + P);
		System.out.println(result);
	}
}
