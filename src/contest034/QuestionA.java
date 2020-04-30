package contest034;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		sc.close();

		if(x < y) {
			System.out.println("Better");
		}else {
			System.out.println("Worse");
		}

	}
}
