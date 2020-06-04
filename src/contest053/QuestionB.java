package contest053;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		//文字列で最初に現れるAを探す
		int checkA = 0;
		while(s.charAt(checkA) != 'A') {
			checkA++;
		}
		int startA = checkA;

		//文字列で最後に現れるZを探す
		int checkZ = s.length() - 1;
		while(s.charAt(checkZ) != 'Z') {
			checkZ--;
		}
		int lastZ = checkZ;

		int ans = lastZ - startA + 1;
		System.out.println(ans);

	}

}
