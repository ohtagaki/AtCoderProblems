package contest093;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		if(S.contains("a") && S.contains("b") && S.contains("c")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
