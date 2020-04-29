package contest040;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		sc.close();

		int left = x - 1;
		int right = n - x;

		if(left < right) {
			System.out.println(left);
		}else {
			System.out.println(right);
		}
	}
}
