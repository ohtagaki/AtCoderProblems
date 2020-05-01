package contest041;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = Integer.parseInt(sc.next());
		sc.close();

		System.out.println(s.charAt(n - 1));

	}
}
