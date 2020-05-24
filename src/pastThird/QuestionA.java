package pastThird;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		sc.close();

		if(S.equals(T)) {
			System.out.println("same");
		}else if(S.equalsIgnoreCase(T)) {
			System.out.println("case-insensitive");
		}else {
			System.out.println("different");
		}
	}

}
