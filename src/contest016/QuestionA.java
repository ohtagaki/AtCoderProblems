package contest016;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		sc.close();

		int check = M % D;
		if(check == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
}
