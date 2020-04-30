package contest020;

import java.util.Scanner;

public class QuestionA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = Integer.parseInt(sc.next());
		sc.close();

		if(Q == 1) {
			System.out.println("ABC");
		}else {
			System.out.println("chokudai");
		}
	}
}
