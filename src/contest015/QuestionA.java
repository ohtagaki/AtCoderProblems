package contest015;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();

		if(A.length() > B.length()) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
	}
}
