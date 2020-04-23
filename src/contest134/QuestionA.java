package contest134;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = Integer.parseInt(sc.next());
		sc.close();

		int ans = 3 * r * r;
		System.out.println(ans);
	}

}
