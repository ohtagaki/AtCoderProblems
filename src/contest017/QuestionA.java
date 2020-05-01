package contest017;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = Integer.parseInt(sc.next());
		int e1 = Integer.parseInt(sc.next());
		int s2 = Integer.parseInt(sc.next());
		int e2 = Integer.parseInt(sc.next());
		int s3 = Integer.parseInt(sc.next());
		int e3 = Integer.parseInt(sc.next());
		sc.close();

		int ans = s1 * e1 / 10 + s2 * e2 / 10 + s3 * e3 /10;
		System.out.println(ans);
	}
}
