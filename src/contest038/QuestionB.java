package contest038;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H1 = Integer.parseInt(sc.next());
		int W1 = Integer.parseInt(sc.next());
		int H2 = Integer.parseInt(sc.next());
		int W2 = Integer.parseInt(sc.next());
		sc.close();
		if(H1 == H2 || W1 == H2 || H1 == W2 || W1 == W2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
}
