package contest099;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();

		int end = b - a;
		int west = (1 + end - 1) * (end - 1) / 2;

		System.out.println(west - a);
	}

}
