package contest031;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		sc.close();

		int x = (A + 1) * D;
		int y =  A * (D + 1);
		if(x >= y) {
			System.out.println(x);
		}else {
			System.out.println(y);
		}

	}
}
