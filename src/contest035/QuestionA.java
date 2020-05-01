package contest035;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = Integer.parseInt(sc.next());
		int H = Integer.parseInt(sc.next());
		sc.close();

		if((W % 16 == 0) && (H % 9 == 0)) {
			System.out.println("16:9");
		}else {
			System.out.println("4:3");
		}
	}
}
