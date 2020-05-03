package contest056;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();

		if(a.equals(b)) {
			System.out.println("H");
		}else {
			System.out.println("D");
		}
	}
}
