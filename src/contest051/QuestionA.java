package contest051;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(str.substring(0, 5) + " " + str.substring(6, 13) +
				" " + str.substring(14, 19));
	}
}
