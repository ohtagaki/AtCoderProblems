package contest119;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String str = S.substring(5, 7);
		sc.close();


		int month = Integer.valueOf(str);
		if(month < 5) {
			System.out.println("Heisei");
		}else {
			System.out.println("TBD");
		}
	}
}
