package contest074;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		sc.close();
		System.out.println((int) Math.pow(N, 2) - A);
	}

}
