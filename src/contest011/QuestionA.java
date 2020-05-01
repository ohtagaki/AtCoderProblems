package contest011;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		if(N == 12) {
			System.out.println(1);
		}else {
			System.out.println(N + 1);
		}

	}
}
