package contest063;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		for(int i = 0; i < S.length(); i++) {
			for(int j = i + 1; j < S.length(); j++) {
				if(S.charAt(i) == S.charAt(j)) {
					System.out.println("no");
					return;
				}
			}
		}
		System.out.println("yes");

	}
}
