package contest033;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();

		if(N.startsWith("0")) {
			if(N.equals("0000")) {
				System.out.println("SAME");
			}else {
				System.out.println("DIFFERENT");
			}
		}else {
			if(N.matches("^(.)\\1{3}$")) {
				System.out.println("SAME");
			}else {
				System.out.println("DIFFERENT");
			}

		}
	}
}
