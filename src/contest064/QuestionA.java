package contest064;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = Integer.parseInt(sc.next());
		int g = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();

		int num = 100 * r + 10 * g + b;
		if(num % 4 == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
