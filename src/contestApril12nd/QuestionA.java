package contestApril12nd;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		sc.close();

		String seven = Integer.toString(A);
		if(seven.contains("7")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
