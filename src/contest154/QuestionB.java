package contest154;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		StringBuffer sb = new StringBuffer();
		sc.close();
		for(int i = 0; i < S.length(); i++) {
			sb.append('x');
		}
		System.out.println(sb.toString());
	}

}
