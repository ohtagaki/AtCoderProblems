package contest023;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		sc.close();

		int ans = X / 10 + X % 10;
		System.out.println(ans);

	}
}
