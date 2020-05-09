package contest107;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int i = Integer.parseInt(sc.next());
		sc.close();

		System.out.println(N - i + 1);
	}
}
