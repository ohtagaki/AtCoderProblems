package contest039;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double X = (double) Long.parseLong(sc.next());
		sc.close();

		double ans1 = Math.sqrt(X);
		double ans = Math.sqrt(ans1);
		System.out.println((int)ans);
	}
}
