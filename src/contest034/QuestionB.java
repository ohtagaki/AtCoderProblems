package contest034;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = Long.parseLong(sc.next());
		sc.close();

		if(n % 2 == 0) {
			System.out.println(n - 1);
		}else {
			System.out.println(n + 1);
		}
	}

}
