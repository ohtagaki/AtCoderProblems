package contest168;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();

		if(S.length() <= K) {
			System.out.println(S);
		}else {
			System.out.println(S.substring(0, K) + "...");
		}
	}

}
