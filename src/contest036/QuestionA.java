package contest036;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		if(B % A == 0) {
			System.out.println(B / A);
		}else {
			System.out.println(B / A + 1);
		}

	}
}
