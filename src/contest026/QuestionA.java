package contest026;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		sc.close();

		if(A % 2 == 0) {
			int tmp = A / 2;
			System.out.println(tmp * tmp);
		}else {
			int tmp = A / 2;
			System.out.println(tmp * (tmp + 1));
		}

	}
}
