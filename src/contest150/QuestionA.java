package contest150;

import java.util.Scanner;

public class QuestionA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		sc.close();

		if(500 * K >= X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
