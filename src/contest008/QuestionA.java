package contest008;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());
		sc.close();
		System.out.println(T - S + 1);
	}

}
