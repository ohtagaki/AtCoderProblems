package contest039;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		sc.close();

		int ans = (A * B + B * C + C * A) * 2;
		System.out.println(ans);
	}
}
