package contest141;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		if(S.equals("Sunny")) {
			System.out.println("Cloudy");
		}else if(S.equals("Cloudy")) {
			System.out.println("Rainy");
		}else {
			System.out.println("Sunny");
		}
	}

}
