package contestMarine2020;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		String ans = S.substring(0, 3);
		System.out.println(ans);
	}

}
