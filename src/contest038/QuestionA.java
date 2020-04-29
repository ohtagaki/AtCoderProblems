package contest038;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		if(S.endsWith("T")) {
			System.out.println("YES\r\n" +
					"");
		}else {
			System.out.println("NO\r\n" +
					"");
		}
	}
}
