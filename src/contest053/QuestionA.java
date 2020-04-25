package contest053;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		sc.close();

		//レートによる条件分岐
		if(x < 1200) {
			System.out.println("ABC");
		}else {
			System.out.println("ARC");
		}
	}
}
