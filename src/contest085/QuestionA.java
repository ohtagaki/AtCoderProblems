package contest085;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		System.out.println(S.replaceFirst(S.substring(3, 4), "8"));
	}
}
